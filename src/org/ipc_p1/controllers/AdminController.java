package org.ipc_p1.controllers;

import javafx.fxml.Initializable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
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
    public void crearUser(){
        this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
    }
    public void ventanaBilio(){
        this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
    }

}
