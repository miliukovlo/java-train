package Numbers;

public class SumFrom1To100 {
    static int result = 0;
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
