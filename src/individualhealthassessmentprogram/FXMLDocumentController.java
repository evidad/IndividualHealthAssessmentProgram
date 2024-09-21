/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package individualhealthassessmentprogram;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author errol
 */
public class FXMLDocumentController implements Initializable {

    BMICalculator calc;
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calc = new BMICalculator();
    }  
    
    @FXML
    private Label weightLabel;
    
    @FXML
    private Label heightLabel;
    
    @FXML
    private TextField weightField;
    @FXML
    private TextField heightField;
    
    @FXML
    private Label title;
    
    @FXML
    private Label calcBMILabel;
    
    @FXML
    private Label reportLabel;
    
    @FXML
    private void handleSubmitButton(ActionEvent event) {
        try {
//            why box double
            Double weight = Double.parseDouble(weightField.getText());
            Double height = Double.parseDouble(heightField.getText());
            
            calc.setWeight(weight);
            calc.setHeight(height);
            
            Double userBMI = calc.calcBMI();
            
            String formattedBMI = String.format("%.2f", userBMI);
      
            calcBMILabel.setText("Your BMI is: " + formattedBMI);
            
            if (userBMI < 18.5) {
                reportLabel.setText("Your BMI is: " + formattedBMI + ", patient is seriously underweight and should consult a doctor");
            } else if (userBMI >= 35) {
                reportLabel.setText("Your BMI is: " + formattedBMI + ", patient is seriously overweight and should consult a doctor");
            } else {
                reportLabel.setText("");
            }
            
        }
        catch (NumberFormatException e) {
            calcBMILabel.setText("Please enter correct weight and height values");
        }
    }
            
  
    
}
