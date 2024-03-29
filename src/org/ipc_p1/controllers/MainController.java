package org.ipc_p1.controllers;
import javafx.fxml.Initializable;
import org.ipc_p1.models.Usuario;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private Main escenarioPrincipal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FuncionesUsuario.inicio();
    }

    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void ventanaLogin(){
    this.escenarioPrincipal.cambiarEscenaLogin();
    }

    public void about(){ this.escenarioPrincipal.cambiarEscenaAbout();}
}
