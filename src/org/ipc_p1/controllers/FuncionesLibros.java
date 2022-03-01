package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.*;

public class FuncionesLibros {

    public static int cont=1, c;

    //VARIABLES PRINCIPALES
    private static Libros libros[]=new Libros[100];




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
    public static int lim(){
        c=cont-1;
        return c;
    }

    //Traslado de datos a tabla
    public static String mostrarAutor(int o){
        autor[o]=libros[o].getAutor();
        return autor[o];
    }
    public static int mostrarAno(int o){
        ano[o]=libros[o].getAno();
        return ano[o];
    }
    public static String mostrarTitulo(int o){
        titulo[o]=libros[o].getTitulo();
        return titulo[o];
    }
    public static int mostrarEdicion(int o){
        edicion[o]=libros[o].getEdicion();
        return edicion[o];
    }
    public static int mostrarIsbn(int o){
        isbn[o]=libros[o].getIsbn();
        return isbn[o];
    }
    public static String mostrarPalabras(int o){
        palabras[o]=libros[o].getPalabras();
        return palabras[o];
    }
    public static String mostrarDesc(int o){
        desc[o]=libros[o].getDesc();
        return desc[o];
    }
    public static String mostrarTemas(int o){
        temas[o]=libros[o].getTemas();
        return temas[o];
    }
    public static int mostrarCopias(int o){
        copias[o]=libros[o].getCopias();
        return copias[o];
    }
    public static int mostrarDisp(int o){
        disp[o]=libros[o].getDisp();
        return disp[o];
    }
}
