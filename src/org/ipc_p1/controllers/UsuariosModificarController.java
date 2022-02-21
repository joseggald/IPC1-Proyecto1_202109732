package org.ipc_p1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.ipc_p1.models.UsuarioTable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class UsuariosModificarController implements Initializable {
    private Main escenarioPrincipal;
    @FXML private TextField txtDpi;
    @FXML private TextField txtUsuario;
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private ComboBox<String> cmbRol;
    @FXML private TextField txtPassword;
    @FXML private TextField txtPassRevisar;
    private UsuarioTable usuarios;
    Funciones funciones=new Funciones();
    @Override

    public void initialize(URL location, ResourceBundle resources) {

        cmbRol.getItems().add("Usuario");
        cmbRol.getItems().add("Administrador");
    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
    }


}
