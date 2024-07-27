package Tasks;

public class CheckOnPalindrome {

    private static boolean check(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }
    public static void main(String[] args) {
        System.out.println(check("non"));
        System.out.println(check("none"));
    }
}
