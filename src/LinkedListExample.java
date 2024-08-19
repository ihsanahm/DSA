class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    Node head;

    // Method to insert a new node at the end
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();

        // Adding elements to the linked list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        // Displaying the linked list
        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> null
    }
}
