package org.ipc_p1.controllers;

import javafx.scene.control.Alert;
import org.ipc_p1.models.*;

public class FuncionesLibros {

    public static int cont=1, c,res,lim, a=0;
    public static int[] col=new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    public static int[] prestados=new int[100];

    //VARIABLES PRINCIPALES
    private static Libros libros[]=new Libros[100];
    private static Libros bibliotecaUser[][]=new Libros[100][100];


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

    //crear
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

    //modificar
    public static void modificarLibro(String aut, int ano, String titulo, int edicion, int isbn, String palabras, String desc, String temas, int copias, int disp){
        for (int i=0; i<(cont); i++){
            if(libros[i].getIsbn()==isbn){
                libros[i]=new Libros(aut,ano,titulo,edicion,isbn,palabras,desc,temas,copias,disp);
                System.out.println(libros[i].getTitulo());
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
    public static void eliminarLibro(int isbn, String autor, String titulo){
        for (int i=0; i<(cont); i++){
            if(libros[i].getTitulo().equals(titulo) && libros[i].getAutor().equals(autor) && libros[i].getIsbn()==isbn){
                libros[i]=null;
                libros[i]=libros[cont-1];
                libros[cont-1]=null;
                System.out.println(libros[i]);
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
    public static void agregar(int cod, int pos){
        int li=col[pos]-1;
        if(li==0){
            res=1;
        }
        if (li>0){
            for(int k=0; k<li; k++){

                if(bibliotecaUser[pos][k].getIsbn()==cod){
                    res=2;
                    k=li;
                }else{
                    res=1;
                }
            }

        }
        if(res==1){
            for (int i=0; i<(cont); i++){
                if(libros[i].getIsbn()==cod){
                    for(int j=0; j<(col[pos]); j++){
                        if(bibliotecaUser[pos][j]==null){
                            if(libros[i].getDisp()<1){
                                Alert aviso = new Alert(Alert.AlertType.ERROR);
                                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                                aviso.setHeaderText("Ya no hay copias disponibles!");
                                aviso.setContentText("Elija otro libro!");
                                aviso.show();
                                res=3;
                                j=col[pos];
                                i=cont;
                            }else if(libros[i].getDisp()>0){
                                libros[i].setDisp(libros[i].getDisp()-1);
                            bibliotecaUser[pos][j]=libros[i];
                            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                            aviso.setHeaderText("Fue agregado exitosamente a su biblioteca de prestamos de libros!");
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

    //Prestamos
    public static int limite(int o){
        int a;
        a=col[o]-1;
        return a;
    }
    public static void eliminarBiblio(int cod, int pos){
        for (int i=0; i<(col[pos]-1); i++){
            if(bibliotecaUser[pos][i].getIsbn()==cod){
                bibliotecaUser[pos][i]=null;
                bibliotecaUser[pos][i]=bibliotecaUser[pos][col[pos]-1];
                bibliotecaUser[pos][col[pos]-1]=null;
                libros[i].setDisp(libros[i].getDisp()+1);
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

    //Seteado de valores
    public static String autorUser(int pos,int j){
        String autor;
        autor=bibliotecaUser[pos][j].getAutor();
        return autor;
    }
    public static int anoUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getAno();
        return a;
    }
    public static int isbnUser(int pos,int j){
        int a;
        a= bibliotecaUser[pos][j].getIsbn();
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


}
