public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee e1 = new Employee(1, "John Doe", "Manager", 75000);
        Employee e2 = new Employee(2, "Jane Smith", "Developer", 65000);
        Employee e3 = new Employee(3, "Emily Davis", "Designer", 55000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearch Employee with ID 2:");
        Employee searchedEmployee = ems.searchEmployee(2);
        System.out.println(searchedEmployee);

        System.out.println("\nDelete Employee with ID 2:");
        ems.deleteEmployee(2);

        System.out.println("All Employees After Deletion:");
        ems.traverseEmployees();
    }
}
