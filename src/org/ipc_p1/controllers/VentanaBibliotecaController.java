package org.ipc_p1.controllers;

import javafx.fxml.Initializable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class VentanaBibliotecaController implements Initializable {
    private Main escenarioPrincipal;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaAdmin();
    }
    public void crearIndividual(){
        this.escenarioPrincipal.cambiarEscenaCrearIndiviBiblio();
    }
    public void ventanaLibros(){
        this.escenarioPrincipal.cambiarEscenaLibros();
    }
}
