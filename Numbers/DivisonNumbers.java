package Numbers;

import java.util.Scanner;

public class DivisonNumbers {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = in.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = in.nextInt();
        System.out.println("Деление ваших чисел = " + (firstNumber / secondNumber));
    }
}
