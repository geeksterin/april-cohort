package practice.praticeclass02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BiggestNumber {

    public static void main(String[] args) {
        System.out.println(findBiggestNumber(Arrays.asList(548, 60, 45, 54, 546, 545)));
    }

    public static String findBiggestNumber(List<Integer> list) {

        Collections.sort(list, (Integer t1, Integer t2) -> {
            String str1 = t1.toString() + t2.toString();
            String str2 = t2.toString() + t1.toString();
            Long l1 = Long.parseLong(str1);
            Long l2 = Long.parseLong(str2);

            if(l1 < l2) {
                return 1;
            } else {
                return -1;
            }
        });

        String number = "";
        for(int i=0;i<list.size();i++) {
            number+=list.get(i);
        }
        return number;
    }

}



//merging two sorted arrays