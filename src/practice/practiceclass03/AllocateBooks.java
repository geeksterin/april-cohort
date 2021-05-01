package practice.practiceclass03;

public class AllocateBooks {

    public static void main(String[] args) {
        System.out.println(calculate(new int[]{12, 34, 67, 90}, 2));
    }

    public static int calculate(int arr[], int m) {

        if(arr.length < m) {
            return -1;
        }

        int low = Integer.MIN_VALUE;
        int high = 0;
        for(Integer a : arr) {
            high+=a;
        }

        for(Integer a : arr) {
            low = Math.max(low, a);
        }
        int result = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low+high)/2;
            if(isFeasible(arr, mid, m)) {
                result = Math.min(result, mid);
                high = mid - 1;
            } else {
                low = mid+1;
            }
        }
        return result;
    }

    public static boolean isFeasible(int arr[], int curr_min, int m) {

        int numberStudents = 1;
        int sum=0;

        for(int i=0;i<arr.length;i++) {

            if(arr[i] > curr_min)
                return false;

            if(sum + arr[i] > curr_min) {
                numberStudents++;
                sum = arr[i];

                if(numberStudents > m)
                    return false;
            } else {
                sum+=arr[i];
            }

        }
        return true;
    }
}
