package golivkin.dz_06.task_01;

 class Sale {
      Product[] products;

     Sale() {
         products = new Product[3];
     products[0] = new Juice(16,50);
     products[1] = new Grain(70,40);
     products[2] = new Cosmetics(200,70);
 }

        int sumOfProducts() {
        int sum = 0;
        for (Product m : products) {
            sum += m.getCost();
        }
        return sum;
    }


     int salePrice() {
        return sumOfProducts() + (sumOfProducts()/100*50);
    }


}
