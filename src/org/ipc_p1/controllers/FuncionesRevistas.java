package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Libros;
import org.ipc_p1.models.Revistas;

public class FuncionesRevistas {
    private static Revistas revistas[]=new Revistas[100];

    public static int cont=1;

    public static String[] autor=new String[100];
    public static int[] ano=new int[100];
    public static String[] titulo=new String[100];
    public static String[] palabras=new String[100];
    public static String[] desc=new String[100];
    public static String[] temas=new String[100];
    public static int[] copias=new int[100];
    public static int[] disp=new int[100];
    public static String[] cate=new String[100];
    public static int[] ejemplar=new int[100];

    public static void crearRevistas(String autor, int ano, String titulo, int edicion, String desc, String cate, String temas, int ejemplares, int copias, int disp, String palabras){
        for (int i=0; i<(cont); i++){
            if(revistas[i]==null){
                revistas[i]=new Revistas(autor,ano,titulo,edicion,desc,cate,temas,ejemplares,copias,disp,palabras);
                System.out.println(revistas[i].getAutor());
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro guardado exitosamente!");
                aviso.setContentText("Nueva revista en el registro!");
                aviso.show();
                cont=cont+1;
                i=cont;
            }

        }
    }
}
