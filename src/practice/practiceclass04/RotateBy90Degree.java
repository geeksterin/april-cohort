package practice.practiceclass04;

public class RotateBy90Degree {

    public static void main(String[] args) {
        int arr[][] = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };
        rotate(arr);
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void rotate(int arr[][]) {
        int N = arr.length;
        for(int x=0; x<N/2; x++) {


            for(int y=x;y<N-x-1;y++) {
                int temp = arr[x][y];

                arr[x][y] = arr[N-1-y][x];
                arr[N-1-y][x] = arr[N-1-y][N-1-x];
                arr[N-1-y][N-1-x] = arr[y][N-1-x];
                arr[y][N-1-x] = temp;

            }
        }

    }
}
