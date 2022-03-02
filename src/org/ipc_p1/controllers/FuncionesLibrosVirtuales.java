package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Libros;
import org.ipc_p1.models.LibrosVirtuales;
import org.ipc_p1.models.Tesis;

public class FuncionesLibrosVirtuales {
    private static LibrosVirtuales librosVirtuales[]=new LibrosVirtuales[100];
    public static int cont=1,c;

    public static String[] autor=new String[100];
    public static String[] cod=new String[100];
    public static int[] ano=new int[100];
    public static String[] titulo=new String[100];
    public static int[] tam=new int[100];
    public static int[] edicion=new int[100];
    public static String[] palabras=new String[100];
    public static String[] desc=new String[100];
    public static String[] temas=new String[100];

    public static void crearLbVirtuales(String autor, int ano, String titulo, String palabras, String desc, String temas, int tam, int edicion){
        String cod;
        for (int i=0; i<(cont); i++){
            if(librosVirtuales[i]==null){
                cod=String.valueOf(1+i);
                librosVirtuales[i]=new LibrosVirtuales(cod,autor,ano,titulo,palabras,desc,temas,tam,edicion);
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
    public static int lim(){
        c=cont-1;
        return c;
    }
    //modificar
    public static void modificarLibro(String cod,String autor, int año, String titulo, String palabras, String desc, String temas, int tam, int edicion){
        for (int i=0; i<(cont); i++){
            if(librosVirtuales[i].getCod().equals(cod)){
                librosVirtuales[i]=new LibrosVirtuales(cod,autor,año,titulo,palabras,desc,temas,tam,edicion);
                System.out.println(librosVirtuales[i].getTitulo());
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro modificado exitosamente!");
                aviso.setContentText("Puede continuar!");
                aviso.show();
                i=cont;
            }
        }
    }
    //eliminar
    public static void eliminarLibro(String cod){

        for (int i=0; i<(cont); i++){
            if(librosVirtuales[i].getCod().equals(cod)){
                librosVirtuales[i]=null;
                System.out.println(librosVirtuales[i]);
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro eliminado exitosamente!");
                aviso.setContentText("Puede continuar!");
                aviso.show();
                cont=cont-1;
                i=cont;
            }
        }

    }
    //Traslado de datos a tabla
    public static String codigo(int o){
        cod[o]=librosVirtuales[o].getCod();
        return cod[o];
    }
    public static String mostrarAutor(int o){
        autor[o]=librosVirtuales[o].getAutor();
        return autor[o];
    }
    public static String mostrarTitulo(int o){
        titulo[o]=librosVirtuales[o].getTitulo();
        return titulo[o];
    }
    public static String mostrarTemas(int o){
        temas[o]=librosVirtuales[o].getTemas();
        return temas[o];
    }
    public static String mostrarDesc(int o){
        desc[o]=librosVirtuales[o].getDesc();
        return desc[o];
    }
    public static String mostrarPalabras(int o){
        palabras[o]=librosVirtuales[o].getPalabras();
        return palabras[o];
    }

    public static int mostrarAno(int o){
        ano[o]=librosVirtuales[o].getAño();
        return ano[o];
    }
    public static int mostrarTam(int o){
        tam[o]=librosVirtuales[o].getTam();
        return tam[o];
    }
    public static int mostrarEdicion(int o){
        edicion[o]=librosVirtuales[o].getEdicion();
        return edicion[o];
    }


}
