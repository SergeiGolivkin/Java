package golivkin.dz_25.task_01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*public boolean isUnique(Map<String, String> map);
 Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.Для пустой мапы метод возвращает true.*/

public class Friends {
    public static void main(String[] args) {

        Map<String,String> map = new  HashMap<>();
        map.put("Jennifer","Aniston");
        map.put("Courteney","Cox");
        map.put("Lisa","Kudrow");
        map.put("Matt","LeBlanc");
        map.put("Matthew","Perry");
        map.put("David","Schwimmer");

        Friends friends = new Friends();

        System.out.println( friends.isUnique(map));

        map.put("Lisa","Perry");
        map.put("Matt","Cox");
        System.out.println( friends.isUnique(map));

        map.clear();
        System.out.println( friends.isUnique(map));

    }

    public boolean isUnique(Map<String, String> map){
        for (Map.Entry<String, String> pair : map.entrySet()){
            int friends = Collections.frequency(map.values(), pair.getValue());
            if (friends > 1){
               return false;
            }
        }
        return true;
    }



}
