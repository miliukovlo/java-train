package Tasks;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = in.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = in.nextInt();
        in.close();
        System.out.println("Сумма ваших чисел = " + (firstNumber + secondNumber));
    }
}
