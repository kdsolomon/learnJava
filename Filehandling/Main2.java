import java.io.File;

public class Main2 {

    public static void main(String[] args) {
    //     File file=new File("FileHandling\\folder");
    //    if( file.mkdir()){
    //     System.out.println("Directory is created!");
    //    }
    //    else{
    //     System.out.println("Already created the directory!");
    //    }
     
    //to know os
    String os=System.getProperty("os.name");
    System.out.println(os);

    if(os.indexOf("win")>=0){
        System.out.println("Windows");
    }else if (os.indexOf("mac")>=0){
        System.out.println("Macintosh");
    } else if (os.indexOf("nix")>=0){
        System.out.println("linux");
    } 
    else{
        System.out.println("unkown os");
    }
        
    }
    }
    
}
