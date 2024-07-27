package Numbers;

public class Maximum {
    private static int[] numberArray = new int[] {31,2,3,4,5,22,16,11};
    private static int[] emptyNumberArray = new int[0];

    public static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым!");
        }
        int maximum = array[0];
        for (int i : array) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println("Максимальное число в массиве: " + findMaximum(numberArray));
        System.out.print(findMaximum(emptyNumberArray));
    }
}
