class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class LinkedList {
    static Node head;

    // Function to retrieve data of a node at a given position
    static int nelement(int pos) {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            if (c == pos)
                return temp.data; // Return data if position matches
            c++;
            temp = temp.link;
        }

        // If position is out of range, raise an assertion error
        assert false : "Position out of range";
        return 0;
    }

    public static void main(String[] args) {
        // Example usage
        head = new Node(1);
        head.link = new Node(2);
        head.link.link = new Node(3);
        head.link.link.link = new Node(4);
        head.link.link.link.link = new Node(5);

        int position = 2; // Example position
        int data = nelement(position);
        System.out.println("Data at position " + position + " is: " + data);
    }
}
