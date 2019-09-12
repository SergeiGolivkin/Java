package golivkin.dz_04.task_02;
import java.util.Scanner;
public class Number {
    public static void main(String[]agrs){
        System.out.println("Введите любое целое число:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n % 2 == 0 && n !=0) {
           System.out.print(" - четное  ");
        }
        if (n % 2 != 0)  {
            System.out.print(" - нечетное  ");
        } if(n>0) {
            System.out.print("положительное ");
        } if (n<0){
            System.out.print("отрицательное ");
        } if (n == 0) {
            System.out.println("нулевое");
        }




        }


    }

