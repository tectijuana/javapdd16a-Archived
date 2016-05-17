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
public class Programmer extends Employee {
public Programmer(String name, double salary) {
super(name, salary);
}
@Override
public void addEmployee(Employee employee) {
// Consider throwing an exception here
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