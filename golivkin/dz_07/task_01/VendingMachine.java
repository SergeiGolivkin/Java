package golivkin.dz_07.task_01;
import java.lang.ref.PhantomReference;

import java.util.Scanner;

public  class  VendingMachine  {
    public static void  main(String[]agrs) {


        //String[] drink = {"COCA-COLA", "PEPSI", "FANTA", "SPRITE", "SCHWEPPES", "MIRINDA", "7UP", "БАЙКАЛ", "ТАРХУН", "НАПИТКИ ИЗ ЧЕРНОГОЛОВКИ"};
       // HashMap<Integer, String> product = new HashMap<>();
        //product.put(1, "COCA-COLA");
       // product.put(2, "PEPSI");
        //product.put(3, "FANTA");
       // product.put(4, "FANTA");
       // product.put(5, "SCHWEPPES");
       // product.put(6, "MIRINDA");
       // product.put(7, "7UP");
       // product.put(8, "БАЙКАЛ");
       // product.put(9, "ТАРХУН");
       // product.put(10, "БАРБАРИС");


       // int Food = runMenu();
       // int Price = retrievePrice(Food);
      // int change = moneyInserted(Price);
    }


    public static int runMenu(){
        Scanner keyboard = new Scanner(System.in);
        int choice = 0 ;
        System.out.println("\n\nВыберите номер продукта:"
                + "\n1: COCA-COLA  60"
                + "\n2: PEPSI      55"
                + "\n3: FANTA      45"
                + "\n4: 7UP        63"
                + "\n5: SCHWEPPES  75 "
                + "\n6: Exit");
        choice = keyboard.nextInt();
        return choice;
    }
    public static int retrievePrice (int menuChoice) {
        if (menuChoice == 1)
            return 60;
        if (menuChoice == 2)
            return 55;
        if (menuChoice == 3)
            return 45;
        if (menuChoice == 4)
            return 63;
        if (menuChoice == 5)
            return 75;
        else return 0;
    }


        public static int moneyInserted ( int Price){
            Scanner keyboard = new Scanner(System.in);
            int money = 0;
            System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
            money = keyboard.nextInt();
            while (money < Price) {
                System.out.println("Please insert sufficient funds");
                money = money + keyboard.nextInt();
            }
            return money - Price;
        }


    }




