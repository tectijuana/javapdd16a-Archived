/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author JoseLuis
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
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
    

