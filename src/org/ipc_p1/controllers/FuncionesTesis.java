package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Revistas;
import org.ipc_p1.models.Tesis;

public class FuncionesTesis {
    private static Tesis tesis[]=new Tesis[100];
    public static int cont=1,c;

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
    public static String[] cod=new String[100];
    public static void crearTesis(String autor, int ano, String titulo, int edicion, String desc, String temas, String areas, int copias, int disp, String palabras){
        String cod;
        for (int i=0; i<(cont); i++){
            if(tesis[i]==null){
                cod=String.valueOf(1+i);
                tesis[i]=new Tesis(cod,autor,ano,titulo,edicion,desc,temas,areas,copias,disp,palabras);
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
    public static int lim(){
        c=cont-1;
        return c;
    }
    //MODIFICAR
    public static void modificarTesis(String cod,String autor, int ano, String titulo, int edicion, String desc, String temas, String areas, int copias, int disp, String palabras){
        for (int i=0; i<(cont); i++){
            if(tesis[i].getCod().equals(cod)){
                tesis[i]=new Tesis(cod,autor,ano,titulo,edicion,desc,temas,areas,copias,disp,palabras);
                System.out.println(tesis[i].getTitulo());
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
    public static void eliminarTesis(String cod){
        for (int i=0; i<(cont); i++){
            if(tesis[i].getCod().equals(cod)){
                tesis[i]=null;
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
        cod[o]=tesis[o].getCod();
        return cod[o];
    }
    public static String mostrarAutor(int o){
        autor[o]=tesis[o].getAutor();
        return autor[o];
    }
    public static String mostrarTitulo(int o){
        titulo[o]=tesis[o].getTitulo();
        return titulo[o];
    }
    public static String mostrarTemas(int o){
        temas[o]=tesis[o].getTemas();
        return temas[o];
    }
    public static String mostrarDesc(int o){
        desc[o]=tesis[o].getDesc();
        return desc[o];
    }
    public static String mostrarPalabras(int o){
        palabras[o]=tesis[o].getPalabras();
        return palabras[o];
    }
    public static String mostrarArea(int o){
        area[o]=tesis[o].getAreas();
        return area[o];
    }
    public static int mostrarAno(int o){
        ano[o]=tesis[o].getAño();
        return ano[o];
    }
    public static int mostrarCopias(int o){
        copias[o]=tesis[o].getCopias();
        return copias[o];
    }
    public static int mostrarEdicion(int o){
        edicion[o]=tesis[o].getEdicion();
        return edicion[o];
    }

    public static int mostrarDisp(int o){
        disp[o]=tesis[o].getDisp();
        return disp[o];
    }

}
