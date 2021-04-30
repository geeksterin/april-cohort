package practice.praticeclass02;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(mergerSortedArrays(new int[]{3, 4, 20}, new int[]{1, 2})));

    }

    public static int[] mergerSortedArrays(int arr1[], int arr2[]) {

        int i=0,j=0,k=0;
        int res[] = new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length) {
            int first = arr1[i];
            int second = arr2[j];

            if(first < second) {
                res[k] = first;
                i++;
            } else {
                res[k] = second;
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            res[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            res[k] = arr2[j];
            k++;
            j++;
        }
        return res;
    }
}

// 3 4 20
// 1 2