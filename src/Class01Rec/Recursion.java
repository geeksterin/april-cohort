package Class01Rec;

public class Recursion {

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int factnminus = factorial(n-1);
        return n * factnminus;
    }

    public static void printArr(int[] arr, int index){
        if(index >= arr.length)
            return;
        System.out.println(arr[index]);
        printArr(arr,index+1);

    }

    public static void printArrInReverse(int[] arr,int index){

        if(index >= arr.length){
            return;
        }

        printArrInReverse(arr,index + 1);
        System.out.print(" " + arr[index]);

    }

    public static int power(int n){
        if(n == 0){
            return 1;
        }
        int powerNminus1 = power(n-1);
        return 2* powerNminus1;
    }

    public static int maximumElement(int[] arr,int index){

        int maxEle = maximumElement(arr,index+1);
        if(maxEle > arr[index]){
            return maxEle;
        }
        else{
            return arr[index];
        }

    }

    public static boolean findElement(int[] arr,int index,int data){

        if (index >= arr.length){
            return false;
        }
        boolean isExist = findElement(arr,index+1,data);
        return isExist || (arr[index]==data);
    }


    public static int findIndex(int[] arr,int data,int currIndex){

        if(currIndex == arr.length){
            return -1;
        }

        if(arr[currIndex] == data){
            return currIndex;
        }
        else{
            int ansIndex = findIndex(arr,data,currIndex+1);
            return ansIndex;
        }

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
//        printArr(arr,0);
        printArrInReverse(arr,0);

//        System.out.println(factorial(5));
//        System.out.println(power(5));
//        System.out.println(findIndex(arr,11,0));

    }


}
