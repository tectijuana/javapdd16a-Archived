/**
 2  * Adapter for the company B legacy code.
 3  */
 4 
public class CompanyBAdapter implements EmployeeBrowser {
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
18     String distinguishedName = "ov1 = " + direction
19       + ", ov2 = " + division
20       + ", ov3 = " + department
21       + ", ov4 = " + service
22       + ", cn = " + firstName + lastName;
23    
24     CompanyBEmployees companyBEmployees = new CompanyBEmployees();
25 
    return companyBEmployees.getEmployee(distinguishedName);
26   }
27 }
