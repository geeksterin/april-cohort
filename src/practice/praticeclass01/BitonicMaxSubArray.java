package practice.praticeclass01;

public class BitonicMaxSubArray {

    public static void main(String[] args) {
        System.out.println(calculate(new int[]{12, 4, 78, 90, 45, 23}));
    }

    public static int calculate(int arr[]) {

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = 1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1] < arr[i]) {
                left[i] = left[i-1] + 1;
            } else {
                left[i] = 1;
            }
        }
        right[arr.length-1] = 1;
        for(int i=arr.length-2;i>=0;i--) {
            if(arr[i+1] < arr[i]) {
                right[i] = right[i+1] + 1;
            } else {
                right[i] = 1;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            max = Math.max(max, left[i] + right[i] - 1);
        }
        return max;
    }
}

// 12, 4, 78, 90, 45, 23
//left = 1 1 2 3 1 1
//right = 2 1 1 3 2 1


//left[i] + right[i] - 1