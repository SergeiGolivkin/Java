package golivkin.dz_22.task_01;

import java.util.Comparator;


 public  class PersonSuperComparator implements Comparator<Person> {

     public int compare(Person a, Person b){

         int value1 =   a.getName().compareTo(b.getName());
         if (value1 == 0) {
             return Integer.compare(a.getAge(), b.getAge());
         }
         return value1;
     }


 }


