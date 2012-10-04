/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 */
package login.view.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import login.view.main.Aplication;

/**
 * Login Controller.
 */
public class LoginController extends AnchorPane implements Initializable {

    @FXML
    private TextField userId;
    @FXML
    private PasswordField password;
    @FXML
    private Button login;
    @FXML
    private Label errorMessage;

    private Aplication application;

    
    public void setApp(Aplication application){
        this.application = application;
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errorMessage.setText("");
    }

    public void processLogin(ActionEvent event) {
        if (application == null){
            errorMessage.setText("Bem vindo: " + userId.getText());
        } else {
            if (!application.userLogging(userId.getText(), password.getText())){
                errorMessage.setText("Erro ao validar usuário: " + userId.getText());
            }
        }
    }
}
