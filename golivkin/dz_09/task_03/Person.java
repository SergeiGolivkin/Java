package golivkin.dz_09.task_03;


public abstract class Person  {
    public static void main(String[]agrs) {
        Runner runner = new Runner();
        System.out.print(runner.getName());
        runner.run();
        runner.distance();
        Swimmer swimmer = new Swimmer();
        System.out.print(swimmer.getName());
        swimmer.swim();
        swimmer.distance();


    }
    public interface Run {
        void distance();
        void run();
    }

    public interface Swim {
        void swim();
        void distance();
    }


    public static class Runner extends Person implements Run {



          String getName(){
            return " Василий ";
         }


         public void run(){
            System.out.print("бежит ");

        }
        public  void distance() {
            int a = 3000;
            System.out.println(a + " метров!");


        }

    }

    public static class Swimmer extends Person implements Swim {
        String getName(){
            return " Иван  ";
        }

        public  void swim(){
            System.out.print("плывет ");

        }
        public void distance(){
            int a = 500;
            System.out.println(a + " метров!");

        }

    }
}
