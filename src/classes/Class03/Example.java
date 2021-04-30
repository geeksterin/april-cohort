package classes.Class03;

public class Example {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int[] arr = new int[100];
        arr[1] = 20;
        foo(a,arr);
        System.out.println(arr[1]);
        System.out.println(a);

    }

    private static void foo(int a, int[] arr) {
        System.out.println(a);
        a = 20;
        System.out.println(a);
        System.out.println(arr[1]);
        arr[1] = 50;

    }

}
