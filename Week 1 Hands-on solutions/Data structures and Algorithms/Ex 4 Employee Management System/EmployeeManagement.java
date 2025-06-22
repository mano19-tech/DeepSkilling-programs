public class EmployeeManagement {

        Employee[] employees;
        int size;

        public EmployeeManagement(int capacity) {
            employees = new Employee[capacity];
            size = 0;
        }

        public void addEmployee(Employee e) {
            if (size < employees.length) {
                employees[size++] = e;
                System.out.println("Employee added.");
            } else {
                System.out.println("Array is full.");
            }
        }

        public void searchEmployee(int id) {
            for (int i = 0; i < size; i++) {
                if (employees[i].employeeId == id) {
                    employees[i].display();
                    return;
                }
            }
            System.out.println("Employee not found.");
        }

        public void deleteEmployee(int id) {
            for (int i = 0; i < size; i++) {
                if (employees[i].employeeId == id) {
                    for (int j = i; j < size - 1; j++) {
                        employees[j] = employees[j + 1]; // Shift elements
                    }
                    employees[--size] = null; // Remove last
                    System.out.println("Employee deleted.");
                    return;
                }
            }
            System.out.println("Employee not found.");
        }
        public void displayAll() {
            for (int i = 0; i < size; i++) {
                employees[i].display();
            }
        }


}
