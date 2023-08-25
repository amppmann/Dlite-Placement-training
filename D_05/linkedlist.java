import java.util.*;

public class linkedlist {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        llist llist = new llist();
        System.out.println("Enter the data : ");
        int n = sc.nextInt();
        for(int i = 0 ; i <= n ; i++){
            llist.insert(sc.nextInt());
        }
        System.out.println("\nThe elements are : ");
        llist.display();
        System.out.println("\nEnter the data that needs to be deleted : ");
        llist.delete(sc.nextInt());
        System.out.println("\nThe elements are : ");
        llist.display();
    }
}
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class llist {
    Node head;
    public llist() {
        head = null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }
    }
}