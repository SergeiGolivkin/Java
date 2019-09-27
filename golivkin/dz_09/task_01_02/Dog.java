package golivkin.dz_09.task_01_02;

public  class Dog extends Animal implements Animal.Run, Animal.Swim {
    public String getName(){
        return "Собака -";
    }


    public void run() {
        System.out.println(" бежать");

    }


    public void swim() {
        System.out.print(" плавать");

    }
}
