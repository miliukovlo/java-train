package Numbers;

import java.util.Arrays;

public class SortNumbers {
    private static int[] numberArray = new int[] {10,9,8,7,6,5,4,3,2,1};
    public static void main(String[] args) {
        Arrays.sort(numberArray);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }
}
