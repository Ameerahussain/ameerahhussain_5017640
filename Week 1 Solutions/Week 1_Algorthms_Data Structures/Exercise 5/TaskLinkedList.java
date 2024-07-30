public class TaskLinkedList {
    private Task head;

    public TaskLinkedList() {
        this.head = null;
    }


    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(task);
        }
    }


    public Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.getTaskId() == taskId) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }


    public void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }


    public void deleteTask(int taskId) {
        if (head == null) {
            return;
        }

        if (head.getTaskId() == taskId) {
            head = head.getNext();
            return;
        }

        Task current = head;
        while (current.getNext() != null) {
            if (current.getNext().getTaskId() == taskId) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }
}
