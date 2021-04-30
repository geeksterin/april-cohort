package classes.Class06;

public class Kadane {

    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,-5};

        int localSum = 0;
        int globalSum = 0;
        for (int i = 0;i<arr.length ; i++){
            localSum = localSum + arr[i];
            if(globalSum < localSum){
                globalSum = localSum;
            }
            // whether to take localsum forward or not
            if(localSum < 0){
                localSum = 0;
            }
        }
        // if all the numbers are nagetive
        if(globalSum == 0){
            globalSum = findmin(arr);
        }
        System.out.println(globalSum);
    }

    private static int findmin(int[] arr) {
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minElement > arr[i]){
                minElement = arr[i];
            }
        }
        return minElement;
    }

}
