package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.LibrosBiblio;
import org.ipc_p1.models.LibrosTable;
import org.ipc_p1.models.LibrosVirtualesBiblio;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class VentanaLibrosPrestamosController implements Initializable {
    private Main escenarioPrincipal;
    private static LibrosBiblio libros[]=new LibrosBiblio[100];
    @FXML
    private TableView<LibrosBiblio> tblLibro=new TableView<>();
    @FXML private TableColumn<LibrosBiblio, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, Integer>colCopias=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, Integer>colIsbn=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, String>colTema=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, String>colPrestar=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, String>colCod=new TableColumn<>();
    @FXML private TableColumn<LibrosBiblio, Integer>colDisp=new TableColumn<>();
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

    private ObservableList<LibrosBiblio> librosTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        limite=FuncionesLibros.lim();
        if(limite>0){
            for (int i=0; i<limite; i++){
                autor[i]=FuncionesLibros.mostrarAutor(i);
                ano[i]=FuncionesLibros.mostrarAno(i);
                titulo[i]=FuncionesLibros.mostrarTitulo(i);
                edicion[i]=FuncionesLibros.mostrarEdicion(i);
                isbn[i]=FuncionesLibros.mostrarIsbn(i);
                palabras[i]=FuncionesLibros.mostrarPalabras(i);
                desc[i]=FuncionesLibros.mostrarDesc(i);
                temas[i]=FuncionesLibros.mostrarTemas(i);
                copias[i]=FuncionesLibros.mostrarCopias(i);
                disp[i]=FuncionesLibros.mostrarDisp(i);

                btnPrestar[i]=new Button();
                btnPrestar[i].setOnAction(this::handleButtonAction);
                libros[i]=new LibrosBiblio(autor[i],ano[i],titulo[i],edicion[i], isbn[i],palabras[i],desc[i],temas[i],copias[i],disp[i],btnPrestar[i]);
                cont=cont+1;
            }
            if(cont==1){
                librosTable= FXCollections.observableArrayList(
                        libros[0]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==2){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==3){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==4){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==5){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==6){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==7){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==8){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==9){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==10){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==11){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==12){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==13){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==14){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==15){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==16){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==17){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==17){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==18){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==19){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17],libros[18]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            if(cont==20){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17],libros[18],libros[19]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("isbn"));
                colDisp.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<LibrosBiblio, String>("btnPrestar"));
                tblLibro.setItems(librosTable);
            }
            FilteredList<LibrosBiblio> filtro= new FilteredList<>(librosTable, b -> true);

            txtBuscar.textProperty().addListener((observable, oldValue, newValue)->{
                filtro.setPredicate(librosTableSearch -> {
                    if(newValue.isEmpty() || newValue == null){
                        return true;
                    }
                    String cop =String.valueOf(librosTableSearch.getCopias());
                    String ano =String.valueOf(librosTableSearch.getAño());
                    String edi =String.valueOf(librosTableSearch.getEdicion());
                    String isbn =String.valueOf(librosTableSearch.getIsbn());
                    String buscarTxt = newValue.toLowerCase();

                    if(librosTableSearch.getAutor().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(librosTableSearch.getDesc().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(librosTableSearch.getTitulo().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(librosTableSearch.getTemas().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(librosTableSearch.getPalabras().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(cop.indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(isbn.indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(edi.indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(ano.indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else{
                        return false;
                    }
                });
            });
            SortedList<LibrosBiblio> busqueda = new SortedList<>(filtro);

            busqueda.comparatorProperty().bind(tblLibro.comparatorProperty());
            tblLibro.setItems(busqueda);
        }else{
            System.out.println("x");
        }

    }
    private void handleButtonAction(javafx.event.ActionEvent actionEvent) {

        int user =  FuncionesUsuario.actual;
        int codigo;
        if(actionEvent.getSource()==btnPrestar[0]){
            codigo=isbn[0];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[1]){
            codigo=isbn[1];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[2]){
            codigo=isbn[2];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[3]){
            codigo=isbn[3];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[4]){
            codigo=isbn[4];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[5]){
            codigo=isbn[5];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[6]){
            codigo=isbn[6];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[7]){
            codigo=isbn[7];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[8]){
            codigo=isbn[8];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[9]){
            codigo=isbn[9];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[10]){
            codigo=isbn[10];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[11]){
            codigo=isbn[11];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[12]){
            codigo=isbn[12];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[13]){
            codigo=isbn[13];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[14]){
            codigo=isbn[14];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[15]){
            codigo=isbn[15];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[16]){
            codigo=isbn[16];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[17]){
            codigo=isbn[17];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[18]){
            codigo=isbn[18];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[19]){
            codigo=isbn[19];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(actionEvent.getSource()==btnPrestar[20]){
            codigo=isbn[20];
            System.out.println(codigo);
            FuncionesLibros.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
        }
        if(FuncionesLibros.res==2){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Ya tiene el libro en prestamo!");
            aviso.setContentText("Puede continuar!");
            aviso.show();
        }

    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaPrestamosMain();
    }

}
