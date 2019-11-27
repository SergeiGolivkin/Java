package golivkin.dz_24.task_01;

import java.util.HashSet;
import java.util.Set;
/*Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
public Set<String> removeEvenLength(Set<String> set);*/

public class Fruits {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("watermelon");
        set.add("bananas");
        set.add("cherry");
        set.add("pear");
        set.add("melon");

        System.out.println(set);

        Fruits fruits = new Fruits();

        fruits.removeEvenLength(set);

        System.out.println(set);


    }


     public   Set<String> removeEvenLength(Set<String> set) {
        set.removeIf(s -> s.length() % 2 == 0);
        return set;
    }

}
