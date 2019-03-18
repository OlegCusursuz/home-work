
package inputoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Output {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Oleg\\Ok.txt");
        if(newTextFile.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File alredy exists");
        }
        FileOutputStream fout = new FileOutputStream(newTextFile, Boolean.FALSE);
        fout.write(65);
        
        String hello = "\nHello World";
        fout.write(hello.getBytes());
        fout.close();
        
        System.out.println("Is derectory:"+ newTextFile.getParent());
        //newTextFile.deleteOnExit();
        System.out.println("Pause");
    }
    
}
