package golivkin.dz_07.task_01;

import java.util.ArrayList;

public class VendingMachine {
    private int cash;
    public int price;
    private ArrayList<Integer> myCash = new ArrayList<>();
    public void setCash(int cash) {
        if (cash <= 0) {
            System.out.println("Введите корректную сумму!");
        } else {
            this.cash = cash;
            myCash.add(cash);
            price = 0;
            for (int i = 0; i < myCash.size(); i++) {
                price = price + myCash.get(i);
            }
            System.out.println("Баланс " + price + " рублей, выбеоите номер напитка :");
        }
    }
    public  void getCash(int cash) {
        price = 0;
        for (int i = 0; i < myCash.size(); i++) {
            price = price + myCash.get(i);
        }
        if (cash > price) {
            System.out.println("У вас недостаточно средств!");
        } else {
            myCash.clear();
            myCash.add(price - cash);
            for (int i = 0; i < myCash.size(); i++) {
                price =  myCash.get(i);
            }
            System.out.println("Ваша сдача " + price + " рублей");


        }
    }

}
