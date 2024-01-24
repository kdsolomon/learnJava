import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainWriter {
    
    public static void main(String[] args) throws IOException{
        try(BufferedWriter bw= new BufferedWriter(new FileWriter("filehandling\\learnJava.txt",true))){
            bw.newLine();
            bw.write("Solomon is learning java");
            System.out.println("operation success");
        }
           catch (Exception e) {
            
            System.out.println("Error in writing to file!");
        }
        ;;
    }

    
}
