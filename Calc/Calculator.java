package Calc;

import java.util.Scanner;

import Numbers.DivisonNumbers;
import Numbers.MultiOfNum;
import Numbers.SubtrOfNum;
import Numbers.SumOfNumbers;

public class Calculator {

    private static int menuSelect;
    private static boolean worked = true;

    static Scanner in = new Scanner(System.in);

    private static void outputMenu() {
        menuSelect = 0;
        Menu.main(null);
        menuSelect = in.nextInt();
    }

    public static void main(String[] args) {
        while (worked) {
            outputMenu();
            if (menuSelect == 1) {
                SumOfNumbers.main(args);
            } else if (menuSelect == 2) {
                SubtrOfNum.main(args);
            }else if (menuSelect == 3) {
                MultiOfNum.main(args);
            }else if (menuSelect == 4) {
                DivisonNumbers.main(args);
            }else if (menuSelect == 5) {
                worked = false;
            } else {
                System.out.println("Вы ввели неверное значение");
            }
        }
    }
}
