package practice.praticeclass06;

public class PossibleSubstrings {

    public static void main(String[] args) {
        System.out.println(calculate("ABECDF"));
    }

    public static int calculate(String str) {
        int result = 0;
        int n = str.length();
        for(int i=0;i<n;i++) {
            if(isVowel(str.charAt(i))) {
                   result+=(n-i);
            }
        }
        return result;
    }

    public static boolean isVowel(char i) {
        i = Character.toLowerCase(i);
        return (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u');
    }
}
