package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Libros;
import org.ipc_p1.models.Revistas;

public class FuncionesRevistas {
    private static Revistas revistas[]=new Revistas[100];
    private static Revistas bibliotecaUser[][]=new Revistas[100][100];
    public static int cont=1,c,res,lim;
    public static int[] prestados=new int[100];
    public static int[] col=new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

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
                revistas[i]=revistas[cont-1];
                revistas[cont-1]=null;
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
    //prestar
    public static void agregar(String cod, int pos){
        int li=col[pos]-1;
        if(li==0){
            res=1;
        }
        if (li>0){
            for(int k=0; k<li; k++){

                if(bibliotecaUser[pos][k].getCodigo().equals(cod)){
                    res=2;
                    k=li;
                }else{
                    res=1;
                }
            }

        }
        if(res==1){
            for (int i=0; i<(cont); i++){
                if(revistas[i].getCodigo().equals(cod)){
                    for(int j=0; j<(col[pos]); j++){
                        if(bibliotecaUser[pos][j]==null){
                            if(revistas[i].getDisp()<1){
                                Alert aviso = new Alert(Alert.AlertType.ERROR);
                                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                                aviso.setHeaderText("Ya no hay copias disponibles!");
                                aviso.setContentText("Elija otra revista!");
                                aviso.show();
                                res=3;
                                j=col[pos];
                                i=cont;
                            }else if(revistas[i].getDisp()>0){
                                revistas[i].setDisp(revistas[i].getDisp()-1);
                                bibliotecaUser[pos][j]=revistas[i];
                                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                                aviso.setHeaderText("Fue agregado exitosamente a su biblioteca de prestamos de revistas!");
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
        a= bibliotecaUser[pos][j].getCodigo();
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
    public static String cateUser(int pos,int j){
        String a;
        a=bibliotecaUser[pos][j].getCate();
        return a;
    }
    public static int copiasUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getCopias();
        return a;
    }
    public static int ejemplarUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getEjemplares();
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
    //eliminar biblio
    public static void eliminarBiblio(String cod, int pos){
        for (int i=0; i<(col[pos]-1); i++){
            if(bibliotecaUser[pos][i].getCodigo().equals(cod)){
                bibliotecaUser[pos][i]=null;
                bibliotecaUser[pos][i]=bibliotecaUser[pos][col[pos]-1];
                bibliotecaUser[pos][col[pos]-1]=null;
                revistas[i].setDisp(revistas[i].getDisp()+1);
                col[pos]=col[pos]-1;
                prestados[pos]=prestados[pos]-1;
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Fue devuelto exitosamente el libro!");
                aviso.setContentText("Puede continuar!");
                aviso.show();
            }
        }

    }
}
