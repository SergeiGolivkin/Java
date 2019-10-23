package golivkin.dz_15.task_02;
import java.io.File;

/*Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.*/

public  class Recursion {

     public static void main(String[] args) {
        createRecursion();
         Recursion rs = new Recursion();
         rs.walk("src/golivkin/dz_15/task_02" );

     }
     private void walk( String path ) {

         File root = new File( path );
         File[] list = root.listFiles();

         if (list == null) return;

         for ( File f : list ) {
             if ( f.isDirectory() ) {
                 walk( f.getAbsolutePath() );
                 System.out.println( "Директория:" + f.getAbsoluteFile() );
             }
             else {
                 System.out.println( "Файл:" + f.getAbsoluteFile() );
             }
         }
     }

    private static void createRecursion() {
        try {
            new File("src/golivkin/dz_15/task_02/a/b/c/d").mkdirs();
            new File("src/golivkin/dz_15/task_02/a/c/a/a").mkdirs();
            new File("src/golivkin/dz_15/task_02/b/a/a").mkdirs();
            new File("src/golivkin/dz_15/task_02/b/c/b").mkdirs();
            new File("src/golivkin/dz_15/task_02/a/1.txt").createNewFile();
            new File("src/golivkin/dz_15/task_02/b/2.txt").createNewFile();
            new File("src/golivkin/dz_15/task_02/b/a/3.txt").createNewFile();           new File("src/golivkin/dz_15/task_02/b/a/a/4.txt").createNewFile();
            new File("src/golivkin/dz_15/task_02/a/b/c/d/5.txt").createNewFile();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }




     }





