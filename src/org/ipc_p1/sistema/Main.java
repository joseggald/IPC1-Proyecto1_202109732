package org.ipc_p1.sistema;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.ipc_p1.controllers.*;


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
    public void cambiarEscenaEstu(){
        try{
            EstudianteController controlador = (EstudianteController) this.cambiarEscena("EstudianteView.fxml",571,484);
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
    public void cambiarEscenaVentanaBiblio(){
        try{
            VentanaBibliotecaController controlador = (VentanaBibliotecaController) this.cambiarEscena("VentanaBibliotecaView.fxml",706,596);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaCrearIndiviBiblio(){
        try{
            BiliotecaCrearController controlador = (BiliotecaCrearController) this.cambiarEscena("BibliotecaCrearView.fxml",567,890);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaLibros(){
        try{
            VentanaLibrosController controlador = (VentanaLibrosController) this.cambiarEscena("VentanaLibrosView.fxml",1403,675);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaLibrosVirtuales(){
        try{
            VentanaLibVirtualesController controlador = (VentanaLibVirtualesController) this.cambiarEscena("VentanaLibVirtualView.fxml",1403,675);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaRevistas(){
        try{
            VentanaRevistasController controlador = (VentanaRevistasController) this.cambiarEscena("VentanaRevistaView.fxml",1492,675);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaTesis(){
        try{
            VentanaTesisController controlador = (VentanaTesisController) this.cambiarEscena("VentanaTesisView.fxml",1403,675);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaBiblioVirt(){
        try{
           BibliotecaVirtualController controlador = (BibliotecaVirtualController) this.cambiarEscena("VentanaBibliotecaUserView.fxml",1136,627);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaVerMiBiblioVirt(){
        try{
            BiblioLibVirtualesController controlador = (BiblioLibVirtualesController) this.cambiarEscena("BiblioLibVirtualView.fxml",996,675);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaPrestamosMain(){
        try{
            PrestamosMainController controlador = (PrestamosMainController) this.cambiarEscena("PrestamosMainView.fxml",706,596);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaPrestamosLibros(){
        try{
            VentanaLibrosPrestamosController controlador = (VentanaLibrosPrestamosController) this.cambiarEscena("VentanaLibrosPrestamosView.fxml",1226,606);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaMisPrestamosLibros(){
        try{
            VentanaMisLibrosPrestamosController controlador = (VentanaMisLibrosPrestamosController) this.cambiarEscena("VentanaMisLibrosPrestamosView.fxml",1226,606);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaMisPrestamosRevistas(){
        try{
            VentanaMisRevistasPrestamosController controlador = (VentanaMisRevistasPrestamosController) this.cambiarEscena("VentanaRevistaMisPrestamosView.fxml",1231,675);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaPrestamosRevistas(){
        try{
            VentanaRevistasPrestamosController controlador = (VentanaRevistasPrestamosController) this.cambiarEscena("VentanaRevistaPrestamosView.fxml",1320,675);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaMisPrestamosTesis(){
        try{
            VentanaMisTesisPrestamosController controlador = (VentanaMisTesisPrestamosController) this.cambiarEscena("VentanaMisTesisPrestamosView.fxml",1100,675);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public void cambiarEscenaPrestamosTesis(){
        try{
            VentanaTesisPrestamosController controlador = (VentanaTesisPrestamosController) this.cambiarEscena("VentanaTesisPrestamosView.fxml",1193,675);
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
