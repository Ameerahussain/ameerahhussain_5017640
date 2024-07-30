public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task t1 = new Task(1, "Task 1", "Pending");
        Task t2 = new Task(2, "Task 2", "In Progress");
        Task t3 = new Task(3, "Task 3", "Completed");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearch Task with ID 2:");
        Task searchedTask = taskList.searchTask(2);
        System.out.println(searchedTask);

        System.out.println("\nDelete Task with ID 2:");
        taskList.deleteTask(2);

        System.out.println("All Tasks After Deletion:");
        taskList.traverseTasks();
    }
}
