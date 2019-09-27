package golivkin.dz_09.task_01_02;

public class Fish extends Animal implements Animal.Swim {

    public String getName(){
       return "Рыба -";
    }


    public void swim() {
        System.out.println(" плавать");
    }
}
