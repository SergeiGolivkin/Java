package golivkin.dz_07.task_01;

import java.util.ArrayList;

 class VendingMachine {

     private int balance;
     private ArrayList<Integer> myCash = new ArrayList<>();
     void setCash(int cash) {
         if (cash <= 0) {
             System.out.println("Введите корректную сумму!");
         } else {
             myCash.add(cash);
             balance = 0;
             for (int i = 0; i < myCash.size(); i++) {
                 balance = balance + myCash.get(i);
             }
             System.out.println("Баланс " + balance +
                     " рублей, выберите номер напитка и нажмите Enter :");
         }
     }
    int getCash(int cash) {
       balance = 0;
       for (int i = 0; i < myCash.size(); i++) {
           balance = balance + myCash.get(i);
       }
       if (cash > balance) {
           System.out.println("У вас недостаточно средств!");
       } else {
           myCash.clear();
           myCash.add(balance - cash);
           for (int i = 0; i < myCash.size(); i++) {
               balance = myCash.get(i);

               System.out.println("Ваша сдача " + balance + " рублей");
               System.out.println("Заберите товар");
           }
       }return cash;

   }
}



