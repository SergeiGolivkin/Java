package golivkin.dz_09.task_01_02;

public abstract  class Animal {

    public abstract String getName ();

    public static void main(String[]agrs) {
        Fish fish = new Fish();
        System.out.println(fish.getName());
        Dog dog = new Dog();
        System.out.println(dog.getName());
        Duck duck = new Duck();
        System.out.print(duck.getName());
    }


       public interface Fly {
        void fly();
    }
    public interface Run {
         void run();
    }
    public interface Swim {
        void swim();


    }


}

