package practice.praticeclass01;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println(trapWater(new int[]{3, 0, 2, 0, 4}));
        System.out.println(trapWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public static int trapWater(int arr[]) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0]; //arr = 3, 0, 2, 0, 4
        //left = 3
        for(int i=1; i<arr.length;i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
        right[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0;i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int water = 0;
        for(int i=0;i<arr.length;i++) {
            water+=Math.min(left[i], right[i]) - arr[i];
        }
        return water;
    }
}




//5 4 2 3 1
//1 2 3 4 5 - o(n^2)


