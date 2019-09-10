package golivkin.dz_03.task_02;
import java.util.Scanner;
public class handSalary2 {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();

        int ndfl = (salary / 100) * 13;
        int balance = salary - ndfl;
        System.out.println(balance);
    }
}
