package golivkin.dz_27.task_01;

/*Есть два способа напечатать серии Фибоначчи.
        Используя итерацию
        Использование рекурсии
        Ваша задача реализовать оба способа.*/


public class Fibonacci {
    public static void main(String[] args) {

        fibIteration();
        System.out.println();
        for(int n = 1 ;n < 21;n++)
            System.out.print(fibRecursion(n) + ", ");




    }


    private static void fibIteration() {
        int fib1 = 1;
        int fib2 = 0;
        int fibonacci;
        for (int i = 0; i < 20; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
            System.out.print(fibonacci + ", ");
        }
    }

    private static int fibRecursion(int n){
        if(n == 0)return 0;
        if(n == 1)return 1;
        return fibRecursion(n - 1)+fibRecursion(n - 2);
    }


}
