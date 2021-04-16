package Class02;

public class ForLoop {

    public static void main(String[] args) {
        int n = 5;

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0;j< i ;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        for (int i = 1; i <= 5; i++) {
            // we need print some space (n-i)
            for (int j  = 0;j<n-i;j++){
                System.out.print(" ");
            }
            //we need to print some stars (2*i - 1)
            for (int k = 0; k < 2*i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
//            then print next line
        }


    }

}
