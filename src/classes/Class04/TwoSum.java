package classes.Class04;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {1,4,5,8,10,15,19,21};
        int sum = 18;
        int start = 0;
        int end = arr.length-1;
        boolean isAnsFound = false;
        while (start < end){
            if(sum < arr[start] + arr[end] ){
                end--;
            }
            else if(sum > arr[start] + arr[end]){
                start++;
            }
            else{
                isAnsFound = true;
                break;
            }
        }

        if (isAnsFound == true){
            System.out.println("Ans is found");
        }
        else{
            System.out.println("Not found");
        }

    }

}
