public class Main {

    public static void main(String[] args) {
        LinkedList02 n = new LinkedList02();
        n.add(1);
        n.add(4);
        n.add(7);
        n.add(8);
        n.add(10);
        n.insert(4, 1);
        n.showAll();
        n.remove(5);
        n.tukar(0, 1);
        n.showAll();
        n.add(11);
        n.showAll();
    }
}