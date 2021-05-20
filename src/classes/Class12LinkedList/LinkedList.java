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

    public void addAt(int index, int data){
        if(index == 0){
            addNodeFront(data);
        }
        int currIndex = 1;
        Node temp = head;
        while(currIndex != index){
            temp = temp.next;
            currIndex++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

    }




    public void removeLast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next  = null;
    }

    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }
        Node temp = head;
        int currIndex = 1;
        while(currIndex != index){
            temp = temp.next;
            currIndex++;
        }
        temp.next = temp.next.next;

    }

    public void removeFirst() {
        head = head.next;
    }


    public void reverseLinkedList(){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public void reverseListRecursion(){
        reverse(head,null);
    }

    private void reverse(Node node,  Node prev) {
        if (node.next == null){
            head = node;
            node.next = prev;
            return;
        }
        reverse(node.next,node);
        node.next = prev;
    }


    public int findMiddle(){
        Node first = head;
        Node second = head;
        while(second.next != null && second.next.next != null){
            first = first.next;
            second = second.next.next;
        }
        if (second.next == null){
            return first.data;
        }
        else{
            return (first.data + first.next.data)/2;
        }
    }


    public void kthFromLast(int k){
        Node first = head;
        Node second = head;

        // move second pointer to k
        while (k != 0){
            second = second.next;
            k--;
        }

        // untill second is not null keep on iterating over it
        while (second != null){
            first = first.next;
            second = second.next;
        }

        // print first
        System.out.println(first.data);


    }



}
