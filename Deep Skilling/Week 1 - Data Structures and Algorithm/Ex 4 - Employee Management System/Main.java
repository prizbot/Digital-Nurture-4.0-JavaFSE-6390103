public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(101, "Alice", "Developer", 75000));
        ems.addEmployee(new Employee(102, "Bob", "Manager", 90000));
        ems.addEmployee(new Employee(103, "Charlie", "Designer", 65000));

        System.out.println("\nAll Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 102:");
        Employee found = ems.searchEmployee(102);
        if (found != null) {
            found.displayEmployee();
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee with ID 101:");
        ems.deleteEmployee(101);

        System.out.println("\nEmployees after deletion:");
        ems.traverseEmployees();
    }
}
