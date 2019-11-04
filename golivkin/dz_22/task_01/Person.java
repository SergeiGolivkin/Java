package golivkin.dz_22.task_01;


class Person {
    private String name;
    private int age;

     int getAge() {
        return age;
    }

    String getName(){
        return name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + ","  + age;
    }




}
