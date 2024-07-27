package Tasks;

public class ArrayOutput {

    private static int[] numberArray = new int[] {1,2,3,4,5};

    public static void main(String[] args) {
        for (int i = 0;  i <= numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }
}
