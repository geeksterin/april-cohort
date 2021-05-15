package classes.Class12LinkedList;

public class LinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node head;

    public void addNode(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
    }

    public void addNodeFront(int d){
        Node newNode = new Node(d);
        System.out.println(newNode.data + " " + newNode.next);
        // whether linkedlist is empty or not
        if (head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }



}
