package Class02;

public class Pattern2 {

    public static void printspace(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void print1_to_i(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
    }

    public static void print_iMinus1_to_1(int n){
        for (int i = n-1; i >= 1 ; i--) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= 5; i++) {
            printspace(n-i);
            print1_to_i(i);
            print_iMinus1_to_1(i);
            System.out.println();
        }

    }

}
