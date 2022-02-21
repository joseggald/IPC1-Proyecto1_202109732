package org.ipc_p1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.ipc_p1.models.Usuario;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class UsuariosCrearController implements Initializable {

    private Main escenarioPrincipal;
    @FXML private TextField txtDpi;
    @FXML private TextField txtUsuario;
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private ComboBox<String> cmbRol;
    @FXML private TextField txtPassword;
    @FXML private TextField txtPassRevisar;

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

    public void crearUsuario(){
        String usuario, nombre, apellido, rol, password, password2;
        int dpi;
        dpi=Integer.parseInt(txtDpi.getText());
        usuario=txtUsuario.getText();
        nombre=txtNombre.getText();
        apellido=txtApellido.getText();
        rol=cmbRol.getSelectionModel().getSelectedItem();
        password=txtPassword.getText();
        password2=txtPassRevisar.getText();

        if(password.equals(password2) && txtDpi.getText().length()>1 && txtNombre.getText().length()>1 && txtPassword.getText().length()>1 && txtApellido.getText().length()>1 && txtPassRevisar.getText().length()>1 && txtUsuario.getText().length()>1 && cmbRol.getSelectionModel().getSelectedItem().length()>1 ){
            funciones.crearUsuario(dpi,nombre,apellido,usuario,password,rol);
            this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
        }else{
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Registro no guardado!");
            aviso.setContentText("Datos erroneos o Contraseñas no coiciden.");
            aviso.show();
        }


    }


}
