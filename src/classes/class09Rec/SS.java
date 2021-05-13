package classes.class09Rec;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SS {

    public static ArrayList<String> getSS(String s,int index){

        if(s.length() == index){
            ArrayList<String> toReturn = new ArrayList<>();
            toReturn.add("");
            return toReturn;
        }

        ArrayList<String> returnedSS = getSS(s,index+1);
        ArrayList<String> ansString = new ArrayList<>();
        char myself = s.charAt(index);
        for (int i = 0;i<returnedSS.size();i++){
            ansString.add(returnedSS.get(i));
            ansString.add(myself+returnedSS.get(i));
        }
        return ansString;
    }

    public static void main(String[] args) {
        String s = "abcde";
        ArrayList<String>  ans = getSS(s,0);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }
}
