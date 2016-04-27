package AF;

public class Cliente
{
    public Cliente( Componentes style )
    {
        Boton boton = style.getBoton();
        boton.dibujar();

        Lista lista = style.getLista();
        lista.dibujar();
    }
}
