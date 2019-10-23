package golivkin.dz_15.task_01;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*Написать программу, которая будет создавать, переименовывать,
 копировать и удалять файл.*/

public class TestFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("src/golivkin/dz_15/task_01/music.txt");
       try {
            System.out.println( "Файл создан "+ myFile.getAbsolutePath() + " " + myFile.createNewFile() );
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        File myFile1 = new File("src/golivkin/dz_15/task_01/music1.txt");
        if(myFile.renameTo(myFile1)){
            System.out.println("Файл переименован");
        }else{
           System.out.println("Файл не переименован");
        }
        Files.copy(Paths.get("src/golivkin/dz_15/task_01/music1.txt"),Paths.get("src/golivkin/dz_15/task_01/music2.txt"),StandardCopyOption.REPLACE_EXISTING );

       Files.deleteIfExists(Paths.get("src/golivkin/dz_15/task_01/music1.txt"));
       Files.deleteIfExists(Paths.get("src/golivkin/dz_15/task_01/music2.txt"));







    }
}
