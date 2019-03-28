package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label labela;
    public TextField upis;

    public void ispis(ActionEvent actionEvent) {

        String recenica="";
        recenica = upis.getText();
        String najduza = "";


        for (String rijec: recenica.split(" ")) {
            if (rijec.length() > najduza.length()) {
                najduza = rijec;
            }
        }

        String novi = "";
        novi=recenica.replaceAll(najduza, (najduza.toUpperCase()));
        labela.setText(novi);
    }
}
