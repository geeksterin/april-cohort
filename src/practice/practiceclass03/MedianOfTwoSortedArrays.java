package practice.practiceclass03;

import java.util.ArrayList;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println(calculateMedian(new int[]{1, 2, 3, 6}, new int[]{4, 6, 8, 10}, 0, 0, 3, 3));
    }

    public static int calculateMedian(int arr1[], int arr2[], int startA, int startB, int endA, int endB) {


        if(endA - startA == 1) {
            return (Math.max(arr1[startA], arr2[startB]) + Math.min(arr1[endA], arr2[endB]))/2;
        }


        int m1 = median(arr1, startA, endA);
        int m2 = median(arr2, startB, endB);

        if(m1 == m2)
            return m1;

        if(m1 < m2) {
            return calculateMedian(arr1, arr2, (endA + startA + 1)/2, startB, endA, (endB + startB + 1)/2);
        } else {
            return calculateMedian(arr1, arr2, startA, (endB + startB + 1)/2, (endA + startA + 1)/2, endB);
        }

    }

    public static int median(int arr[], int start, int end) {
        int n = end - start + 1;
        if(n%2==0)
            return (arr[start + (n/2)] + arr[start + (n/2-1)])/2;
        else
            return arr[start + n/2];
    }
}
