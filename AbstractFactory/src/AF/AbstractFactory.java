package AF;

public class AbstractFactory
{
    public static void main(String[] args)
    {
        // Se insertarán los componentes con el borde azul
         Cliente cliente = new Cliente( new ComponentesAzules() );
        System.out.println("---------------------------------");
        // Ahora se insertarán los componentes con el borde rojo
         cliente = new Cliente( new ComponentesRojos() );
    }
}
