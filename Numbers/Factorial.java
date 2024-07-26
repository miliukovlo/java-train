package Numbers;

public class Factorial {


    private void Solution(int someNumber) {
        int result = 1;
        if (someNumber > 0) {
            for (int i = 1; i <= someNumber; i++) {
                result = result * i;
            }
            System.out.println(result);
        } else {
            System.out.println("Число отрицательное, либо равно нулю!");
        }
    };

    public static void main(String [] args) {
        Factorial newClass = new Factorial();
        newClass.Solution(0);
        newClass.Solution(2);
        newClass.Solution(3);
        newClass.Solution(4);
        newClass.Solution(-1);
    }
};