package ClasesPrincipales;
import java.util.*;
import ClasesPrincipales.Observador;

public class VistaVehiculo implements Observador  
{  
   protected Vehiculo vehiculo;  
   protected String texto = "<body bgcolor=\"#CCFFFF\"><h1><marquee behavior=\"alternate\" STYLE=\"color:#990000; font-size:21pt;\">Resultados Patr&oacute;n Observer</marquee></h1><hr width=\"75%\" color=\"green\"><p><font color=\"#006600\">";  
   public String result="";
   public VistaVehiculo(Vehiculo vehiculo)  
   {  
       this.vehiculo = vehiculo;  
       vehiculo.agrega(this);  
       actualizaTexto();  
   }  
  
   protected void actualizaTexto()  
   {  
       texto = "Descripcion " + vehiculo.descripcion +  " Precio: " + vehiculo.precio;  
   }  
  
   public void actualiza()  
   {  
       actualizaTexto();  
       this.redibuja();  
   }  
  
   public void redibuja()  
   {  
       System.out.println(texto);
		result+=texto;  
		result+="<br>";
   }  
}
