package org.ipc_p1.controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.ipc_p1.sistema.Main;

import java.net.URL;
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

    FuncionesUsuario funcionesUsuario = new FuncionesUsuario();

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

    public void crearUsuario() {
        String usuario, nombre, apellido, rol, password, password2;
        int dpi, a = 1;
        String array[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < array.length; i++) {
            if (txtDpi.getText().contains(array[i])) {
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("ERROR!");
                aviso.setContentText("El DPI no puede llevar letras.");
                aviso.show();
                a=2;
            }

        }
        rol=cmbRol.getSelectionModel().getSelectedItem();
        if(txtUsuario.getText().isEmpty() || txtApellido.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPassword.getText().isEmpty() || txtPassRevisar.getText().isEmpty()||txtDpi.getText().trim().isEmpty()){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("ERROR!");
            aviso.setContentText("No deje campos vacios.");
            aviso.show();
        }else if(rol==null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("ERROR!");
            aviso.setContentText("Seleccione un rol.");
        }else if(a!=2){
            dpi=Integer.parseInt(txtDpi.getText());
            usuario=txtUsuario.getText();
            nombre=txtNombre.getText();
            apellido=txtApellido.getText();
            password=txtPassword.getText();
            password2=txtPassRevisar.getText();
            if(password.equals(password2)){
                funcionesUsuario.crearUsuario(dpi,nombre,apellido,usuario,password,rol);
                this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
            }else{
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro no guardado!");
                aviso.setContentText("Contraseñas no coiciden. Revise si lleno corectamente los campos.");
                aviso.show();
            }
        }
    }



}
