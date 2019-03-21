/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author kusur
 */
public class Input {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         File newTextFile = new File("C:\\Oleg\\Ok.txt");
        if(newTextFile.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File alredy exists");
        }
        FileInputStream inStream = new FileInputStream(newTextFile);
        int intChar = inStream.read();
        System.out.println((char) intChar);
        
        while(intChar != -1){
            System.out.println((char) intChar);
            intChar = inStream
        }
    }
}
