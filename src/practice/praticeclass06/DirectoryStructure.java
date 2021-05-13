package practice.praticeclass06;

import java.util.Stack;

public class DirectoryStructure {

    public static void main(String[] args) {
        System.out.println(simplify("a/b/../c/"));
    }

    public static String simplify(String str) {
        //stack -
        String[] arr = str.split("/");
        Stack<String> stack = new Stack<>();
        for(int i=0;i<arr.length;i++) { //"a, b, .., c, "
            if(arr[i].equals("..")) {
                if(stack.isEmpty()) {
                    throw new RuntimeException("Invalid String");
                }
                stack.pop();
            } else if(!arr[i].equals("")) {
                stack.push(arr[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()) {
            sb.append("/"+stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
//stack

//c
//a



//  a/c/