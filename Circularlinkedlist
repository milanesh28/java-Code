package placement;

class Circularlinkedlist {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node prev = null;

        // If head needs to be deleted
        if (head.data == key) {
            if (head.next == head) {  // Only one node
                head = null;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                temp.next = head;
            }
            return;
        }

        // Search for node to delete
        do {
            prev = current;
            current = current.next;
        } while (current != head && current.data != key);

        if (current.data == key) {
            prev.next = current.next;
        } else {
            System.out.println("Value not found");
        }
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Circularlinkedlist list = new Circularlinkedlist();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Circular Linked List:");
        list.display();

        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();
    }
}
