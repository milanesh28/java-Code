package placement;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class insertatbeg {
    static Node head = null;
    public static void insertAtBeg(int data) {
        Node temp = new Node(data);
          if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }
    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
        public static void main(String[] args) {
        	insertAtBeg(10);
        	insertAtBeg(20);
        	insertAtBeg(30);
        	display();
        }
}
