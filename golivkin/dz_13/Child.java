package golivkin.dz_13;
import java.util.ArrayList;
public class Child extends Mother {

    ArrayList<Food> foods = new ArrayList<>();

    {

        foods.add(Food.APPLE);
        foods.add(Food.BANANA);
        foods.add(Food.CAKE);
    }


    Food eat(Food food) throws Exception {
        try {


            if (foods.contains(food)) {
                System.out.println("Съел "+ food.getTitle() + " за обе щеки. Спасибо мама!");
                System.out.println("Спасибо мама!");

            }

        } catch (Exception e){


        }return food;
    }
}