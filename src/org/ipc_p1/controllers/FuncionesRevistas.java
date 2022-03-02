package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Libros;
import org.ipc_p1.models.Revistas;

public class FuncionesRevistas {
    private static Revistas revistas[]=new Revistas[100];

    public static int cont=1,c;

    public static String[] cod=new String[100];
    public static String[] autor=new String[100];
    public static int[] ano=new int[100];
    public static String[] titulo=new String[100];
    public static String[] palabras=new String[100];
    public static String[] desc=new String[100];
    public static String[] temas=new String[100];
    public static int[] copias=new int[100];
    public static int[] edicion=new int[100];
    public static int[] disp=new int[100];
    public static String[] cate=new String[100];
    public static int[] ejemplar=new int[100];

    public static void crearRevistas(String autor, int ano, String titulo, int edicion, String desc, String cate, String temas, int ejemplares, int copias, int disp, String palabras){
        String cod;
        for (int i=0; i<(cont); i++){
            if(revistas[i]==null){
                cod=String.valueOf(1+i);
                revistas[i]=new Revistas(cod,autor,ano,titulo,edicion,desc,cate,temas,ejemplares,copias,disp,palabras);
                System.out.println(revistas[i].getCodigo());
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
    public static int lim(){
        c=cont-1;
        return c;
    }
    //MODIFICAR
    public static void modificarRevista(String codigo,String autor, int año, String titulo, int edicion, String desc, String cate, String temas, int ejemplares, int copias, int disp, String palabras){
        for (int i=0; i<(cont); i++){
            if(revistas[i].getCodigo().equals(codigo)){
                revistas[i]=new Revistas(codigo,autor,año,titulo,edicion,desc,cate,temas,ejemplares,copias,disp,palabras);
                System.out.println(revistas[i].getTitulo());
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro modificado exitosamente!");
                aviso.setContentText("Puede continuar!");
                aviso.show();
                i=cont;
            }
        }
    }
    //Eliminar
    public static void eliminarRevista(String cod){
        for (int i=0; i<(cont); i++){
            if(revistas[i].getCodigo().equals(cod)){
                revistas[i]=null;
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
        cod[o]=revistas[o].getCodigo();
        return cod[o];
    }
    public static String mostrarAutor(int o){
        autor[o]=revistas[o].getAutor();
        return autor[o];
    }
    public static String mostrarTitulo(int o){
        titulo[o]=revistas[o].getTitulo();
        return titulo[o];
    }
    public static String mostrarTemas(int o){
        temas[o]=revistas[o].getTemas();
        return temas[o];
    }
    public static String mostrarDesc(int o){
        desc[o]=revistas[o].getDesc();
        return desc[o];
    }
    public static String mostrarPalabras(int o){
       palabras[o]=revistas[o].getPalabras();
        return palabras[o];
    }
    public static String mostrarCate(int o){
        cate[o]=revistas[o].getCate();
        return cate[o];
    }
    public static int mostrarAno(int o){
        ano[o]=revistas[o].getAño();
        return ano[o];
    }
    public static int mostrarCopias(int o){
        copias[o]=revistas[o].getCopias();
        return copias[o];
    }
    public static int mostrarEdicion(int o){
        edicion[o]=revistas[o].getEdicion();
        return edicion[o];
    }

    public static int mostrarEjemplares(int o){
        ejemplar[o]=revistas[o].getEjemplares();
        return ejemplar[o];
    }
    public static int mostrarDisp(int o){
        disp[o]=revistas[o].getDisp();
        return disp[o];
    }
}
