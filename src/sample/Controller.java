package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField numberOne;

    @FXML
    private TextField numberTwo;

    @FXML
    private Button sumBtn;

    @FXML
    private Label labelResult;

    @FXML
    public void btnSum() {
        try {
            double number1 = Double.parseDouble(numberOne.getText());
            double number2 = Double.parseDouble(numberTwo.getText());
            double sum = number1 + number2;
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constraints.setTextFieldInteger(numberOne);
        Constraints.setTextFieldInteger(numberTwo);
    }
}
