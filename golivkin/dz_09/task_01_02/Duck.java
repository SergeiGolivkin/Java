package golivkin.dz_09.task_01_02;

public class Duck extends Animal implements Animal.Fly, Animal.Run, Animal.Swim {


    public String getName(){
        return "Утка -";
    }

    public void swim() {
        System.out.print(" плавать");

    }


    public void run() {
        System.out.print(" бежать");

    }


    public void fly() {
        System.out.print(" летать");

    }
}
