package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BinaryCalculator;

public class BinaryCalculatorController {

    @FXML
    private Label result;

    @FXML
    private TextField firstNumber;

    @FXML
    private TextField secondNumber;

    private BinaryCalculator binaryCalculator;

    @FXML
    public void initialize() {
        binaryCalculator = new BinaryCalculator();
    }

    public void calculate(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();

        if (button.getId().equals("addButton")) {
            result.setText(binaryCalculator.binaryAdd(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("subtractButton")) {
            result.setText(binaryCalculator.binarySubtract(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("multiplyButton")) {
            result.setText(binaryCalculator.binaryMultiply(firstNumber.getText(), secondNumber.getText()));
        } else if (button.getId().equals("divideButton")) {
            result.setText(binaryCalculator.binaryDivide(firstNumber.getText(), secondNumber.getText()));
        }
    }
}
