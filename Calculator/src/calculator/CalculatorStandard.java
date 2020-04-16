/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc3;

import java.util.ArrayList;
import javafx.event.ActionEvent;

/**
 *
 * @author volkmi
 */
public interface CalculatorStandard {
    ArrayList<Double>numbers = new ArrayList<>();
    ArrayList<Integer>operators = new ArrayList<>();
    String[] symbol = new String[]{"0","1","2","3","4","5","6","7","8","9","."};
    void handleButtonAction(ActionEvent event);
    void handleButtonActionCommand(ActionEvent event);
    void handleButtonActionEqual(ActionEvent event);
    void handleButtonActionClear(ActionEvent event);
    void handleButtonActionCommandExtend(ActionEvent event);
}
