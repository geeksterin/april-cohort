package classes.Tree;

public class BST {

    public Node root;
    public BST(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            insertElement(arr[i]);
        }
    }

    private void insertElement(int i) {
        if(root == null){
            Node temp = new Node(i);
            root = temp;
            return;
        }

        Node temp = root;
        Node parent = null;
        while(temp != null){
            if (temp.data <= i){
                parent = temp;
                temp = temp.left;
            }
            else {
                parent = temp;
                temp = temp.right;
            }
        }

        if (parent.data <= i){
            parent.left = new Node(i);
        }
        else{
            parent.right = new Node(i);
        }

    }

}
