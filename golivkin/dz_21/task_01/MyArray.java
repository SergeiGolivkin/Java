package golivkin.dz_21.task_01;

public class MyArray {

        public static void main(String[] args) {
            int[][] array =  {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
            toLeft(array);

        }

    private static void toLeft(int[][] array) {

        for (int i = 0;i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

            System.out.println();
        for (int[] ints : array) {
            for (int j = 0; j < ints.length - 1; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int[] ints : array) {
            for (int j = 1; j < ints.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println("\n");
        }


    }

    }





