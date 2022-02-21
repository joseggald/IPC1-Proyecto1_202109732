package org.ipc_p1.sistema;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.ipc_p1.controllers.*;
import org.ipc_p1.models.UsuarioTable;

import java.io.IOException;

public class Main extends Application {


    private final String CarpetaViews="../views/";
    private Stage escenarioPrincipal;

    @Override
    public void start(Stage escenarioPrincipal) throws Exception{
        this.escenarioPrincipal=escenarioPrincipal;
        this.escenarioPrincipal.setTitle("IPC1-Proyecto 1");
        this.cambiarEscenaMain();
        this.escenarioPrincipal.show();
    }

    public void cambiarEscenaMain(){
        try{
            MainController controlador = (MainController) this.cambiarEscena("MainView.fxml",509,416);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaLogin(){
        try{
            LoginController controlador = (LoginController) this.cambiarEscena("LoginView.fxml",391,350);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaAdmin(){
        try{
            AdminController controlador = (AdminController) this.cambiarEscena("AdminView.fxml",571,231);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public void cambiarEscenaCrearUsuario(){
        try{
            UsuariosCrearController controlador = (UsuariosCrearController) this.cambiarEscena("UsuariosCrearView.fxml",567,590);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaVentanaUsuarios(){
        try{
            VentanaUsuarioController controlador = (VentanaUsuarioController) this.cambiarEscena("VentanaUsuarioView.fxml",1497,590);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaVentanaUsuariosMod(){
        try{
            VentanaUsuarioController controlador = (VentanaUsuarioController) this.cambiarEscena("VentanaUsuarioView.fxml",1497,590);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarModificarUsuarios(ObservableList<UsuarioTable> selectedItems){
        try{
            UsuariosModificarController controlador = (UsuariosModificarController) this.cambiarEscena("UsuariosModificarView.fxml",567,590);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public Initializable cambiarEscena(String escena, int ancho, int alto) throws IOException {
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader(getClass().getResource(this.CarpetaViews + escena));
        AnchorPane root = (AnchorPane) cargadorFXML.load();
        Scene scene = new Scene(root, ancho, alto);
        scene.getStylesheets().add("org/ipc_p1/resources/style/estilo.css");
        this.escenarioPrincipal.setScene(scene);
        this.escenarioPrincipal.sizeToScene();
        resultado = (Initializable) cargadorFXML.getController();
        return resultado;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
