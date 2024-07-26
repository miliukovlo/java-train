package Numbers;

import java.util.Scanner;

public class ParityCheck {

    private static boolean parityCheckOfNumber(int getNumber) {
        if (getNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        in.close();
        if (parityCheckOfNumber(number)) {
            System.out.println("Ваше число четное");
        } else {
            System.out.println("Ваше число нечетное");
        }
    }
}
