public class StackAndQueue {
    private Node first, after;
    private int length = 0;

    public StackAndQueue() {
        this.first = null;
        this.after = null;
    }

    public Node find(int index) {
        Node findNode = this.first;
        for (int i = 0; i < index; i++) {
            findNode = findNode.getNext();
        }
        return findNode;
    }

    public boolean hasPop() {
        return first != null;
    }

    //Push Stack
    public void pushStack(int value) {
        Node pushNode = new Node(value);
        pushNode.setNext(this.first);
        this.first = pushNode;
        length++;
        System.out.println("Data yang di Push: "+pushNode.getValue());
    }

    //Push Queue
    public void pushQueue(int value) {
        Node pushNode = new Node(value);
        if(first == null) {
            first = pushNode;
            after = pushNode;
            length++;
            System.out.println("Data yang di Push: "+pushNode.getValue());
        } else {
            after.setNext(pushNode);
            after = pushNode;
            length++;
            System.out.println("Data yang di Push: "+pushNode.getValue());
        }
    }

    //Pop
    public int pop() {
        if (hasPop()) {
            Node temp = this.first;
            this.first = temp.getNext();
            length--;
            System.out.println("Data yang di Pop: "+temp.getValue());
            return temp.getValue();
        } else if (hasPop() == false) {
            System.out.println("Data sudah kosong tidak bisa di Pop");
        }
        return 0;
    }

    //Pop Proses
    public int pop(int index) {
        if (index <= this.length && hasPop()) {
            Node popNode;
            popNode = this.find(index - 1);
            int temp = popNode.getNext().getValue();
            popNode.setNext(popNode.getNext().getNext());
            length--;
            return temp;
        } else {
            return 0;
        }
    }

    public void showData() {
        Node showNode = this.first;
        for (int i = 0; i < length; i++) {
            System.out.print(+showNode.getValue() + " ");
            showNode = showNode.getNext();
        }
        System.out.println();
    }

    public void clearData(){
        this.first = null;
        length = 0;
    }
}