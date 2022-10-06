public class SelectionSort {
    public static Node addNode(Node head_ref, int new_data) {
        Node newNode = new Node(new_data);
        newNode.setNext(head_ref);
        head_ref = newNode;
        return head_ref;
    }

    public static Node swapNodes(Node head_ref, Node curr_node1, Node curr_node2, Node prev_node) {
        head_ref = curr_node2;
        prev_node.setNext(curr_node1);
        Node temp = curr_node2.getNext();
        curr_node2.setNext(curr_node1.getNext());
        curr_node1.setNext(temp);
        return head_ref;
    }

    public static Node Selection_Sort(Node head) {
        if (head.getNext() == null)
            return head;
        Node minNode = head;
        Node prevMin = null;
        Node ptr;
        for (ptr = head; ptr.getNext() != null; ptr = ptr.getNext()) {
            // check if current node is minimum
            if (ptr.getNext().getValue() < minNode.getValue()) {
                minNode = ptr.getNext();
                prevMin = ptr;
            }
        }
        if (minNode != head)
            head = swapNodes(head, head, minNode, prevMin);
        head.setNext(Selection_Sort(head.getNext()));
        return head;
    }

    public static Node sort(Node head_ref) {
        // linked list is empty
        if ((head_ref) == null)
            return null;

        // call Selection_Sort method to sort the linked list
        head_ref = Selection_Sort(head_ref);
        return head_ref;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.getValue() + " ");
            head = head.getNext();
        }
    }

    public static void main(String[] args) {
        Node oddList = null;

        // create linked list using addNode method
        oddList = addNode(oddList, 11);
        oddList = addNode(oddList, 1);
        oddList = addNode(oddList, 5);
        oddList = addNode(oddList, 3);
        oddList = addNode(oddList, 9);
        oddList = addNode(oddList, 7);
        // print the original list
        System.out.println("Original Linked list:");
        printList(oddList);

        // sort the linked list
        oddList = sort(oddList);

        // print the sorted list
        System.out.println("\nLinked list after sorting:");
        printList(oddList);
    }
}
