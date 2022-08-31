package linkedlist;

import java.util.*;

public class SLinkedList {

    static Node head = null;
    static Node tail = null;
    static int size = 0;

    public static void main(String[] args) {
        // SLinkedList sll = new SLinkedList();
        // Scanner sc = new Scanner(System.in);
        // int data = sc.nextInt();
        addFirst(1);// add node when head is null
        addFirst(2);
        addLast(3);
        traverse();
        deleteFirst();
        deleteLast();
        traverse();
        addLast(4);
        addLast(5);
        traverse();
        // insertafter(4, 1);
        traverse();
        insertbefore(3, 5);
        traverse();
        addLast(4);
        addFirst(0);
        traverse();
        getAt(2);
        // deleteAfter(3);
        // deleteBefore(3);
        removeAtIndex(4);
        addLastUsingTail(7);
        addAtIndex(4, 8);
        // reverseLinkedList();
        traverse();
        getMidNode();
        System.out.println("Size : " + size());

    }

    private static void getMidNode() {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            System.out.println("Size is only 1");
        } else {
            int mid = size / 2;
            Node temp = head;
            for (int i = 0; i < mid; i++) {
                temp = temp.next;
            }
            System.out.println("Middle data : " + temp.data);
        }
    }

    public static void removeDuplicate() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {

        }
    }

    private static Node getNodeAt(int index) {
        Node temp = head;

        int count = 0;
        if (index == 0) {
            System.out.println("List is empty");
        } else if (index < -1 || index > size) {
            System.out.println("Invalid index");
        } else {

            while (count != index) {
                temp = temp.next;
                count++;
            }
        }
        return temp;
    }

    private static void reverseLinkedList() {
        int li = 0;
        int ri = size - 1;

        while (li < ri) {
            Node left = getNodeAt(li);
            Node right = getNodeAt(ri);
            int temp1 = left.data;
            left.data = right.data;
            right.data = temp1;
            li++;
            ri--;
        }
    }

    private static void removeAtIndex(int index) {
        Node temp = head;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (index < -1 || index > size) {
            System.out.println("Invalid index");
        } else if (index == 0) {
            deleteFirst();
        } else if (index == size - 1) {
            deleteLast();
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

    }

    private static void deleteBefore(int data) {
        Node temp = head;
        while (temp.next.next.data != data) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        size--;
    }

    private static void deleteAfter(int data) {
        Node temp = head;
        while (temp.data != data) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        size--;
    }

    // find Size
    private static int size() {
        return size;

    }

    private static void insertbefore(int newElement, int data) {
        Node newNode = new Node(newElement);
        Node temp = head;
        Node nextTemp = temp.next;
        if (!isEmpty()) {
            while (nextTemp.data != data) {
                temp = nextTemp;
                nextTemp = nextTemp.next;
                if (nextTemp == null) {
                    System.out.println("we got null value");
                    break;
                }
            }
            if (nextTemp != null) {
                newNode.next = nextTemp;
                temp.next = newNode;

                size++;
            }

        } else {
            System.out.println("Empty");
        }
    }

    private static boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
            return response;
        }
        return response;
    }

    private static void insertafter(int newElement, int data) {
        Node temp = head;
        Node newNode = new Node(newElement);
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            while (temp.data != data || temp.next != null) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }

    private static void deleteLast() {
        Node temp = head;
        if (head != null && head.next != null) {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        } else {
            System.out.println("All Nodes are already Deleted.");
        }
    }

    private static void addAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println(" Invalid index ");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    private static int getFirst() {

        if (!isEmpty()) {
            return head.data;
        } else {
            System.out.println("Empty");
            return -1;
        }

    }

    private static int getLast() {
        if (!isEmpty()) {
            return tail.data;
        } else {
            System.out.println("Empty");
            return -1;
        }

    }

    private static int getAt(int index) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        } else if (index < 0 || index > size) {
            System.out.println("List is invalid");
            return -1;
        } else {
            int count = 0;
            Node temp = head;
            while (count != index) {
                temp = temp.next;
                count++;
            }
            System.out.println("Value at index " + index + " is " + temp.data);
            return temp.data;

        }

    }

    private static void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }

    // add Last
    private static void addLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (!isEmpty()) {

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
            size++;
        } else {
            head = newNode = tail;
            size++;
        }
    }

    public static void addLastUsingTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail.next = newNode;
            head = tail = newNode;
            size++;
        } else {

            // newNode.next = tail;
            tail.next = newNode;
            tail = newNode;

            size++;
        }
    }

    // for traverse the LinkedList
    public static void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // for inserting the new Node

    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = null;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }

    }

}

class Node {
    int data;
    Node next;

    // constructor
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
    }
}
