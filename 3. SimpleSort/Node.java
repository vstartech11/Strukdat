public class Node {
    private int value;
    private Node next, prev;

    public Node(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getPrev() {
        return this.prev;
    }

    public int getValue() {
        return this.value;
    }
}
