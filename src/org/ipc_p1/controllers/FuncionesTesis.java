package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Revistas;
import org.ipc_p1.models.Tesis;

public class FuncionesTesis {
    private static Tesis tesis[]=new Tesis[100];
    public static int cont=1;

    public static String[] autor=new String[100];
    public static int[] ano=new int[100];
    public static String[] titulo=new String[100];
    public static String[] palabras=new String[100];
    public static String[] area=new String[100];
    public static String[] desc=new String[100];
    public static String[] temas=new String[100];
    public static int[] copias=new int[100];
    public static int[] disp=new int[100];
    public static int[] edicion=new int[100];

    public static void crearTesis(String autor, int ano, String titulo, int edicion, String desc, String temas, String areas, int copias, int disp, String palabras){
        for (int i=0; i<(cont); i++){
            if(tesis[i]==null){
                tesis[i]=new Tesis(autor,ano,titulo,edicion,desc,temas,areas,copias,disp,palabras);
                System.out.println(tesis[i].getAutor());
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro guardado exitosamente!");
                aviso.setContentText("Nueva tesis en el registro!");
                aviso.show();
                cont=cont+1;
                i=cont;
            }

        }
    }


}
