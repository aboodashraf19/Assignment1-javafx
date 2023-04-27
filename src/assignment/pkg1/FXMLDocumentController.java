/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Abood
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField textFeildUserName;
    @FXML
    private TextField textFeildPassword;
    @FXML
    private Button buttonLogin;

    @FXML
    void btnHandel(ActionEvent event) {
        String username = textFeildUserName.getText();
        String pass = textFeildPassword.getText();
        try {
            if (username.equalsIgnoreCase("Admin") && pass.equals("123456")) {
                openStage();
                        System.out.println("Login successful!");

            } else {
                System.out.println("Login Failed Incorrect username or password...");

                System.out.println("Login failed!");
//                المفروض هاد الكود لlabe
//                errorLabel.setText("Invalid username or password");
//                errorLabel.setStyle("-fx-text-fill: red;");
//                errorLabel.setVisible(true);
            }
        } catch (IOException ex) {
            System.out.println("Current exception: " + ex);
        }

    }

    //*******************************
    private void openStage() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("xxx.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
