public class LinkedList{
    private Node first, last;
    private int length = 0;

    public void showAll() {
        Node cFirst = first;
        while (cFirst != null) {
            System.out.print(cFirst.getValue() + " ");
            cFirst = cFirst.getNext();
        }
        System.out.println("\n");
    }

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void add(int value) {
        Node temp = new Node(value);
        if (this.first == null) {
            this.first = temp;
        } else {
            temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
    }

    public Node searchNode(int index) {
        Node currentNode = this.first;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void insert(int value, int index) {
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

    public void swap(int index1, int index2) {
        if (length > index1 && length > index2 && index1 >= 0 && index2 >= 0) {
            Node temp1, temp2;
            if (index1 < index2) {
                temp1 = searchNode(index1);
                temp2 = searchNode(index2 + 1);
            } else {
                temp2 = searchNode(index1 + 1);
                temp1 = searchNode(index2);
            }
            if (temp1 == this.first) {
                this.first = temp2;
            } else if (temp2 == this.first) {
                this.first = temp2;
            }

            if (temp1 == this.last) {
                this.last = temp2;
            } else if (temp2 == this.last) {
                this.last = temp2;
            }
            Node tempNode = temp1.getNext();
            temp1.setNext(temp2.getNext());
            temp2.setNext(tempNode);

            if (temp1.getNext() != null) {
                temp1.getNext().setPrev(temp1);
            }
            if (temp2.getNext() != null) {
                temp2.getNext().setPrev(temp2);
            }

            tempNode = temp1.getPrev();
            temp1.setPrev(temp2.getPrev());
            temp2.setPrev(tempNode);

            if (temp1.getPrev() != null) {
                temp1.getPrev().setNext(temp1);
            }
            if (temp2.getPrev() != null) {
                temp2.getPrev().setNext(temp2);
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}