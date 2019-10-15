package golivkin.dz_13;


public class Mother {
    public static void main(String[] args) throws Exception{

        Child child = new Child();
       for (Food food : Food.values()) {
            child.eat(food);
        }
        throw new Exception("Спасибо мама!");

    }

}
