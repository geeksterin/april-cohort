package practice.practiceclass04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrderMatrix {

    public static void main(String[] args) {
        System.out.println(spiral(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9))));
    }

    public static ArrayList<Integer> spiral(List<List<Integer>> matrix) {

        boolean manipulator = true;
        ArrayList arrayList = new ArrayList<Integer>();
        for(List<Integer> row : matrix) {
            if(manipulator) {
                for(int i=0;i<row.size();i++) {
                    arrayList.add(row.get(i));
                }
            } else {
                for(int i=row.size()-1;i>=0;i--) {
                    arrayList.add(row.get(i));
                }
            }
            manipulator = !manipulator;
        }

        return arrayList;
    }
}
