##Composite
El patrón Composite sirve para construir objetos complejos a partir de otros más simples y similares entre sí, gracias a la composición recursiva y a una estructura en forma de árbol.

Esto simplifica el tratamiento de los objetos creados, ya que al poseer todos ellos una interfaz común, se tratan todos de la misma manera. Dependiendo de la implementación, pueden aplicarse procedimientos al total o una de las partes de la estructura compuesta como si de un nodo final se tratara, aunque dicha parte esté compuesta a su vez de muchas otras. Un claro ejemplo de uso extendido de este patrón se da en los entornos de programación 2D para aplicaciones gráficas. Un videojuego puede contener diferentes capas "layers" de sprites (como una capa de enemigos) pudiéndose invocar un método que actúe sobre toda esta capa de sprites a la vez (por ejemplo, para ocultarlos, darles un filtro de color etc.).

![composite](https://upload.wikimedia.org/wikipedia/commons/b/be/Uml_composite.png)

###Codigo 

Clase Programmer

    public class Programmer extends Employee {
    public Programmer(String name, double salary) {
    super(name, salary);
    }
    @Override
    public void addEmployee(Employee employee) {
    }
    @Override
    public void removeEmployee(Employee employee) {
    }
    @Override
    public Employee getEmployee(int i) {
    return null;
    }
    @Override
    public int getNrEmployees() {
    return 0;
    }
    }

Clase Manager

    public class Manager extends Employee {
    public Manager(String name, double salary) { super(name, salary); }
    }

Clase Employee

    import java.util.ArrayList;
    import java.util.List;
    public abstract class Employee 
      {
        private List<Employee> employees;
        private String name;
        private double salary;
        public Employee(String name, double salary) {
        this.employees = new ArrayList<>();
        this.name = name;
        this.salary = salary;
      }
    
    public void addEmployee(Employee employee) 
      {
        employees.add(employee);
      }
    
    public void removeEmployee(Employee employee) 
      {
        employees.remove(employee);
      }
    
    public Employee getEmployee(int i) 
      {
        return employees.get(i);
      }
    
    public int getNrEmployees() 
      {
        employees.size();
      }
    
    public String getName() 
      {
		    return name;
			}
		
		public double getSalary() 
		{
			return salary;
		}
		}

Clase Composite (Main)

    public class Composite {
    public static void main(String[] args) {
    
		Employee programmerAimee = new Programmer("Aimee", 16000);
		Employee programmerBart = new Programmer("Bart", 15000);
		Employee programmerSeppe = new Programmer("Seppe", 14000);
		Employee managerJane = new Manager("Jane", 30000);
		Employee managerWiley = new Manager("Wiley", 35000);
		managerWiley.addEmployee(managerJane);
		managerWiley.addEmployee(programmerBart);
		managerJane.addEmployee(programmerAimee);
		managerJane.addEmployee(programmerSeppe);
		showOrganigram(managerWiley);
		}
		public static void showOrganigram(Employee e) {
		showOrganigram(e, 1);
		}
		private static void showOrganigram(Employee e, int level) {
		// Recursive function, show employee
		System.out.format("%"+(level*2)+"s - %s, " +
		"earning %s", "", e.getName(), e.getSalary());
		if (e.getNrEmployees() > 0)
		System.out.format(" manages %s employees:", e.getNrEmployees());
		System.out.println();
		for (int i = 0; i < e.getNrEmployees(); i++) {
		showOrganigram(e.getEmployee(i), level+1);
		}
		}
    }

###Resultado

- Wiley, earning 35000.0 manages 2 employees:
  - Jane, earning 30000.0 manages 2 employees:
    - Aimee, earning 16000.0
    - Seppe, earning 14000.0
  - Bart, earning 15000.0
