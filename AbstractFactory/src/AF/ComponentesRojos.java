package AF;

public class ComponentesRojos implements Componentes
{
    public ComponentesRojos() {
    }
    // -------------------------------
     public Boton getBoton() {
        return new BotonRojo();
    }
    // -----------------------
     public Lista getLista() {
        return new ListaRoja();
    }
}