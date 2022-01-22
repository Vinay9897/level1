package queue;

public class QueueImplementation {

    private static ListNode front;
    private static ListNode rear;
    private static int size;

    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            // this.next = next;
        }
    }

    public QueueImplementation() {
        front = null;
        rear = null;
        size = 0;
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(10);
        enqueue(30);
        traverse();
        dequeue();
        traverse();
        dequeue();
        traverse();
        size();
        peek();
        isEmpty();
    }

    private static boolean isEmpty() {
        return front == null;
    }

    private static void peek() {
        if (!isEmpty()) {
            System.out.println("front : " + front.data);
        } else {
            System.out.println("list is empty");
        }
    }

    private static int size() {
        return size;
    }

    private static void dequeue() {
        if (!isEmpty()) {
            front = front.next;
            size--;
        } else {
            System.out.println("List is empty");
        }
    }

    private static void traverse() {
        ListNode temp = rear;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(" null ");
    }

    private static void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            rear = temp;
            front = rear;
            size++;
        } else {
            temp.next = rear;
            rear = temp;
            front = rear;
            size++;
        }
    }
}
