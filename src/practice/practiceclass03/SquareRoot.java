package practice.practiceclass03;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(calculate(65));
    }

    public static int calculate(int n) {

        if(n==0 || n==1)
            return n;

        int start=1, end=n;
        int ans = -1;
        while(start <= end) {
            int mid = (start+end)/2;

            if(mid*mid == n)
                return mid;

            if(mid*mid < n) {
                start = mid+1;
                ans = mid;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
}
