/**
 2  * Adapter for the company A legacy code.
 3  */
 4 
public class CompanyAAdapter implements EmployeeBrowser {
 5   /**
 6    * Retrieve the employee information.
 7    *
 8    * @param direction The employee direction.
 9    * @param division The employee division.
10    * @param department The employee department.
11    * @param service The employee service.
12    * @param firstName The employee firstName.
13    * @param lastName The employee lastName.
14    *
15    * @return The employee object.
16    */
17 
  public Employee getEmployee(String direction, String division, String department, String service, String firstName, String lastName) {
18     String distinguishedName = "SELECT *"
19       + " FROM t_employee as employee"
20       + " WHERE employee.company= 'COMPANY A'"
21       + " AND employee.direction = " + direction
22       + " AND employee.division = " + division
23       + " AND employee.department = " + department
24       + " AND employee.service = " + service
25       + " AND employee.firstName = " + firstName
26       + " AND employee.lastName = " + lastName;
27    
28     CompanyAEmployees companyAEmployees = new CompanyAEmployees();
29 
    return companyAEmployees.getEmployee(distinguishedName);
30   }
31 }
