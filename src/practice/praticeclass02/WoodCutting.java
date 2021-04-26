package practice.praticeclass02;

import java.util.Arrays;
import java.util.Collections;

public class WoodCutting {

    public static void main(String[] args) {

        System.out.println(getHeight(new int[]{20, 15, 17, 10}, 7));
    }

    public static int getHeight(int arr[], int b) {

        int i=0;
        int j = Integer.MIN_VALUE;
        for(int a : arr) {
            j = Math.max(a, j);
        }

        while(i < j) {

            int mid = (i+j)/2;

            if(i == mid)
                break;

            if(calculateAmount(arr, mid) < b) {
                j = mid - 1;
            } else {
                i = mid;
            }
        }
        return i;
    }

    public static int calculateAmount(int arr[], int height) {

        int result = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] - height > 0) {
                result+=arr[i] - height;
            }
        }
        return result;
    }
}
