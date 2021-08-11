import java.util.*;

public class GenericTree {
    private class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    private Node root;
    private int size;

    public GenericTree(int[] arr) {
        Stack<Node> st = new Stack<>();
        for (int val : arr) {
            if (val == -1) {
                st.pop();
            } else {
                Node node = new Node();
                node.data = val;
                if (st.size() == 0) {
                    this.root = node;
                } else {
                    st.peek().children.add(node);
                }
                st.push(node);
                this.size++;
            }
        }
    }

    public void display(){
        display(root);
    }

    private void display(Node node){
        String s = node.data+" -> ";
        for(Node child:node.children){
            s += child.data+", ";
        }
        s+=".";
        System.out.println(s);

        for(Node child:node.children){
            display(child);
        }
    }

    public int size2() {
		return size2(root);
	}

	private int size2(Node node) {
        int size = 0;
        for(Node child:node.children){
            size+=size2(child);
        }

        return size+1;
    }

    public int max() {        
		return max(root);
	}

	private int max(Node node) {
        int max = node.data;
        for(Node child:node.children){
            int childMax = max(child);
            max = Math.max(childMax,max);
        }

        return max;
    }

	public int height() {
		return height(root);
	}

    private int height(Node node) {
        int maxHt = 0;
        for(Node child:node.children){
            int ht = height(child);
            maxHt = Math.max(maxHt, ht);
        }

        return maxHt+1;
    }

    public boolean find(int data) {
		return find(root, data);
	}

	private boolean find(Node node, int data) {

        if(node.data==data){
            return true;
        }

        for(Node child:node.children){
            boolean bl = find(child,data);
            if(bl==true){
                return true;
            }
        }        

        return false;
    }
}