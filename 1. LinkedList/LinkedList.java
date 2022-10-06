public class LinkedList {
    private Node first;
    private int length = 0;

    public void showAll() {
        while (first != null) {
            System.out.print(first.getValue() + " ");
            first = first.getNext();
        }
    }

    public LinkedList() {
        this.first = null;

    }

    public void add(String value) {
        Node temp = new Node(value);
        if (this.first == null) {
            this.first = temp;
        } else {
            temp.setNext(first);
            first = temp;
        }
        length++;
    }

    public Node searchNode(int index) {
        Node currentNode = this.first;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void insert(String value, int index) {
        if (index > length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = new Node(value);
        if (0 == index) {
            temp.setNext(first);
            first = temp;
        } else {
            Node SNode = searchNode(index);
            temp.setNext(SNode.getNext());
            SNode.setNext(temp);
        }
        length++;
    }

    public void remove(int index) {
        if (index > length || index < 0) {
            // showAll();
            System.out.println("Data yang dihapus tidak ada");
        } else {
            Node temp;
            if (index == 0) {
                temp = this.first.getNext();
                first = temp;
            } else {
                temp = searchNode(index);
                temp.setNext(temp.getNext().getNext());
            }
        }
    }

    public void tukar(int index1, int index2) {
        if (length > index1 && length > index2 && index1 >= 0 && index2 >= 0) {
            Node temp1 = searchNode(index1 + 1), temp2 = searchNode(index2 + 1);
            insert(temp2.getValue(), index1);
            remove(index1 + 1);
            insert(temp1.getValue(), index2);
            remove(index2 + 1);
        } else {
            throw new IndexOutOfBoundsException();
        }

    }
}