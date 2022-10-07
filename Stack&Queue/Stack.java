public class Stack {
    private Node first;
    private int length;

    public Stack() {
        this.first = null;
        this.length = 0;
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

    public void pushStack(int value) {
        Node pushNode = new Node(value);
        pushNode.setNext(this.first);
        this.first = pushNode;
        length++;
        System.out.println("Data yang di Push: "+pushNode.getValue());
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

    public int popSelection(int index) {
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
            if (i == length - 1) {
                System.out.print(showNode.getValue()); 
            }else{
                System.out.print(showNode.getValue()+" => ");
            }
            showNode = showNode.getNext();
        }
        System.out.println();
    }

    // public void clearData(){
    //     this.first = null;
    //     length = 0;
    // }

    public static void main(String[] args) {
        Stack newStack = new Stack();
        System.out.println("Proses Stack atau Tumpukan");
        newStack.pushStack(1); //index 4
        newStack.showData();
		newStack.pushStack(2); //index 3
        newStack.showData();
        newStack.pushStack(3); //index 2
        newStack.showData();
        newStack.pushStack(4); //index 1
        newStack.showData();
        newStack.pushStack(5); //index 0
        newStack.showData();
        System.out.println();
        newStack.pop();
        newStack.showData();
        newStack.pop();
        newStack.showData();
        newStack.pop();
        newStack.showData();
        newStack.pop();
        newStack.showData();
        newStack.pop();
        newStack.showData();
        newStack.pop();
    }
}