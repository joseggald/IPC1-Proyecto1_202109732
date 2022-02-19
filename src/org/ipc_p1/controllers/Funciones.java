package org.ipc_p1.controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import org.ipc_p1.models.Usuario;
import org.ipc_p1.sistema.Main;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class Funciones {

    //VARIABLES PRINCIPALES
    private static Usuario users[]=new Usuario[10];
    public static int limite=20, loginNoFound=0;
    Usuario user=new Usuario(2020010689,"admin","1234","José","Galdámez","Administrador");


    //VARIABLES EXTRAS
    String res;


    //LOGIN
    public void login(String username, String password){
        users[0]=user;
        for (int i=0; i<limite; i++){
            System.out.println(i);
            if(username.equals(users[i].getUsername()) && password.equals(users[i].getPassword())){
                System.out.println(users[i].getUsername());
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Login");
                aviso.setContentText("Bienvenido de nuevo "+users[i].getNombre()+ " "+ users[i].getApellido()+"!");
                aviso.show();
                res="1";
                loginNoFound=0;
                i=limite;
            }else{
                loginNoFound=1;

            }
        }
        if(loginNoFound==1){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Login");
            aviso.setContentText("Datos erroneos, porfavor vuelva a intentar.");
            aviso.show();
            res="0";
        }

    }

    
    //CREAR USUARIO
    public static void crearUsuario(int dpi, String nombre, String apellido, String usuario, String password, String rol){
        for (int i=1; i<limite; i++){
            if(users[i]==null){
                System.out.println(i);
                users[i]=new Usuario(dpi, usuario,password, nombre,apellido,rol);
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro guardado exitosamente!");
                aviso.setContentText("Bienvenido de nuevo "+users[i].getNombre()+ " "+ users[i].getApellido()+"!");
                aviso.show();
                i=limite;

            }
        }
    }





}
