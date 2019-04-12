package learningserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

/**
 *
 * @author sscerbatiuc
 */
public class LearningSerialization {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        try {
            List<Employee> empList = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                empList.add(Employee.getRandomEmployee());
            }
            serializeToFile(empList, "C:\\abc\\Employees.txt");
            deserializeFromFile("C:\\abc\\Employees.txt");
        } catch (IOException ex) {
            System.err.println("Error dude");
        }
    }

    public static void serializeToFile(List<Employee> empList, String filePath) throws FileNotFoundException, IOException {
        File outputFile = new File(filePath);
        FileOutputStream fileOutStream = new FileOutputStream(outputFile);
        ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutStream);
        objOutStream.writeObject(empList);
        objOutStream.close();
        fileOutStream.close();
    }

    public static void deserializeFromFile(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
            ArrayList list = (ArrayList) objInputStream.readObject();
            System.out.println(list);
        } catch (Exception e) {
            System.err.println("Second error dude");
        }
    }

}