package Class03;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        // input finished
        long sum = 0;
        for (int i = 0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
