package golivkin.dz_21.task_02;

public class MyArray2 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},{1,2,3,4,5,6,7,8,9,10}};

        System.out.println("Массив до: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(  "\nМассив после: ");

        int [][]array2 = new int[array.length][];
        int len, index;
        for (int i=0; i < array.length; i++) {
            len = array[i].length;
            array2[i] = new int[len];
            index = len -1;
            for (int j = 0; j < len; j++) {
                array2[i][j] = array[i][index];
                index--;
                array2[i][9] =0;
                System.out.print(array2[i][j] +"  " +"\f");
            }

            System.out.println();
        }

    }

}







