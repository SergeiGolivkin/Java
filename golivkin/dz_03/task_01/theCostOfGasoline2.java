package golivkin.dz_03.task_01;
import java.util.Scanner;
public class theCostOfGasoline2 {
    public static  void  main (String[]agrs){
        Scanner scan = new Scanner(System.in);
        int liter = scan.nextInt();
        int price = 48;
        int total = liter * price;
        System.out.println(total);

    }
}
