package golivkin.dz_09.task_01_02;

public abstract  class Animal {

    public abstract String getName();

    public static void main(String[] agrs) {
        Fish fish = new Fish();
        System.out.print(fish.getName());
        fish.swim();
        Dog dog = new Dog();
        System.out.print(dog.getName());
        dog.swim();
        dog.run();
        Duck duck = new Duck();
        System.out.print(duck.getName());
        duck.swim();
        duck.fly();
        duck.run();
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




