package classes.Tree;

import java.util.Stack;

public class BinaryTree {

    Node root;

    public BinaryTree(int arr[]){
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == -1){
                st.pop();
            }
            else{
                Node newNode = new Node(arr[i]);
                if(root == null){
                    root = newNode;
                    st.push(newNode);
                }
                else {
                    if(st.peek().left == null){
                        st.peek().left = newNode;
                    }
                    else {
                        st.peek().right = newNode;
                    }
                    st.push(newNode);
                }

            }
        }


    }

    public void inOrderPublic(){
        inOrder(root);
    }

    private void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void preOrderPublic(){
        preOrder(root);
    }

    private void preOrder(Node root) {

        if(root == null){
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }



}
