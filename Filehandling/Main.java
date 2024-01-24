import java.io.File;
import java.io.IOException;

public class Main {
 public static void main(String[] args) throws IOException {
        File file=new File("FileHandling\\fileHandling.txt");
        file.createNewFile();
        System.out.println("File Created");
    }
    
}
