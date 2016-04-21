package ClasesPrincipales;
import java.util.*;
import ClasesPrincipales.VistaVehiculo;
import ClasesPrincipales.Sujeto;
import ClasesPrincipales.Observador;
import ClasesPrincipales.Vehiculo;
public class Usuario
{  
   public static String Principal()
   {  
       Vehiculo vehiculo = new Vehiculo();
       vehiculo.setDescripcion("Vehiculo economico");
       vehiculo.setPrecio(5000.0);
       VistaVehiculo vistaVehiculo =new VistaVehiculo(vehiculo);
       vistaVehiculo.redibuja();
       vehiculo.setPrecio(4500.0);
       VistaVehiculo vistaVehiculo2 = new VistaVehiculo(vehiculo);
       vehiculo.setPrecio(5500.0);
		return "<body bgcolor=\"#CCFFFF\"><h1><marquee behavior=\"alternate\" STYLE=\"color:#990000; font-size:21pt;\">Resultados Patr&oacute;n Observer</marquee></h1><hr width=\"75%\" color=\"green\"><p><font color=\"#006600\">"+vistaVehiculo.result+"\n"+vistaVehiculo2.result+"</p></font>";
   }
}




