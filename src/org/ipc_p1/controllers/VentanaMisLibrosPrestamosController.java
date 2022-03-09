package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.LibrosBiblio;
import org.ipc_p1.models.LibrosBiblioDev;
import org.ipc_p1.models.LibrosTable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class VentanaMisLibrosPrestamosController implements Initializable {
    private Main escenarioPrincipal;
    private static LibrosBiblioDev libros[]=new LibrosBiblioDev[100];
    @FXML
    private TableView<LibrosBiblioDev> tblLibro=new TableView<>();
    @FXML private TableColumn<LibrosBiblioDev, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, Integer>colCopias=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, Integer>colIsbn=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, String>colTema=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblioDev, String>colPrestar=new TableColumn<>();
    @FXML private TextField txtBuscar;
    String[] autor=new String[100];
    int[] ano=new int[100];
    String[] titulo=new String[100];
    int[] edicion=new int[100];
    int[] isbn=new int[100];
    String[] palabras=new String[100];
    String[] desc=new String[100];
    String[] temas=new String[100];
    int[] copias=new int[100];
    int[] disp=new int[100];
    Button[] btnPrestar=new Button[100];

    private ObservableList<LibrosBiblioDev> librosTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        limite=FuncionesLibros.limite(FuncionesUsuario.actual);
        if(limite>0){
            for (int i=0; i<limite; i++){
                autor[i]=FuncionesLibros.autorUser(FuncionesUsuario.actual,i);
                ano[i]=FuncionesLibros.anoUser(FuncionesUsuario.actual,i);
                titulo[i]=FuncionesLibros.tituloUser(FuncionesUsuario.actual,i);
                palabras[i]=FuncionesLibros.palabrasUser(FuncionesUsuario.actual,i);
                desc[i]=FuncionesLibros.descUser(FuncionesUsuario.actual,i);
                temas[i]=FuncionesLibros.temasUser(FuncionesUsuario.actual,i);
                copias[i]=FuncionesLibros.copiasUser(FuncionesUsuario.actual,i);
                disp[i]=FuncionesLibros.dispUser(FuncionesUsuario.actual,i);
                isbn[i]=FuncionesLibros.isbnUser(FuncionesUsuario.actual,i);
                edicion[i]=FuncionesLibros.edicionUser(FuncionesUsuario.actual,i);
                btnPrestar[i]=new Button();
                btnPrestar[i].setOnAction(this::handleButtonAction);
                libros[i]=new LibrosBiblioDev(autor[i],ano[i],titulo[i],edicion[i], isbn[i],palabras[i],desc[i],temas[i],copias[i],disp[i],btnPrestar[i]);
                cont=cont+1;
            }
            if(cont==1){
                librosTable= FXCollections.observableArrayList(
                        libros[0]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==2){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==3){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==4){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==5){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==6){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==7){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==8){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==9){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==10){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==11){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==12){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==13){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==14){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==15){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==16){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==17){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==18){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==19){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17],libros[18]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==20){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17],libros[18],libros[19]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, Integer>("isbn"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
        }

    }
    private void handleButtonAction(javafx.event.ActionEvent actionEvent) {
        int user =  FuncionesUsuario.actual;
        int codigo;
        if(actionEvent.getSource()==btnPrestar[0]){
            codigo=isbn[0];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }

        }
        if(actionEvent.getSource()==btnPrestar[1]){
            codigo=isbn[1];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[2]){
            codigo=isbn[2];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[3]){
            codigo=isbn[3];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[4]){
            codigo=isbn[4];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[5]){
            codigo=isbn[5];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[6]){
            codigo=isbn[6];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[7]){
            codigo=isbn[7];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[8]){
            codigo=isbn[8];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[9]){
            codigo=isbn[9];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[10]){
            codigo=isbn[10];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[11]){
            codigo=isbn[11];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[12]){
            codigo=isbn[12];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[13]){
            codigo=isbn[13];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[14]){
            codigo=isbn[14];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[15]){
            codigo=isbn[15];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[16]){
            codigo=isbn[16];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[17]){
            codigo=isbn[17];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[18]){
            codigo=isbn[18];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[19]){
            codigo=isbn[19];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
        if(actionEvent.getSource()==btnPrestar[20]){
            codigo=isbn[20];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Libro.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesLibros.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
            }
        }
    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {

        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaPrestamosMain();
    }

}
