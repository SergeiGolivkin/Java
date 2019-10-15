package golivkin.dz_07.task_01;

import java.util.Scanner;
public class JavaApp {
    public static void main(String[] args) {
        int button, money;
        Scanner scn = new Scanner(System.in);

        VendingMachine vm = new VendingMachine();

            System.out.println("0. Введите деньги ");
            System.out.println("1. COCA-COLA  60" +
                    "\n2. PEPSI      55\n3. FANTA      45 \n4. 7UP        63" +
                    "\n5. SCHWEPPES  75\n6. Выход.");
            while (true) {

            button = scn.nextInt();
            if (button == 0) {
                System.out.println("Введите сумму:");
                money = scn.nextInt();
                vm.setCash(money);

            } else if (button == 1) {
                //System.out.println("Заберите COCA-COLA \n Возьмите сдачу: " + money);
                money = scn.nextInt();
                vm.getCash(money);
                money = money - 60;
                System.out.println("Заберите COCA-COLA \n Возьмите сдачу: " + money);

            } else if (button == 2) {
                System.out.println("Заберите карту");
                System.exit(0);

            } else {
                System.out.println("Не ту кнопку жмешь");


            }
        }
    }


    
}
