package golivkin.dz_13;
import java.util.ArrayList;

 class Child  {

   private ArrayList<Food> foods = new ArrayList<>();

    {

        foods.add(Food.APPLE);
        foods.add(Food.BANANA);
        foods.add(Food.CAKE);
    }




       void   eat(Food food) {
         try {
             if (foods.contains(food)) {
                 System.out.println("Съел " + food.getTitle() + " за обе щеки.");

             } else {
                 throw new IllegalArgumentException(String.format("Не стал есть " + food.getTitle()));

             }
         } finally {
             System.out.println(" Спасибо, мама!");
         }
     }





    }
