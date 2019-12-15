package golivkin.dz_33.task_01;
import java.util.Arrays;

public class MaxFregChar {

    public static void main(String[] args) {
        String str = "This is test message";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int count = 1;
        int max = 0;
        char c = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > max) {
                    c = arr[i];
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        if (max > 1)
            System.out.println("Character: " + c + "  has occurred maximum times in String: " + max);
    }
}
