# pddjava
23 patrones de diseño en Java
Patrón Builder Java!


Builder:
Permite separar la construcción de objetos complejos de su implementación de modo que un cliente pueda crear estos objetos complejos con implementaciones diferentes.


Descripción:
El objetivo del patrón Builder es abstraer la construcción de objetos complejos de su implementación, de modo que un cliente pueda crear objetos complejos sin tener que preocuparse de las diferencias en su implantación.
 

Participantes:
Los participantes del patrón son los siguientes:

ConstructorAbstracto (ConstructorDocumentaciónVehículo) es la clase que define la firma de los métodos que construyen las distintas partes del producto así como la firma del método que permite obtener el producto, una vez construido.

ConstructorConcreto (ConstructorDocumentaciónVehículoHtml y ConstructorDocumentaciónVehículoPdf) es la clase concreta que implementa los métodos del constructor abstracto.

Producto (Documentación) es la clase que define el producto. Puede ser abstracta y poseer varias subclases concretas (DocumentaciónHtml y DocumentaciónPdf) en caso de implementaciones diferentes.

Director es la clase encargada de construir el producto a partir de la interfaz del constructor abstracto.


Ventajas:
Reduce el acoplamiento.

Permite variar la representación interna de estructuras compleja, respetando la interfaz común de la clase Builder.

Se independiza el código de construcción de la representación. Las clases concretas que tratan las representaciones internas no forman parte de la interfaz del Builder.

Cada ConcreteBuilder tiene el código específico para crear y modificar una estructura interna concreta.

Distintos Director con distintas utilidades (visores, parsers, etc) pueden utilizar el mismo ConcreteBuilder.

Permite un mayor control en el proceso de creación del objeto. El Director controla la creación paso a paso, solo cuando el Builder ha terminado de construir el objeto lo recupera el Director.
 

Un poco de código:

/** "Abstract Builder" */
abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() { return pizza; }
    public void crearNuevaPizza() { pizza = new Pizza(); }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}
