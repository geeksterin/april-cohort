package practice.praticeclass01;

public class StockSpan {

    public static void main(String[] args) {
        System.out.println(calculateMaxProfit(new int[]{100, 180, 260, 310, 40, 535, 695}));
    }

    public static int calculateMaxProfit(int arr[]) {
        int minArr[] = new int[arr.length];
        minArr[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
            minArr[i] = Math.min(arr[i], minArr[i-1]);
        }

        int max = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++) {
            max = Math.max(max, arr[i] - minArr[i]);
        }
        return max;
    }
}
