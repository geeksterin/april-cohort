package classes.Class12LinkedList;

public class Client {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNodeFront(4);
        l.addAt(3,100);
//        l.print();
//        System.out.println();
//        l.removeLast();
//        l.print();
//        l.removeAt(2);
//        System.out.println();
//        l.print();
//
//        System.out.println();
//        l.reverseListRecursion();
//        l.print();

        l.addNode(20);
        ;l.addNode(30);
        l.addNode(40);
        l.print();
        System.out.println();
        System.out.println(l.findMiddle());



    }

}
