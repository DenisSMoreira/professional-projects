/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 */
package login.view.main;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import login.security.Authenticator;
import login.view.login.LoginController;
import login.view.principal.IssueTrackingLiteController;
import login.view.profile.ProfileController;

/**
 * Aplication Application. This class handles navigation and user session.
 */
public class Aplication extends Application {

    private Stage stage;
    private final double MINIMUM_WINDOW_WIDTH = 750.0;
    private final double MINIMUM_WINDOW_HEIGHT = 550.0;
    private static final Authenticator authenticator = Authenticator.getInstance();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(Aplication.class, (java.lang.String[])null);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
            stage.setTitle("Login");
            stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
            gotoLogin();
            
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        
    public boolean userLogging(String userId, String password){
        System.out.println("Codigo Usuário: " + userId + " Senha: " + password);
        if (authenticator.validate(userId, password)) {
            System.out.println("Usuário Válido");
            gotoProfile();
            return true;
        } else {
            System.out.println("Usuário Inválido");
            return false;
        }
    }
    
    public void userLogout(){
        gotoLogin();
    }
    
    private void gotoProfile() {
        try {
            ProfileController profile = (ProfileController) replaceSceneContent("/resource/fxml/Profile.fxml");
            profile.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gotoLogin() {
        try {
            LoginController login = (LoginController) replaceSceneContent("/resource/fxml/Login.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gotoPrincipal() {
        try {
        	IssueTrackingLiteController principal = (IssueTrackingLiteController) replaceSceneContent("/resource/fxml/IssueTrackingLite.fxml");
        	principal.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Aplication.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Aplication.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        
        double stageWidth = stage.getWidth();
        if (!Double.isNaN(stageWidth)) {
            stageWidth -= (stage.getWidth() - stage.getScene().getWidth());
        }
        double stageHeight = stage.getHeight();
        if (!Double.isNaN(stageHeight)) {
            stageHeight -= (stage.getHeight() - stage.getScene().getHeight());
        }

        Scene scene = new Scene(page);
        if (!Double.isNaN(stageWidth)) {
            page.setPrefWidth(stageWidth);
        }
        if (!Double.isNaN(stageHeight)) {
            page.setPrefHeight(stageHeight);
        }
        
        stage.setScene(scene);

        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}
