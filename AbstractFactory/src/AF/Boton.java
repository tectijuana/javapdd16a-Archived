package AF;

public abstract class Boton
{
    private String texto;
    // -------------------------------
    public String getTexto() {
        return this.texto;
    }
    // -------------------------------
    public void setTexto(String texto) {
        this.texto = texto;
    }
    // -------------------------------
    public void dibujar()
    {
        System.out.println("Dibujando el boton...");
    }
    // -------------------------------
    // Método a implementar por las clases que hereden
     public abstract void configurar();
}
