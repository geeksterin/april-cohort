package Class02;

public class nCrfunction {

    public static int factorial(int num){
        int numfact = 1;
        for (int i = 1;i<=num;i++){
            numfact = numfact*i;
        }
        return numfact;
    }


    public static void main(String[] args) {

        int n = 5;
        int r = 2;
        System.out.println(factorial(n)/(factorial(n-r)*factorial(r)));
    }
}
