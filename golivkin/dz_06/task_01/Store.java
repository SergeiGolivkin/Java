package golivkin.dz_06.task_01;

public class Store extends Sale {
    public static void main(String[]agrs){
        Sale sale;
        sale = new Sale();
        System.out.println(" Цена от  поставщика: " + sale.sumOfProducts() );

        System.out.println(" Цена с  наценкой 50%: " + sale.salePrice());

        System.out.println(" Чистая прибыль: " + (sale.salePrice()- sale.sumOfProducts()));



    }

}
