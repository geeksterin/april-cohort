package Class07;

import java.util.Arrays;
import java.util.Comparator;

class compareNumAsString implements Comparator<Integer> {

    public int compare(Integer a,Integer b){
        String s1 = a.toString();
        String s2 = b.toString();
        return (s2+s1).compareTo(s1+s2);
    }
}


public class Sorting {

    public static void main(String[] args) {

        Integer[] arr = {555,5551,111,132,4444,1230};
        Arrays.sort(arr, new compareNumAsString());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

}
