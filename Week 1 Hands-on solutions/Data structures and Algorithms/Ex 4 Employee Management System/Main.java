//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeManagement system = new EmployeeManagement(5);

        system.addEmployee(new Employee(1, "Guru", "Developer", 150000));
        system.addEmployee(new Employee(2, "Shabi", "Designer", 145000));
        system.addEmployee(new Employee(3, "Jackie", "Manager", 160000));

        System.out.println("All Employees:");
        system.displayAll();

        System.out.println("\nSearching for Employee with ID 2:");
        system.searchEmployee(2);

        System.out.println("\nDeleting Employee with ID 2:");
        system.deleteEmployee(2);

        System.out.println("\nAll Employees After Deletion:");
        system.displayAll();

    }
}