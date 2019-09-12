package golivkin.dz_04.task_04;
import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[]agrs){
        System.out.println("Введите число :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += sum + sum + i;
        }
        System.out.println(sum);
    }
}
