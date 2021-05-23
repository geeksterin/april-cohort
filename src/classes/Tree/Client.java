package classes.Tree;

public class Client {

    public static void main(String[] args) {

        int[] arr = {1,2,4,-1,5,-1,-1,3,6,-1,7,-1,-1,-1};

        BinaryTree bt = new BinaryTree(arr);

        bt.preOrderPublic();

    }

}
