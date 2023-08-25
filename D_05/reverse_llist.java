import java.util.*;

public class reverse_llist {
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
        System.out.println("\nThe reversed elements are : ");
        llist.reverse(llist);
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
    llist next;
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
    public llist reverse(llist head) {
        llist prev = null;
        llist current = head;
        
        while (current != null) {
            llist nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}