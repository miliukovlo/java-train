package Tasks;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "UTF-8");
        System.out.print("Введите какую-нибудь строку: ");
        String text = in.nextLine();
        String reverseText = new StringBuilder(text).reverse().toString();
        in.close();
        System.out.print("Перевернутая строка: " + reverseText); 
    }
}
