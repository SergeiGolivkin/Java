package golivkin.dz_02.task_02;

public class handSalary {
    public static void main(String[] agrs) {


        int salary = 90000;
        int ndfl = (salary / 100) * 13;
        int balance = salary - ndfl;
        System.out.println(balance);
    }
}
