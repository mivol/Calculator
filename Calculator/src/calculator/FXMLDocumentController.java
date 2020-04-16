/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author volkmi
 */
public class FXMLDocumentController implements Initializable  {
    
    double numberOne;
    int operation;
    double result;
    double numberTwo;
    @FXML
    private Button one;
    @FXML
    private Button root;
    @FXML
    private Button equal;
    @FXML
    private Button divid;
    @FXML
    private Button point;
    @FXML
    private Button zero;
    @FXML
    private Button emp;
    @FXML
    private Button mult;
    @FXML
    private Button nine;
    @FXML
    private Button eight;
    @FXML
    private Button seven;
    @FXML
    private Button minus;
    @FXML
    private Button six;
    @FXML
    private Button plus;
    @FXML
    private Button five;
    @FXML
    private Button four;
    @FXML
    private Button three;
    @FXML
    private Button two;
    @FXML
    private Button perc;
    @FXML
    private TextField display;
    @FXML
    private Button pm;
    
    @FXML
    private void handleButtonAction (ActionEvent event) throws IllegalArgumentException {
        if(event.getSource() == one){
            display.setText(display.getText() + "1");
        }else if(event.getSource() == two){
            display.setText(display.getText() + "2");
        }else if(event.getSource() == three){
            display.setText(display.getText() + "3");
        }else if(event.getSource() == four){
            display.setText(display.getText() + "4");
        }else if(event.getSource() == five){
            display.setText(display.getText() + "5");
        }else if(event.getSource() == six){
            display.setText(display.getText() + "6");
        }else if(event.getSource() == seven){
            display.setText(display.getText() + "7");
        }else if(event.getSource() == eight){
            display.setText(display.getText() + "8");
        }else if(event.getSource() == nine){
            display.setText(display.getText() + "9");
        }else if(event.getSource() == zero){
            display.setText(display.getText() + "0");
        }else if(event.getSource() == point){
            display.setText(display.getText() + ".");
        }else if(event.getSource() == plus){
            numberOne = Double.parseDouble(display.getText());
            operation = 1;
            display.setText("");
        }else if(event.getSource() == minus){
            numberOne = Double.parseDouble(display.getText());
            operation = 2 ;
            display.setText("");
        }else if(event.getSource() == mult){
            numberOne = Double.parseDouble(display.getText());
            operation = 3;
            display.setText("");
        }else if(event.getSource() == divid){
            numberOne = Double.parseDouble(display.getText());
            operation = 4;
            display.setText("");
        }else if(event.getSource() == root){
            numberOne = Double.parseDouble(display.getText());
            if (numberOne < 0) {
                    display.setText("ERR");
                    throw new IllegalArgumentException("divided by zero");   
                }else{
                   result = Math.sqrt(numberOne);
            }
            display.setText(String.valueOf(result));
        }else if(event.getSource() == perc){
            numberOne = Double.parseDouble(display.getText());
            result = numberOne / 100;
            display.setText(String.valueOf(result));
        }else if(event.getSource() == pm){
            numberOne = Double.parseDouble(display.getText());
            result = - numberOne;
            display.setText(String.valueOf(result));
        }else if(event.getSource() == emp ){
            display.setText("");
        }else if(event.getSource() == equal){
             numberTwo = Double.parseDouble(display.getText());
            if(operation == 1){
                 result = numberOne + numberTwo;
                display.setText(String.valueOf(result));
            }else if(operation == 2){
                 result = numberOne - numberTwo;
                display.setText(String.valueOf(result));
            }else if(operation == 3){
                 result = numberOne * numberTwo;
                display.setText(String.valueOf(result));
            }else if(operation == 4){
                if (numberTwo == 0) {
                    display.setText("ERR");
                    throw new IllegalArgumentException("divided by zero");   
                }else{
                    result = numberOne / numberTwo;
                    display.setText(String.valueOf(result));
            }
            }
        }

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
