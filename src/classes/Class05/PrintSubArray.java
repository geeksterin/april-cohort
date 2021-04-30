package classes.Class05;

public class PrintSubArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int maxsum = 0;

        // n^3 approach
//        for (int i =0;i<arr.length;i++){
//            for (int j = i;j<arr.length;j++){
//                int sum = 0;
//                for (int k = i;k<=j;k++){
//                    sum = sum + arr[k];
//                }
//                if(sum>maxsum){
//                    maxsum = sum;
//                }
//            }
//        }
//

        // n^2
        for (int i = 0; i < arr.length; i++) {
            int curIterSum = 0;
            for (int j = i; j < arr.length; j++) {
                curIterSum = curIterSum + arr[j];
                if(curIterSum > maxsum){
                    maxsum = curIterSum;
                }
            }

        }
        System.out.println(maxsum);
    }
}
