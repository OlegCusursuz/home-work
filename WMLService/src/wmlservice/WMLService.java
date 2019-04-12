/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmlservice;

import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 *
 * @author kusur
 */
public class WMLService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    private static void writeToFile(List<Employee>empList) throws ParserConfigurationException{
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder domBuilder = builderFactory.newDocumentBuilder();
        Document doc = domBuilder.newDocument();
        Element root = doc.createElement("employees");
        doc.appendChild(root);
        for (Employee emp : empList) {
            Element employee = doc.createElement("Employee");
            root.appendChild(employee);
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(emp.getName))
            
        }
        
        
        
    }
    private static void readFromFile(){
        
    }
    
    
}
