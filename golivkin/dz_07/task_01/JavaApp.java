package golivkin.dz_07.task_01;

import java.util.Scanner;
public class JavaApp {
    public static void main(String[] args) {
        int button,money;
         Scanner scn = new Scanner(System.in);
            VendingMachine vm = new VendingMachine();
            System.out.println(" Пополните баланс и выберите номер напитка");
            for (Drink drink : Drink.values()) {
                System.out.println(drink.ordinal() + " " + drink.getTitle() +
                        "  " + drink.getPrice()); }
            System.out.println("5 Пополнить баланс\n6 Выход.");
            while (true) {
                button = scn.nextInt();
                switch (button) {
                    case 0:
                        vm.getCash( Drink.COCACOLA.getPrice());
                        break;
                    case 1:
                        vm.getCash(Drink.PEPSI.getPrice());
                        break;
                    case 2:
                        vm.getCash(Drink.FANTA.getPrice());
                        break;
                    case 3:
                        vm.getCash(Drink.SPRAIT.getPrice());
                        break;
                    case 4:
                        vm.getCash(Drink.SCHWEPPES.getPrice());
                        break;
                    case 5:
                        System.out.println("Введите сумму:");
                        money = scn.nextInt();
                        vm.setCash(money);
                        break;
                    case 6:
                        System.out.println("Благодарим за покупку!");
                        System.exit(0);
                    default:
                        System.out.println("Ошибка ввода, введите цифру от 0 до 5.");
                }
            }
        }
    }


    

