//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a model object
        Student student = new Student("101", "Alice", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create controller and connect model with view
        StudentController controller = new StudentController(student, view);

        // Display initial student data
        controller.updateView();

        // Update model data using controller
        controller.setStudentName("Bob");
        controller.setStudentGrade("A+");

        // Display updated student data
        controller.updateView();
    }
}