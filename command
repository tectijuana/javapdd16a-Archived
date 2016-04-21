public class Vehiculo
{
protected String nombre;
protected long fechaEntradaStock;
protected double precioVenta;
public Vehiculo(String nombre, long fechaEntradaStock,
double precioVenta)
{
this.nombre = nombre;
this.fechaEntradaStock = fechaEntradaStock;
this.precioVenta = precioVenta;
}
public long getTiempoEnStock(long hoy)
{
return hoy - fechaEntradaStock;
}
public void modificaPrecio(double coeficiente)
{
this.precioVenta = 0.01 * Math.round(coeficiente *
this.precioVenta * 100);
}
public void visualiza()
{
System.out.println(nombre + " precio: " + precioVenta +
" fecha entrada stock " + fechaEntradaStock);
}
}

import java.util.*;
public class SolicitudRebaja
{
protected List<Vehiculo> vehiculosEnStock =
new ArrayList<Vehiculo>();
protected long hoy;
protected long tiempoEnStock;
protected double tasaDescuento;
public SolicitudRebaja(long hoy, long tiempoEnStock,
double tasaDescuento)
{
this.hoy = hoy;
this.tiempoEnStock = tiempoEnStock;
this.tasaDescuento = tasaDescuento;
}
public void rebaja(List<Vehiculo> vehiculos)
{
vehiculosEnStock.clear();
for (Vehiculo vehiculo: vehiculos)
if (vehiculo.getTiempoEnStock(hoy) >=
tiempoEnStock)
vehiculosEnStock.add(vehiculo);
for (Vehiculo vehiculo: vehiculosEnStock)
vehiculo.modificaPrecio(1.0 - tasaDescuento);
}
public void anula()
{
for (Vehiculo vehiculo: vehiculosEnStock)
vehiculo.modificaPrecio(1.0 / (1.0 - tasaDescuento));
}
public void restablece()
{
for (Vehiculo vehiculo: vehiculosEnStock)
vehiculo.modificaPrecio(1.0 - tasaDescuento);
}
}


import java.util.*;
public class Catalogo
{
protected List<Vehiculo> vehiculosStock =
new ArrayList<Vehiculo>();
protected List<SolicitudRebaja> solicitudes =
new ArrayList<SolicitudRebaja>();
public void ejecutaSolicitudRebaja(SolicitudRebaja solicitud)
{
solicitudes.add(0, solicitud);
solicitud.rebaja(vehiculosStock);
}
public void anulaSolicitudRebaja(int orden)
{
solicitudes.get(orden).anula();
}
public void restableceSolicitudRebaja(int orden)
{
solicitudes.get(orden).restablece();
}
public void agrega(Vehiculo vehiculo)
{
vehiculosStock.add(vehiculo);
}
public void visualiza()
{
for (Vehiculo vehiculo: vehiculosStock)
vehiculo.visualiza();
}
}

public class Usuario
{
public static void main(String[] args)
{
Vehiculo vehiculo1 = new Vehiculo("A01", 1, 1000.0);
Vehiculo vehiculo2 = new Vehiculo("A11", 6, 2000.0);
Vehiculo vehiculo3 = new Vehiculo("Z03", 2, 3000.0);
Catalogo catalogo = new Catalogo();
catalogo.agrega(vehiculo1);
catalogo.agrega(vehiculo2);
catalogo.agrega(vehiculo3);
System.out.println("Visualizacion inicial del catalogo");
catalogo.visualiza();
System.out.println();
SolicitudRebaja solicitudRebaja = new SolicitudRebaja
(10, 5, 0.1);
catalogo.ejecutaSolicitudRebaja(solicitudRebaja);
System.out.println("Visualizacion del catalogo tras " +
"ejecutar la primera solicitud");
catalogo.visualiza();
System.out.println();
SolicitudRebaja solicitudRebaja2 = new SolicitudRebaja
(10, 5, 0.5);
catalogo.ejecutaSolicitudRebaja(solicitudRebaja2);
System.out.println("Visualizacion del catalogo tras " +
"ejecutar la segunda solicitud");
catalogo.visualiza();
System.out.println();
catalogo.anulaSolicitudRebaja(1);
System.out.println("Visualizacion del catalogo tras " +
"anular la primera solicitud");
catalogo.visualiza();
System.out.println();
catalogo.restableceSolicitudRebaja(1);
System.out.println("Visualizacion del catalogo tras " +
"restablecer la primera solicitud");
catalogo.visualiza();
System.out.println();
}
}
