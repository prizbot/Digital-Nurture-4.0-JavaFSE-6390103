// Main.java
public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(3, "Test Application", "Pending"));

        // Traversing tasks
        System.out.println("\nAll Tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("\nSearching for Task ID 2:");
        Task found = taskList.searchTask(2);
        if (found != null) {
            found.displayTask();
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("\nDeleting Task ID 1:");
        taskList.deleteTask(1);

        // Traversing after deletion
        System.out.println("\nTasks after deletion:");
        taskList.traverseTasks();
    }
}
