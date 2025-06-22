

    class Node {

        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public class TaskLinkedList {
        private Node head;

        // Add task at end
        public void addTask(Task task) {
            Node newNode = new Node(task);
            if (head == null) {
                head = newNode;
                return;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        // Search task by ID
        public Task searchTask(int taskId) {
            Node curr = head;
            while (curr != null) {
                if (curr.task.taskId == taskId) {
                    return curr.task;
                }
                curr = curr.next;
            }
            return null;
        }

        // Delete task by ID
        public boolean deleteTask(int taskId) {
            if (head == null) return false;
            if (head.task.taskId == taskId) {
                head = head.next;
                return true;
            }
            Node curr = head;
            while (curr.next != null) {
                if (curr.next.task.taskId == taskId) {
                    curr.next = curr.next.next;
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }

        // Traverse and display all tasks
        public void traverseTasks() {
            Node curr = head;
            while (curr != null) {
                System.out.println(curr.task);
                curr = curr.next;
            }
        }
    }


