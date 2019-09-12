package golivkin.dz_04.task_04;

public class GeometricProgression {
    public static void main(String[]agrs){
        int n = 1;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += sum + sum + i;
        }
        System.out.println(sum);
    }
}
