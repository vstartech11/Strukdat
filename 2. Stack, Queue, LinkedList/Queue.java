public class Queue {
    private Node first;
    private Node after;
    private int length;

    public Queue() {
        this.first = null;
        this.after = null;
        this.length = 0;
    }

    public boolean hasPop() {
        return first != null;
    }

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

    public void showData() {
        Node showNode = this.first;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                System.out.print(showNode.getValue()); 
            }else{
                System.out.print(showNode.getValue()+" - ");
            }
            showNode = showNode.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Proses Queue atau Antrian\n");
        Queue newQueue = new Queue();
        newQueue.pushQueue(1); //index 0
        newQueue.showData();
        newQueue.pushQueue(2); //index 1
        newQueue.showData();
        newQueue.pushQueue(3); //index 2
        newQueue.showData();
        newQueue.pushQueue(4); //index 3
        newQueue.showData();
        newQueue.pushQueue(5); //index 4 dan seterusnya
        newQueue.showData();
        System.out.println();
        newQueue.pop();
        newQueue.showData();
        newQueue.pop();
        newQueue.showData();
        newQueue.pop();
        newQueue.showData();
        newQueue.pop();
        newQueue.showData();
        newQueue.pop();
        newQueue.showData();
        newQueue.pop();
        newQueue.showData();
    }
}