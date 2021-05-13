package practice.practiceclass03;

public class RotatedAndSorted {

    public static void main(String[] args) {
        System.out.println(calculate(new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 6, 2));
    }

    public static int calculate(int arr[], int low, int high, int B) {

        if(low > high)
            return -1;

        int mid = (low+high)/2;

        if(arr[mid] == B)
            return mid;
        if(arr[low] <= arr[mid]) {
            if (arr[low] <= B && arr[mid] > B)
                return calculate(arr, low, mid - 1, B);

            return calculate(arr, mid+1, high, B);
        }

        if(B > arr[mid] && B <=arr[high])
            return calculate(arr, mid+1, high, B);

        return calculate(arr, low, mid - 1, B);
    }
}
