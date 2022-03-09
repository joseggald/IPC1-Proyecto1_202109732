package org.ipc_p1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.ipc_p1.sistema.Main;
import org.ipc_p1.models.Usuario;
import java.net.URL;

import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private Main escenarioPrincipal;
    Usuario[] users= new Usuario[100];

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtPassword;

    FuncionesUsuario funcionesUsuario =new FuncionesUsuario();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setEscenarioPrincipal(Main escenarioPrincipal) {

        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaMain();
    }

    public void autenticar(){
        String ps, us;
        us=txtUsuario.getText();
        ps=txtPassword.getText();


        if(us.isEmpty() || ps.isEmpty()){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Login");
            aviso.setContentText("Debe de llenar los campos.");
            aviso.show();
        }else{
            funcionesUsuario.login(us, ps);
            if(FuncionesUsuario.loginNoFound==1 && funcionesUsuario.res.equals("2")){
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Login");
                aviso.setContentText("Datos erroneos, porfavor vuelva a intentar.");
                aviso.show();
            }
        }
        if (funcionesUsuario.rl.equals("Administrador") && funcionesUsuario.res.equals("1")) {
            this.escenarioPrincipal.cambiarEscenaAdmin();
        } else if (funcionesUsuario.rl.equals("Usuario") && funcionesUsuario.res.equals("1")) {
            this.escenarioPrincipal.cambiarEscenaEstu();
        }
    }




}
