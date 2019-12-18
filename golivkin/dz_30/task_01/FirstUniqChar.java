package golivkin.dz_30.task_01;

import java.util.ArrayList;
import java.util.Scanner;

// Написать программу для поиска первого неповторяющегося символа в строке.

public class FirstUniqChar {
    public static void main(String[] args) {

        System.out.println( "Поиск первого уникального символа."+ "\nВведите любое слово:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        firstUnique(s);

    }

    public static void firstUnique(String s) {
        ArrayList<Character> uniqueList = new ArrayList<>();
        int[] chatArr = new int[2000];
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (chatArr[ch] != -1) {
                chatArr[ch] = -1;
                uniqueList.add(ch);
            } else {
                uniqueList.remove(ch);
            }
        }
        if (uniqueList.size() == 0) {
           System.out.println("Уникального символа нет!");
        } else {
           System.out.println("Первый уникальный символ: " + uniqueList.get(0));
       }
    }


}
