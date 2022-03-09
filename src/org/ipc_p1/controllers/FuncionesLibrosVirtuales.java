package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.Libros;
import org.ipc_p1.models.LibrosVirtuales;
import org.ipc_p1.models.Tesis;

public class FuncionesLibrosVirtuales {
    private static LibrosVirtuales librosVirtuales[]=new LibrosVirtuales[100];
    public static int cont=1,c,res,lim=0;
    public static int[] col=new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

    private static LibrosVirtuales bibliotecaUser[][]=new LibrosVirtuales[100][100];
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
                librosVirtuales[i]=librosVirtuales[cont-2];
                librosVirtuales[cont-2]=null;
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

    //Guardando en su BiblioVirtual
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
                if(librosVirtuales[i].getCod().equals(cod)){
                    for(int j=0; j<(col[pos]); j++){
                        if(bibliotecaUser[pos][j]==null){
                            bibliotecaUser[pos][j]=librosVirtuales[i];
                            System.out.println(bibliotecaUser[pos][j].getAutor());
                            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                            aviso.setHeaderText("Fue agregado exitosamente a su biblioteca virtual!");
                            aviso.setContentText("Puede continuar!");
                            aviso.show();
                            col[pos]=col[pos]+1;
                            System.out.println(lim);
                            j=col[pos];
                            i=cont;
                        }
                    }
                }
            }
        }

    }

    public static void eliminarBiblio(String cod, int pos){
        for (int i=0; i<(col[pos]-1); i++){
            if(bibliotecaUser[pos][i].getCod().equals(cod)){
                bibliotecaUser[pos][i]=null;
                bibliotecaUser[pos][i]=bibliotecaUser[pos][col[pos]-1];
                bibliotecaUser[pos][col[pos]-1]=null;
                col[pos]=col[pos]-1;
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Fue eliminado exitosamente de su biblioteca virtual!");
                aviso.setContentText("Puede continuar!");
                aviso.show();
            }
        }

    }
    public static int limite(int o){
        int a;
        a=col[o]-1;
        return a;
    }

    //Traslado de datos a tabla
    public static String codUser(int pos,int j){
        String cod;
        cod=bibliotecaUser[pos][j].getCod();
        return cod;
    }
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
    public static int tamUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getTam();
        return a;
    }
    public static int edicionUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getEdicion();
        return a;
    }

}
