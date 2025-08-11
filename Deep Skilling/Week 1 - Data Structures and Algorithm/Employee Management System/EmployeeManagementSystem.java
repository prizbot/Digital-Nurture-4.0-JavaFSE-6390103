public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size] = emp;
            size++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employees in the system.");
        } else {
            for (int i = 0; i < size; i++) {
                employees[i].displayEmployee();
            }
        }
    }

    public void deleteEmployee(int id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                found = true;
                System.out.println("Employee deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
