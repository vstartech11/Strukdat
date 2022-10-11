public class Main {

    public static void main(String[] args) {
        LinkedList01 n = new LinkedList01();
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

        LinkedList02 m = new LinkedList02();
        m.add(1);
        m.add(4);
        m.add(7);
        m.add(8);
        m.add(10);
        m.insert(4, 1);
        m.showAll();
        m.remove(5);
        m.tukar(0, 1);
        m.showAll();
        m.add(11);
        m.showAll();
    }
}