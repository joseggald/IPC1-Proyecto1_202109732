package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Usuario;

public class FuncionesUsuario {
    //VARIABLES PRINCIPALES
    public static int limite=100, loginNoFound=0, cont=1, c;
    private static Usuario users[]=new Usuario[100];

    //DATOS A MOSTRAR
    public static int[] dpi=new int[100];
    public static String[] nom=new String[100];
    public static String[] ape=new String[100];
    public static String[] usern=new String[100];
    public static String[] pass=new String[100];
    public static String[] rol=new String[100];
    public static Usuario user=new Usuario(2020010689,"admin","1234","José","Galdámez","Administrador");

    //VARIABLES EXTRAS
    String res;

    //LOGIN
    public void login(String username, String password){
        users[0]=user;
        dpi[0]=user.getDpi();
        nom[0]=user.getNombre();
        ape[0]=user.getApellido();
        usern[0]=user.getUsername();
        pass[0]=user.getPassword();
        rol[0]=user.getRol();

        for (int i=0; i<cont; i++){
            if(username.equals(users[i].getUsername()) && password.equals(users[i].getPassword()) && username.length()>2 && password.length()>2){

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
    public static void crearUsuario(int dp, String nombre, String apellido, String usuario, String password, String rol){
        int r=1;
        for (int i=0; i<cont; i++){

            if(users[i].getDpi()==dp){
                r=1;
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("NO REGISTRADO");
                aviso.setContentText("El DPI no puede repertirse en otro usuario.");
                aviso.show();
                i=cont;
                dp=0;
            }
            else{
                r=0;

            }
        }
        if(r==0){
            for (int i=1; i<=(cont); i++){
                if(users[i]==null){
                    users[i]=new Usuario(dp, usuario,password, nombre,apellido,rol);
                    Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                    aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                    aviso.setHeaderText("Registro guardado exitosamente!");
                    aviso.setContentText("Bienvenido de nuevo "+users[i].getNombre()+ " "+ users[i].getApellido()+"!");
                    aviso.show();
                    dpi[i]=users[i].getDpi();
                    cont=cont+1;
                    i=cont;
                }

            }
        }

    }

    //MODIFICAR USUARIO
    public static void modificarUsuario(int dp, String nombre, String apellido, String usuario, String password, String rol){
        if(users[0].getDpi()==dp){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO MODIFICADO");
            aviso.setContentText("No puede modificar al Administrador principal.");
            aviso.show();
        }
        for (int i=1; i<(cont); i++){
            if(users[i].getDpi()==dp){
                users[i]=new Usuario(dp, usuario,password, nombre,apellido,rol);
                System.out.println(users[i].getUsername());
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro modificado exitosamente!");
                aviso.setContentText("Puede continuar!");
                aviso.show();
                i=limite;
            }
        }
    }

    //ELIMINAR USUARIO
    public static void eliminarUsuario(int dp){
        if(users[0].getDpi()==dp){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO ELIMINADO");
            aviso.setContentText("No puede ser eliminado el Administrador principal.");
            aviso.show();
        }
        for (int i=1; i<(cont); i++){
            if(users[i].getDpi()==dp){
                users[i]=null;
                System.out.println(users[i]);
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro eliminado exitosamente!");
                aviso.setContentText("Puede continuar!");
                aviso.show();
                cont=cont-1;
                i=limite;
            }
        }
    }

    //MOSTRAR USUARIOS
    //DPI
    public static int mostrarDPI(int o){
        dpi[o]=users[o].getDpi();
        return dpi[o];
    }

    //NOMBRE
    public static String mostrarNom(int o){
        nom[o]=users[o].getNombre();
        return nom[o];
    }

    //APELLIDO
    public static String mostrarApe(int o){
        ape[o]=users[o].getApellido();
        return ape[o];
    }

    //USUARIO
    public static String mostrarUser(int o){
        usern[o]=users[o].getUsername();
        return usern[o];
    }

    //PASSWORD
    public static String mostrarPass(int o){
        pass[o]=users[o].getPassword();
        return pass[o];
    }

    //ROLES
    public static String mostrarRol(int o){
        rol[o]=users[o].getRol();
        return rol[o];
    }

    //CONTADOR DE USUARIOS
    public static int lim(){
        c=cont;
        return c;
    }

}
