package org.ipc_p1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.ipc_p1.models.Usuario;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class AboutController implements Initializable {

    private Main escenarioPrincipal;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setEscenarioPrincipal(Main escenarioPrincipal) {

        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaMain();
    }





}
