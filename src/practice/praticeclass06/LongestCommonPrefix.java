package practice.praticeclass06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(calculate(Arrays.asList("abcd", "abcdew", "abc")));
    }

    public static String calculate(List<String> strings) {

        strings.sort(Comparator.comparingInt(String::length));
        StringBuffer result = new StringBuffer();
        String first = strings.get(0);
        String second = strings.get(1);

        int i=0;
        while(i < first.length()) {
            if(first.charAt(i) == second.charAt(i)) {
                result.append(first.charAt(i));
                i++;
            } else {
                break;
            }
        }
        for(int k=2;k<strings.size();k++) {
            String curr = strings.get(k);
            i = 0;
            while (i<result.length()) {
                if(curr.charAt(i) == result.charAt(i)) {
                    i++;
                } else {
                    result.delete(i, result.length());
                    break;
                }
            }

        }
        return result.toString();
    }
}


// abcd, abc, abcdew
// abc, abcd, abcdew