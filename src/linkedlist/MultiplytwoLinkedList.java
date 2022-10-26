package linkedlist;

public class MultiplytwoLinkedList {

    Node1 head = null;
    Node1 tail = null;
    // int size= 0;

    public static void main(String[] args) {
        // create object
        // MultiplytwoLinkedList m2ll = new MultiplytwoLinkedList();
        //
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        Node head2 = new Node(5);
        head2.next = new Node(6);

    }

    // public Node createNode(int data, Node newNode) {
    // Node p = new Node(data, null);
    // Node temp = newNode;
    // if (newNode == null) {
    // newNode = p;
    // newNode.next = null;
    // } else {

    // }
    // return newNode;
    // }

    public int multiply(Node list1, Node list2) {
        int x = 0;
        int y = 0;

        while (list1 != null) {

        }
        return x * y;
    }

    public void addLast(int data) {
        Node1 temp = head;
        if (head == null) {
            head = new Node1(data);
        } else {
            Node1 node = new Node1(data);
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }
}

class Node1 {

    int data;
    Node1 next;

    Node1(int data, Node1 next) {
        this.data = data;
        this.next = next;
    }

    Node1(int data) {
        this.data = data;
    }
}