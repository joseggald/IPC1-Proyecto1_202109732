package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.LibrosVirtuales;
import org.ipc_p1.models.Tesis;

public class FuncionesLibrosVirtuales {
    private static LibrosVirtuales librosVirtuales[]=new LibrosVirtuales[100];
    public static int cont=1;

    public static String[] autor=new String[100];
    public static int[] ano=new int[100];
    public static String[] titulo=new String[100];
    public static int[] tam=new int[100];
    public static String[] palabras=new String[100];
    public static String[] desc=new String[100];
    public static String[] temas=new String[100];

    public static void crearLbVirtuales(String autor, int ano, String titulo, String palabras, String desc, String temas, int tam){
        for (int i=0; i<(cont); i++){
            if(librosVirtuales[i]==null){
                librosVirtuales[i]=new LibrosVirtuales(autor,ano,titulo,palabras,desc,temas,tam);
                System.out.println(librosVirtuales[i].getAutor());
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro guardado exitosamente!");
                aviso.setContentText("Nuevo libro virtual en el registro!");
                aviso.show();
                cont=cont+1;
                i=cont;
            }

        }
    }
}
