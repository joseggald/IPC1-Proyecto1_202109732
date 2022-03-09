package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Revistas;
import org.ipc_p1.models.Tesis;

public class FuncionesTesis {
    private static Tesis tesis[]=new Tesis[100];
    private static Tesis bibliotecaUser[][]=new Tesis[100][100];
    public static int cont=1,c,res,lim;
    public static int[] prestados=new int[100];
    public static int[] col=new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

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
                tesis[i]=tesis[cont-1];
                tesis[cont-1]=null;
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
    //prestar
    public static void agregar(String cod, int pos){
        int li=col[pos]-1;
        if(li==0){
            res=1;
        }
        if (li>0){
            for(int k=0; k<li; k++){
                if(bibliotecaUser[pos][k].getCod().equals(cod)){
                    res=2;
                    k=li;
                }else{
                    res=1;
                }
            }
        }
        if(res==1){
            for (int i=0; i<(cont); i++){
                if(tesis[i].getCod().equals(cod)){
                    for(int j=0; j<(col[pos]); j++){
                        if(bibliotecaUser[pos][j]==null){
                            if(tesis[i].getDisp()<1){
                                Alert aviso = new Alert(Alert.AlertType.ERROR);
                                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                                aviso.setHeaderText("Ya no hay copias disponibles!");
                                aviso.setContentText("Elija otra tesis!");
                                aviso.show();
                                res=3;
                                j=col[pos];
                                i=cont;
                            }else if(tesis[i].getDisp()>0){
                                tesis[i].setDisp(tesis[i].getDisp()-1);
                                bibliotecaUser[pos][j]=tesis[i];
                                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                                aviso.setHeaderText("Fue agregado exitosamente a su biblioteca de prestamos de tesis!");
                                aviso.setContentText("Puede continuar!");
                                aviso.show();
                                prestados[pos]=prestados[pos]+1;
                                col[pos]=col[pos]+1;
                                j=col[pos];
                                i=cont;
                            }
                        }
                    }
                }
            }
        }

    }
    //eliminar biblio
    public static void eliminarBiblio(String cod, int pos){
        for (int i=0; i<(col[pos]-1); i++){
            if(bibliotecaUser[pos][i].getCod().equals(cod)){
                bibliotecaUser[pos][i]=null;
                bibliotecaUser[pos][i]=bibliotecaUser[pos][col[pos]-1];
                bibliotecaUser[pos][col[pos]-1]=null;
                tesis[i].setDisp(tesis[i].getDisp()+1);
                col[pos]=col[pos]-1;
                prestados[pos]=prestados[pos]-1;
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Fue devuelta exitosamente la tesis!");
                aviso.setContentText("Puede continuar!");
                aviso.show();
            }
        }
    }
    //Seteado
    public static String autorUser(int pos,int j){
        String autor;
        autor=bibliotecaUser[pos][j].getAutor();
        return autor;
    }
    public static int anoUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getAño();
        return a;
    }
    public static String codUser(int pos,int j){
        String a;
        a= bibliotecaUser[pos][j].getCod();
        return a;
    }
    public static String tituloUser(int pos,int j){
        String a;
        a=bibliotecaUser[pos][j].getTitulo();
        return a;
    }
    public static String palabrasUser(int pos,int j){
        String a;
        a=bibliotecaUser[pos][j].getPalabras();
        return a;
    }
    public static String descUser(int pos,int j){
        String a;
        a=bibliotecaUser[pos][j].getDesc();
        return a;
    }
    public static String temasUser(int pos,int j){
        String a;
        a=bibliotecaUser[pos][j].getTemas();
        return a;
    }
    public static String areaUser(int pos,int j){
        String a;
        a=bibliotecaUser[pos][j].getAreas();
        return a;
    }
    public static int copiasUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getCopias();
        return a;
    }

    public static int edicionUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getEdicion();
        return a;
    }
    public static int dispUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getDisp();
        return a;
    }
    //limite user
    public static int limite(int o){
        int a;
        a=col[o]-1;
        return a;
    }

}
