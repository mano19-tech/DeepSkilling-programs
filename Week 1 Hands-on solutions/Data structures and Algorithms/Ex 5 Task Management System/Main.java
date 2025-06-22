//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(3, "Testing", "Not Started"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching Task ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting Task ID 2:");
        boolean deleted = taskList.deleteTask(2);
        System.out.println("Deleted: " + deleted);

        System.out.println("\nAll Tasks After Deletion:");
        taskList.traverseTasks();

    }
}