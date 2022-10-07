public class MainClass {
    public static void main(String[] args) {
        //Stack
        StackAndQueue newSQ = new StackAndQueue();
        newSQ.showData();
        System.out.println("Proses Stack atau Tumpukan");
        newSQ.pushStack(1); //index 4
        newSQ.showData();
		newSQ.pushStack(2); //index 3
        newSQ.showData();
        newSQ.pushStack(3); //index 2
        newSQ.showData();
        newSQ.pushStack(4); //index 1
        newSQ.showData();
        newSQ.pushStack(5); //index 0
        newSQ.showData();
        System.out.println();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        System.out.println();
        newSQ.clearData();
        System.out.println("///////////////////////////////////");

        //Queue
        System.out.println("Proses Queue atau Antrian");
        newSQ.pushQueue(1); //index 0
        newSQ.showData();
        newSQ.pushQueue(2); //index 1
        newSQ.showData();
        newSQ.pushQueue(3); //index 2
        newSQ.showData();
        newSQ.pushQueue(4); //index 3
        newSQ.showData();
        newSQ.pushQueue(5); //index 4 dan seterusnya
        newSQ.showData();
        System.out.println();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
        newSQ.pop();
        newSQ.showData();
    }
}