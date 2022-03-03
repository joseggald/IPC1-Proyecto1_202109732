package org.ipc_p1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class EstudianteController implements Initializable {
    private Main escenarioPrincipal;
    @FXML private TextField txtUsuario;
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private TextField txtDpi;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int i=FuncionesUsuario.actual;
        txtDpi.setText(String.valueOf(FuncionesUsuario.mostrarDPI(i)));
        txtDpi.setDisable(true);
        txtApellido.setText(FuncionesUsuario.mostrarApe(i));
        txtApellido.setDisable(true);
        txtUsuario.setDisable(true);
        txtUsuario.setText(FuncionesUsuario.mostrarUser(i));
        txtNombre.setDisable(true);
        txtNombre.setText(FuncionesUsuario.mostrarNom(i));
    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {

        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaMain();
    }

    public void ventanaBiblioVirt(){
        this.escenarioPrincipal.cambiarEscenaBiblioVirt();
    }
}
