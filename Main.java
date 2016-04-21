import static javax.measure.unit.SI.KILOGRAM;
import javax.measure.quantity.Mass;
import org.jscience.physics.model.RelativisticModel;
import org.jscience.physics.amount.Amount;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;

import ClasesPrincipales.Usuario;

public class Main {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

   get("/hello", (req, res) -> {
      RelativisticModel.select();
	  String energy = System.getenv().get("ENERGY");
      Amount<Mass> m = Amount.valueOf(energy).to(KILOGRAM);
      return "E=mc^2: "+energy+" = " + m.toString()+"\n<H1 STYLE=\"COLOR:#33ff66\">TRABAJO HECHO POR GERMAN VERDOZA</H1>";
    });
	get("/test",(req,res)->{
return "<marquee behavior=\"alternate\" STYLE=\"color:#006600; font-size:18pt;\">Texto movil de German Verdoza</marquee>";
});
get("/Observer",(req,res)->{
	ArrayList<String> output = new ArrayList<String>();
	String Texto="";
	Texto+="<body bgcolor=\"#CCFFFF\"><h1><marquee behavior=\"alternate\" STYLE=\"color:#990000; font-size:21pt;\">Patr&oacute;n Observer</marquee></h1><hr width=\"75%\" color=\"green\">";
	Texto+="<p><font color=\"#006600\">El patr&oacute;n Observer tiene como objetivo construir una dependencia entre un sujeto y los observadores de modo que cada modificación del sujeto sea notificada a los observadores para que puedan actualizar su estado.</p></font>";
Texto+="<p><h2 STYLE=\"color:#000099;\">Diagrama UML</h2><hr width=\"75%\" color=\"green\" align=\"left\"><br><img src=\"http://i1156.photobucket.com/albums/p567/German_Verdoza_Glez/UML_zpsni1oorhi.png?t=1460936419\"  title=\"Diagrama UML\">";
Texto+="<p><font color=\"#006600\">El diagrama contiene las cuatro clases siguientes:<br><ul STYLE=\"color:#990000; list-style-type:hiragana;\"><li><strong>Sujeto</strong> es la clase abstracta que incluye todo objeto que notifica a los demás objetos de las modificaciones en su estado interno.</li>";
Texto+="<li><strong>Vehículo</strong> es la subclase concreta de Sujeto que describe a los vehículos. Gestiona dos atributos: descripción y precio.</li>";
Texto+="<li><strong>Observador</strong> es la interfaz de todo objeto que necesite recibir las notificaciones de cambio de estado provenientes de los objetos a los que se ha inscrito previamente. </li>";
Texto+="<li><strong>VistaVehículo</strong> es la subclase concreta correspondiente a la implementación de Observador cuyas instancias muestran la información de un vehículo.</li></ul></p>";
Texto+="<p>El funcionamiento es el siguiente: <br>Cada nueva vista se inscribe como observador de su vehículo mediante el método agrega . Cada vez que la descripción o el precio se actualizan, se invoca el método notifica . Éste solicita a todos los observadores que se actualicen, invocando a su método actualiza . En la clase VistaVehículo , éste último método se llama redibuja .</p></font>";
Texto+="<h2 STYLE=\"color:#000099;\">Dominios de aplicación</h2><hr width=\"75%\" color=\"green\" align=\"left\"><p><font color=\"#006600\">El patrón se utiliza en los casos siguientes:<br><ul style=\"color:#990000; list-style-type:katakana;\"><li>Una modificación en el estado de un objeto genera modificaciones en otros objetos que se determinan dinámicamente.</li>";
Texto+="<li>Un objeto quiere avisar a otros objetos sin tener que conocer su tipo, es decir sin estar fuertemente acoplado a ellos.</li>";
Texto+="<li>No se desea fusionar dos objetos en uno solo.</li></ul></p></font>";
	return Texto;
});
get("/Patron",(req,res)->{
	
	return Usuario.Principal();
});
    get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());

    get("/db", (req, res) -> {
      Connection connection = null;
      Map<String, Object> attributes = new HashMap<>();
      try {
        connection = DatabaseUrl.extract().getConnection();

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
        stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
        ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

        ArrayList<String> output = new ArrayList<String>();
        while (rs.next()) {
          output.add( "Read from DB: " + rs.getTimestamp("tick"));
        }

        attributes.put("results", output);
        return new ModelAndView(attributes, "db.ftl");
      } catch (Exception e) {
        attributes.put("message", "There was an error: " + e);
        return new ModelAndView(attributes, "error.ftl");
      } finally {
        if (connection != null) try{connection.close();} catch(SQLException e){}
      }
    }, new FreeMarkerEngine());

  }

}
