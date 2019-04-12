package EmployeeService;

import employeemanager.Main;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import newpackage.Employee;
import newpackage.Position;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLService {

    private static final String EMPLOYEELIST_NODE = "employees";
    private static final String EMPLOYEE_NODE = "employee";
    private static final String NAME_NODE = "name";
    private static final String SURNAME_NODE = "surname";
    private static final String BIRTHDAY_NODE = "birthday";
    private static final String POSITION_NODE = "position";
    private static final String ADRES_NODE = "adres";

    public static void writeToFile(ArrayList<Employee> empList) throws ParserConfigurationException, TransformerConfigurationException, TransformerException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder domBuilder = builderFactory.newDocumentBuilder();
        Document doc = domBuilder.newDocument();
        Element root = doc.createElement(EMPLOYEELIST_NODE);
        doc.appendChild(root);
        for (Employee emp : empList) {
            Element employee = doc.createElement(EMPLOYEE_NODE);
            root.appendChild(employee);

            Element name = doc.createElement(NAME_NODE);
            name.appendChild(doc.createTextNode(emp.getName()));
            employee.appendChild(name);

            Element surname = doc.createElement(SURNAME_NODE);
            surname.setNodeValue(emp.getSurname());
            surname.appendChild(doc.createTextNode(emp.getSurname()));
            employee.appendChild(surname);
            
            Element position = doc.createElement(POSITION_NODE);
            position.setNodeValue(emp.getPosition().toString());
            position.appendChild(doc.createTextNode(emp.getPosition().toString()));
            employee.appendChild(position);

            Element birthday = doc.createElement(BIRTHDAY_NODE);
            birthday.setNodeValue(emp.getLDBirthDay().toString());
            birthday.appendChild(doc.createTextNode(emp.getLDBirthDay().toString()));
            employee.appendChild(birthday);

            Element adres = doc.createElement(ADRES_NODE);
            adres.setNodeValue(emp.getAdres());
            adres.appendChild(doc.createTextNode(emp.getAdres()));
            employee.appendChild(adres);

        }
        doc.getDocumentElement().normalize();

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult destination = new StreamResult(new File("C:\\abc\\Employees.xml"));
        transformer.transform(source, destination);

    }

    public static void readFromFile() throws SAXException, IOException, ParserConfigurationException {
        File inputFile = new File("C:\\abc\\Employees.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document xmlDoc = dBuilder.parse(inputFile);
        xmlDoc.getDocumentElement().normalize();

        System.out.println("Root element :" + xmlDoc.getDocumentElement().getNodeName());
        NodeList nList = xmlDoc.getElementsByTagName(EMPLOYEE_NODE);

        for (int index = 0; index < nList.getLength(); index++) {
            Node nNode = nList.item(index);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String newName = eElement.getElementsByTagName(NAME_NODE).item(0).getTextContent();
                String newUsername = eElement.getElementsByTagName(SURNAME_NODE).item(0).getTextContent();
                String newPosition = eElement.getElementsByTagName(POSITION_NODE).item(0).getTextContent();
                String newBirthday = eElement.getElementsByTagName(BIRTHDAY_NODE).item(0).getTextContent();
                String newAdres = eElement.getElementsByTagName(ADRES_NODE).item(0).getTextContent();

                DefaultTableModel employeeListModel = (DefaultTableModel) Main.employeeListTeble.getModel();
                int employeeId = employeeListModel.getRowCount() + 1;
                employeeListModel.addRow(new Object[]{employeeId, newName, newUsername, newPosition, newBirthday, newAdres});
                
                
                Employee emp = new Employee(newName, newUsername, LocalDate.parse(newBirthday), newAdres);
                emp.setPosition(Position.valueOf(newPosition));
                EmployeeService.getEmployeeList().add(emp);

            }

        }

    }
}
