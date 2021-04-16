package Class03;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 20;
        boolean isSumPresent = false;
        for (int i = 0;i< arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]  + arr[j] == sum){
                    isSumPresent = true;
                    break;
                }
            }
        }
        if (isSumPresent == true){
            System.out.println("Sum is there");
        }
        else{
            System.out.println("Sum is not there");
        }

    }

}
