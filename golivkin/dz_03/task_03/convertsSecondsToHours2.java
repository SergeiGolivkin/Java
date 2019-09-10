package golivkin.dz_03.task_03;
import java.util.Scanner;
public class convertsSecondsToHours2 {
    public static void main (String[]agrs){
        Scanner scan = new Scanner(System.in);
        int seconds = scan.nextInt();
        int hours = seconds / 3600;
        System.out.println(hours);
    }
}
