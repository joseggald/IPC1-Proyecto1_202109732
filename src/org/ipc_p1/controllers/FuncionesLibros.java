package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.*;

public class FuncionesLibros {

    public static int cont=1;

    //VARIABLES PRINCIPALES
    private static Libros libros[]=new Libros[100];
    private static LibrosVirtuales librosVirtuales[]=new LibrosVirtuales[100];
    private static Revistas revistas[]=new Revistas[100];
    private static Tesis tesis[]=new Tesis[100];

    //DATOS A MOSTRAR
    public static String[] autor=new String[100];
    public static int[] ano=new int[100];
    public static String[] titulo=new String[100];
    public static int[] edicion=new int[100];
    public static int[] isbn=new int[100];
    public static String[] palabras=new String[100];
    public static String[] desc=new String[100];
    public static String[] temas=new String[100];
    public static int[] copias=new int[100];
    public static int[] disp=new int[100];

    public static void crearLibro(String aut, int ano, String titulo, int edicion, int isbn, String palabras, String desc, String temas, int copias, int disp){
            for (int i=0; i<(cont); i++){
                if(libros[i]==null){
                    libros[i]=new Libros(aut,ano,titulo,edicion,isbn,palabras,desc,temas,copias,disp);
                    Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                    aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                    aviso.setHeaderText("Registro guardado exitosamente!");
                    aviso.setContentText("Nuevo libro en el registro!");
                    aviso.show();
                    cont=cont+1;
                    i=cont;
                }

            }
    }


}
