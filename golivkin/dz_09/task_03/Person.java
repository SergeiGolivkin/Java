package golivkin.dz_09.task_03;


public abstract class Person  {
    public static void main(String[]agrs){

    }
    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }


    public static class Runner extends Person implements Run {

        public void run(){

        }
    }

    public static class Swimmer extends Person implements Swim {

        public void swim(){

        }

    }
}
