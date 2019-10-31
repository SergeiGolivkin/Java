package golivkin.dz_21.task_01;
import java.util.Arrays;
public class x {
    public static void main(String[] args) {
        int[] array = { 2, 4, 1, 10, 3, 15, 32, 77};
        int k = 1; //на сколько сдвинем влево
        for (int i = 0; i < k; i++) {
            int tmp1 = array[0];
            for (int j = 0; j < array.length - 1; j++)
                array[j] = array[j+1];
            array[array.length - 1] = tmp1;
        }
        System.out.println(Arrays.toString(array));


    }
}
