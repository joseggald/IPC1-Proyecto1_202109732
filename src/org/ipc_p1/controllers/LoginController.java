package org.ipc_p1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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

        funcionesUsuario.login(us, ps);

        if (funcionesUsuario.rl.equals("Administrador") && funcionesUsuario.res.equals("1")){
            this.escenarioPrincipal.cambiarEscenaAdmin();
        }
        else if(funcionesUsuario.rl.equals("Usuario") && funcionesUsuario.res.equals("1")){
            this.escenarioPrincipal.cambiarEscenaEstu();
        }
        else {
            this.escenarioPrincipal.cambiarEscenaLogin();
        }



    }




}
