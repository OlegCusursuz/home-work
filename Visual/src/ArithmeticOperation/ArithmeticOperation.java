/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArithmeticOperation;

/**
 *
 * @author kusur
 */
public class ArithmeticOperation {
    double num, total;
    int calculation;
    int punct = 0;
    double sum = 0;

    public ArithmeticOperation(String calculation) {
    
        
    
    switch (calculation) {
            case '+':
                total = num + Double.parseDouble(txtResult.getText());
                num = total;
                txtResult.setText("");
                jLabel1.setText(total + "");
                break;
            case '-':
                total = num - Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                jLabel1.setText(total + "");
                num = total;
                break;
            case '*':
                total = num * Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                jLabel1.setText(total + "");
                num = total;
                break;
            case '/':
                total = num / Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                jLabel1.setText(total + "");
                num = total;
                break;
            case '%':
                total = num % Double.parseDouble(txtResult.getText());
                txtResult.setText("");
                jLabel1.setText(total + "");
                num = total;
                break;

        }
    }
}
