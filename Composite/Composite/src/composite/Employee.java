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
import java.util.ArrayList;
import java.util.List;
public abstract class Employee {
	private List<Employee> employees;
	private String name;
	private double salary;
	public Employee(String name, double salary) {
	this.employees = new ArrayList<>();
	this.name = name;
	this.salary = salary;
	}
	public void addEmployee(Employee employee) {
	employees.add(employee);
	}
	public void removeEmployee(Employee employee) {
	employees.remove(employee);
	}
	public Employee getEmployee(int i) {
	return employees.get(i);
	}
	public int getNrEmployees() {
	return employees.size();
	}
	public String getName() {
		return name;
		}
	public double getSalary() {
		return salary;
		}
}
