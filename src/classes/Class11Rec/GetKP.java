package classes.Class11Rec;

import java.util.ArrayList;

public class GetKP {


    public static void printSS(String str,int index,String currAns){

        if(str.length() == index){
            System.out.println(currAns);
            return;
        }

        printSS(str,index+1,currAns);
        printSS(str,index+1,currAns+str.charAt(index));

    }


    public static ArrayList<String> getKp(String str,int index){

        if (str.length() == index){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        char ch = str.charAt(index);
        int charTOInt = ch - '0';
        
        ArrayList<String> rr = getKp(str,index+1);
        ArrayList<String> mr = new ArrayList<>();
        
        String choices = getChoice(charTOInt);

        for (int i = 0; i < choices.length(); i++) {
            for (int j = 0;j<rr.size();j++){
                mr.add(choices.charAt(i) + rr.get(j));
            }
        }
        
        return mr;
    }


    public static void printKP(String str,int index, String currResult){
        if(index == str.length()){
            System.out.println(currResult);
            return;
        }
        char in = str.charAt(index);
        int intIn = in - '0';
        String choices  = getChoice(intIn);
        for (int i = 0; i < choices.length(); i++) {
            printKP(str, index+1, currResult+choices.charAt(i));
        }
    }


    public static String getChoice(int k){

        String[] strArr = {",;","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
        return strArr[k];

    }


    public static void main(String[] args) {
//        ArrayList<String> ans = getKp("123",0);
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.println(ans.get(i));
//        }

//        printKP("123",0,"");

        printSS("abc",0,"");

    }

}
