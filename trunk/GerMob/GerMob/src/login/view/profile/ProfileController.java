/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 */
package login.view.profile;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import login.entitys.User;
import login.security.Authenticator;
import login.view.main.Aplication;

/**
 * Profile Controller.
 */
public class ProfileController extends AnchorPane implements Initializable {

    @FXML
    private TextField user;
    @FXML
    private TextField phone;
    @FXML
    private TextField email;
    @FXML
    private TextArea address;
    @FXML
    private CheckBox subscribed;
    @FXML
    private Hyperlink logout;
    @FXML 
    private Button update;  
    @FXML 
    private Button next;  
    @FXML 
    private Label success;
    
    private Aplication application;
    
    private static final Authenticator authenticator = Authenticator.getInstance(); 
    
    public void setApp(Aplication application){
        this.application = application;
        User loggedUser = authenticator.getLoggedUser();
        user.setText(loggedUser.getId());
        email.setText(loggedUser.getEmail());
        phone.setText(loggedUser.getPhone());
        if (loggedUser.getAddress() != null) {
            address.setText(loggedUser.getAddress());
        }
        subscribed.setSelected(loggedUser.isSubscribed());
        success.setOpacity(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
   
    }
    
    public void processLogout(ActionEvent event) {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            return;
        }
        
        application.userLogout();
    }
    
    public void processUpdate(ActionEvent event) {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            animateMessage();
            return;
        }
        User loggedUser = authenticator.getLoggedUser();
        loggedUser.setEmail(email.getText());
        loggedUser.setPhone(phone.getText());
        loggedUser.setSubscribed(subscribed.isSelected());
        loggedUser.setAddress(address.getText());
        authenticator.updateUser(loggedUser);
        animateMessage();
        next.setOpacity(1);
        next.setDefaultButton(true);
        update.setOpacity(0.4);
        update.setDefaultButton(false);
    
    }
    
    public void processNext(ActionEvent event) {
    	application.gotoPrincipal();
    }

    private void animateMessage() {
        FadeTransition ft = new FadeTransition(Duration.millis(2000), success);
        ft.setFromValue(0.0);
        ft.setToValue(1);
        ft.play();
    }
}
