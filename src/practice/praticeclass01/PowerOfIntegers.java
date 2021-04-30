package practice.praticeclass01;

public class PowerOfIntegers {

    public static void main(String[] args) {

        System.out.println(checkPower(1024));

    }

    public static boolean checkPower(int n) {
        for(int i=2;i<=(int)Math.sqrt(n);i++) {
            double result = Math.log(100) / Math.log(i);
            if(Math.floor(result) == Math.ceil(result)) {
                return true;
            }
        }
        return false;
    }
}

