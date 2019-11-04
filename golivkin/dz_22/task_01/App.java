package golivkin.dz_22.task_01;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tom", 55));
        people.add(new Person("Nick", 36));
        people.add(new Person("Alice", 38));
        people.add(new Person("Boris", 40));
        people.add(new Person("Alice", 18));
        iterate(people);
        System.out.println();
        System.out.println("People list");
        System.out.println();

        for (Person person : people){
            System.out.println(person.getName() + " " + person.getAge());
        }
        System.out.println();

        people.sort(new PersonSuperComparator());
        System.out.println("Sorted  people list");
        System.out.println();
        for (Person person : people){
            System.out.println(person.getName() + " " + person.getAge());
        }
        System.out.println();
        System.out.println();



    }
    private static void iterate(List<Person>people){
        for (Person person : people) {
            System.out.print(person);
            System.out.print(" : ");
        }
        System.out.println();
    }
}
