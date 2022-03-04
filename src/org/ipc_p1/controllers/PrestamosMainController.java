package org.ipc_p1.controllers;

import javafx.fxml.Initializable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class PrestamosMainController implements Initializable {
    private Main escenarioPrincipal;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {

        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaEstu();
    }
    public void ventanaLibrosPrestamos(){
        this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
    }
    public void ventanaMisLibrosPrestamos(){
        this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
    }
    public void ventanaMisRevistas(){
        this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
    }
    public void ventanaRevistas(){
        this.escenarioPrincipal.cambiarEscenaPrestamosRevistas();
    }
    public void ventanaTesis(){
        this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
    }
    public void ventanaMisTesis(){
        this.escenarioPrincipal.cambiarEscenaMisPrestamosTesis();
    }
}
