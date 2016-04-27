package AF;

public class ComponentesAzules implements Componentes
{
    public ComponentesAzules() {
    }
    // -------------------------------
     public Boton getBoton() {
        return new BotonAzul();
    }
    // -------------------------------
     public Lista getLista() {
        return new ListaAzul();
    }
}