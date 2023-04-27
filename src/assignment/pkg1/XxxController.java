/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Abood
 */
public class XxxController implements Initializable {

    @FXML
    private Button convertBtn;
    @FXML
    private Button logoutBtn;
    @FXML
    private TextField usdTextfeild;
    @FXML
    private TextField nisTextfeild;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void convertBtnHandel(ActionEvent event) {
//         if (!isEmptyText(usdTextfeild)) {
//             float usd = Float.valueOf(usdTextfeild.getText());
//             usd *= 3.6;
//             nisTextfeild.setText(Float.toString(usd));
//         } else if (isEmptyText(nisTextfeild)) {
//             float nis = Float.valueOf(nisTextfeild.getText());
//             nis /= 3.6;
//             usdTextfeild.setText(Float.toString(nis));
//         }
        //---------------------------------------كود أخر افضل--------------------
         if (nisTextfeild.getText() != null &&
                (usdTextfeild.getText().equals("") || usdTextfeild.getText().equalsIgnoreCase(" "))){
            double value = Double.parseDouble(nisTextfeild.getText());
            usdTextfeild.setText(String.format("%.2f", (value/3.45)));
        }
        else if (usdTextfeild.getText() != null &&
                (nisTextfeild.getText().equals("") || nisTextfeild.getText().equalsIgnoreCase(" "))) {
            double value = Double.parseDouble(usdTextfeild.getText());
            nisTextfeild.setText(String.format("%.2f", (value*3.45)));
        }

    }

    @FXML
    void logouthandel(ActionEvent event) {
        System.exit(0);
    }

    private boolean isEmptyText(TextField x) {
        if (x.getText() == "") {
            return true;
        }
        return false;
    }
    
    

}
