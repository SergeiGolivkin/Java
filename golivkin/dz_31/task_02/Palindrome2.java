package golivkin.dz_31.task_02;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println("Введите слово для проверки:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));

    }

    public static Boolean isPalindrome(String s) {
       String reverse = reverseString(s);
        return s.equals(reverse);
    }

    private static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i) r += s.charAt(i);
        return r;
    }


}
