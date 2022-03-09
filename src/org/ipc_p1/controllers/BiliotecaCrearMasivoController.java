package org.ipc_p1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class BiliotecaCrearMasivoController implements Initializable {

    private Main escenarioPrincipal;
    @FXML private TextArea txtCrear;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FuncionesUsuario.inicio();
        System.out.println(FuncionesUsuario.mostrarDPI(FuncionesUsuario.actual) + FuncionesUsuario.mostrarNom(FuncionesUsuario.actual) +FuncionesUsuario.mostrarApe(FuncionesUsuario.actual));

        txtCrear.setPromptText("Para separar cada ingreso es \"-\" y para separar campos es \";\"\n ****** " +
                "\n" +
                "TIPO LIBROS: 0;Autor; Año; ISBN; Titulo; Edicion; Palabras; Descripcion; Temas; Copias;\n ******* " +
                "\n" +
                "TIPO REVISTAS: 1; Autor;Año;Titulo; Edicion; Descripcion; Categoria; Ejemplares; Temas; Palabras; Copias;\n ******** " +
                "\n" +
                "TIPO TESIS: 2; Autor;Año;Titulo; Palabras; Area; Temas; Descripcion; Edicion; Copias;\n    ");

    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
    }

    public void guardar(){
        String tipo;

        String array[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int a=1;
        String autor;
        int ano;
        String titulo;
        int edicion;
        int isbn;
        String palabras;
        String desc;
        String temas;
        int copias;
        int disp;
        int tam;
        String cate;
        int ejemplares;
        String areas;
        int dispo=0;
        String text=txtCrear.getText();
        String[] tp = text.split("\\-");


        if(txtCrear.getText().isEmpty()){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("ERROR!");
            aviso.setContentText("No hay ningun dato dentro del texto.");
            aviso.show();
        }else{
            for(int i=0;i<tp.length; i++){
                String[] partes=tp[i].split("\\;");

                if(partes[0].trim().equals("0")){
                    if(partes.length<10 || partes.length>10){
                        Alert aviso = new Alert(Alert.AlertType.ERROR);
                        aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                        aviso.setHeaderText("ERROR!");
                        aviso.setContentText("Debe de llenar todos los campos o se ha pasado del limite de campos en libros!");
                        aviso.show();
                    }else if(partes.length==10){
                        for (int j= 0; j < array.length; j++) {
                            if (partes[2].contains(array[j]) || partes[3].contains(array[j]) || partes[9].contains(array[j]) || partes[5].contains(array[j])) {
                                a=2;

                            }
                        }
                        if (a==2){
                            Alert aviso = new Alert(Alert.AlertType.ERROR);
                            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                            aviso.setHeaderText("ERROR!");
                            aviso.setContentText("Los campos de año, isbn, copias y edicion no pueden llevar letras en libros.");
                            aviso.show();
                        }
                        if(a!=2){
                            autor = partes[1].trim();
                            ano = Integer.valueOf(partes[2].trim());
                            isbn = Integer.valueOf(partes[3].trim());
                            titulo = partes[4].trim();
                            edicion = Integer.valueOf(partes[5].trim());
                            palabras = partes[6].trim();
                            desc = partes[7].trim();
                            temas = partes[8].trim();
                            copias = Integer.valueOf(partes[9].trim());
                            dispo=copias;
                            FuncionesLibros.crearLibro(autor,ano,titulo,edicion,isbn,palabras,desc,temas,copias,dispo);
                        }
                    }
                }
                if(partes[0].trim().equals("1")){
                    if(partes.length<11 || partes.length>11){
                        Alert aviso = new Alert(Alert.AlertType.ERROR);
                        aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                        aviso.setHeaderText("ERROR!");
                        aviso.setContentText("Debe de llenar todos los campos o se ha pasado del limite de campos en revistas!");
                        aviso.show();
                    }else if(partes.length==11) {
                        for (int k = 0; k < array.length; k++) {
                            if (partes[2].contains(array[k]) || partes[4].contains(array[k]) || partes[7].contains(array[k]) || partes[10].contains(array[k])) {
                                a = 2;

                            }
                        }
                        if (a==2){
                            Alert aviso = new Alert(Alert.AlertType.ERROR);
                            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                            aviso.setHeaderText("ERROR!");
                            aviso.setContentText("Los campos de año, ejemplares, copias y edicion no pueden llevar letras en Revistas.");
                            aviso.show();
                        }
                        if(a!=2){
                            autor = partes[1].trim();
                            ano = Integer.valueOf(partes[2].trim());
                            titulo = partes[3];
                            edicion = Integer.valueOf(partes[4].trim());
                            cate=partes[6].trim();
                            desc = partes[5].trim();
                            ejemplares=Integer.valueOf(partes[7].trim());
                            temas = partes[8].trim();
                            palabras=partes[9].trim();
                            copias = Integer.valueOf(partes[10].trim());
                            dispo=copias;
                            FuncionesRevistas.crearRevistas(autor,ano,titulo,edicion,desc,cate,temas,ejemplares,copias,copias,palabras);
                        }
                    }



                }
                if(partes[0].trim().equals("2")){
                    if(partes.length<10 || partes.length>10){
                        Alert aviso = new Alert(Alert.AlertType.ERROR);
                        aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                        aviso.setHeaderText("ERROR!");
                        aviso.setContentText("Debe de llenar todos los campos o se ha pasado del limite de campos en Tesis!");
                        aviso.show();
                    }else if(partes.length==10) {
                        for (int k = 0; k < array.length; k++) {
                            if (partes[2].contains(array[k]) || partes[8].contains(array[k]) || partes[9].contains(array[k])) {
                                a = 2;
                            }
                        }
                        if (a==2){
                            Alert aviso = new Alert(Alert.AlertType.ERROR);
                            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                            aviso.setHeaderText("ERROR!");
                            aviso.setContentText("Los campos de año, copias y edicion no pueden llevar letras en Tesis.");
                            aviso.show();
                        }
                    }
                    if(a!=2){
                        autor = partes[1].trim();
                        ano = Integer.valueOf(partes[2].trim());
                        titulo = partes[3].trim();
                        edicion = Integer.valueOf(partes[8].trim());
                        areas=partes[5].trim();
                        desc = partes[7].trim();
                        temas = partes[6].trim();
                        palabras=partes[4].trim();
                        copias = Integer.valueOf(partes[9].trim());
                        dispo=copias;
                        FuncionesTesis.crearTesis(autor,ano,titulo,edicion,desc,temas,areas,copias,copias,palabras);                       }

                }
                partes=null;
            }
        }

    }


}
