package classes.Tree;

import com.sun.org.apache.xerces.internal.impl.dv.xs.SchemaDVFactoryImpl;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.ArrayList;
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


    public int size(){
        return size1(root);
    }

    private int size1(Node root) {
        if(root == null)
            return 0;
        int leftSubtreeSize = size1(root.left);
        int rightSubTreeSize = size1(root.right);
        return leftSubtreeSize + rightSubTreeSize + 1;
    }

    public int max(){
        return max1(root);
    }

    private int max1(Node root) {

        if(root == null){
            return Integer.MIN_VALUE;
        }

        int maxFromLeftTree = max1(root.left);
        int maxFromRightTree = max1(root.right);
        return Math.max(root.data,Math.max(maxFromLeftTree,maxFromRightTree));
    }

    public void removeLeafNode(){
        if(root.left == null && root.right == null){
            root = null;
        }
        else {
            if(root.left != null)
                removeLeafNode1(root, root.left);
            if(root.right != null)
                removeLeafNode1(root, root.right);
        }
    }

    private void removeLeafNode1(Node parent, Node root) {

        if(root == null)
            return;

        if (root.left == null && root.right == null){
            if (parent.left == root){
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }

        removeLeafNode1(root,root.left);
        removeLeafNode1(root,root.right);


    }


    public String pathNodeToRoot(int data){
        ArrayList<Integer> ar = nodeToRoot(root,data);
        String path = "";
        for (int i = ar.size()-1; i >=0 ; i--) {
            path += ar.get(i) + " --> ";
        }
        return path;
    }

    private ArrayList<Integer> nodeToRoot(Node root,int data) {


        if(root == null){
            ArrayList<Integer> mr = new ArrayList<Integer>();
            return mr;
        }

        // check myself
        if(root.data == data) {
            ArrayList<Integer> mr = new ArrayList<Integer>();
            mr.add(root.data);
            return mr;
        }

        ArrayList<Integer> left = nodeToRoot(root.left,data);
        if(left.size() != 0){
            left.add(root.data);
            return left;
        }

        ArrayList<Integer> right = nodeToRoot(root.right,data);
        if(right.size() != 0){
            right.add(root.data);
            return right;
        }

        return left;
    }


    public int height(Node root){
        if (root == null)
            return 0;
        int leftTreeHeight = height(root.left);
        int rightTreeHeight = height(root.right);
        return 1+Math.max(leftTreeHeight,rightTreeHeight);

    }


    public Boolean isTreeBalanced(Node root){


        boolean left = isTreeBalanced(root.left);
        boolean right = isTreeBalanced(root.right);

        if(left == false || right == false){
            return false;
        }

        int hLeft = height(root.left);
        int hRight = height(root.right);
        if(Math.abs(hLeft - hRight) >= 2){
            return false;
        }
        return true;
    }

    public class Pair{
        int height;
        boolean isBalanced;

        Pair(int height,boolean isBalanced){
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    public boolean isTreeBalancedImproved(){
        return isTreeBalancedImproved(root).isBalanced;
    }

    public Pair isTreeBalancedImproved(Node root){

        if(root == null){
            return new Pair(0,true);
        }

        Pair leftRes = isTreeBalancedImproved(root.left);
        Pair rightRes = isTreeBalancedImproved(root.right);
        if(leftRes.isBalanced == false || rightRes.isBalanced == false){
            return new Pair(1 + Math.max(leftRes.height , rightRes.height), false);
        }

        if(Math.abs(leftRes.height-rightRes.height) < 2){
            return new Pair(1 + Math.max(leftRes.height , rightRes.height),true);
        }

        return new Pair(1 + Math.max(leftRes.height , rightRes.height),false);

    }


    public void rightView(){
        int[] rightViewArr = new int[height(root)];
        rightView(root,rightViewArr,0);
        for (int i = 0;i< rightViewArr.length;i++)
            System.out.println(rightViewArr[i]);
    }

    private void rightView(Node root,int[] rightViewArr,int level) {

        if(root == null)
            return;

        if(rightViewArr[level] == 0)
            rightViewArr[level] = root.data;

        rightView(root.right,rightViewArr,level + 1);
        rightView(root.left,rightViewArr,level + 1);

    }


}
