package golivkin.dz_04.task_03;

public class MultiplicationTable {
    public static void main(String[]agrs){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}
