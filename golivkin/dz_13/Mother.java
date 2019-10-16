package golivkin.dz_13;


public class Mother {
    public static void main(String[] args) {

        Child child = new Child();
        for (Food food : Food.values()) {
            try {
                child.eat(food);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }

    }
}
