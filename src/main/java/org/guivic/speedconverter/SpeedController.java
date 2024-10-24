package org.guivic.speedconverter;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class SpeedController implements Initializable {

    @FXML
    private TextField date;
    @FXML
    private TextField speedToConvert;
    @FXML
    private TextField speedConverted;

    @FXML
    private Button btnKms;
    @FXML
    private Button btnMiles;
    @FXML
    private Button btnClear;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        date.setText(Calendar.getInstance().getTime().toString());
    }

    @FXML
    protected void showMiles() {
        speedConverted.setText(convertKmToMiles(speedToConvert.getText()) + " miles");
    }

    @FXML
    protected void showKilometers() {
        speedConverted.setText(speedToConvert.getText() + " km");
    }

    @FXML
    protected void onClickClear() {
        speedToConvert.clear();
        speedConverted.clear();
    }

    private String convertKmToMiles(String text) {
        double speed = Double.parseDouble(text) / 1.609344;
        return String.format(Locale.ENGLISH,"%.2f", speed);
    }

}
