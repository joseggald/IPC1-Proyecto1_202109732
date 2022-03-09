package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.LibrosTable;
import org.ipc_p1.models.LibrosVirtualesTable;
import org.ipc_p1.sistema.Main;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class VentanaLibVirtualesController implements Initializable {
    private Main escenarioPrincipal;
    private static LibrosVirtualesTable libros[]=new LibrosVirtualesTable[100];
    @FXML private TableView<LibrosVirtualesTable> tblLibro=new TableView<>();
    @FXML private TableColumn<LibrosVirtualesTable, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesTable, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesTable, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesTable, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesTable, Integer>colTam=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesTable, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesTable, String>colTema=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesTable, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesTable, String>colCod=new TableColumn<>();
    @FXML private TextField txtAutor;
    @FXML private TextField txtAno;
    @FXML private TextField txtTitulo;
    @FXML private TextField txtDesc;
    @FXML private TextField txtPalabra;
    @FXML private TextField txtTam;
    @FXML private TextField txtEdicion;
    @FXML private TextField txtTema;
    @FXML private TextField txtBuscar;
    @FXML private Button btnModificar;
    @FXML private Button btnCancelarMod;
    String[] autor=new String[100];
    int[] ano=new int[100];
    String[] titulo=new String[100];
    int[] edicion=new int[100];
    int[] tam=new int[100];
    String[] palabras=new String[100];
    String[] desc=new String[100];
    String[] temas=new String[100];
    String[] cod=new String[100];

    private ObservableList<LibrosVirtualesTable> librosTable;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        txtAutor.setDisable(true);
        txtAno.setDisable(true);
        txtTitulo.setDisable(true);
        txtDesc.setDisable(true);
        txtPalabra.setDisable(true);
        txtTam.setDisable(true);
        txtEdicion.setDisable(true);
        txtTema.setDisable(true);
        btnModificar.setDisable(true);
        btnCancelarMod.setDisable(true);
        limite=FuncionesLibrosVirtuales.lim();
        if(limite>0){
            for (int i=0; i<limite; i++){
                autor[i]=FuncionesLibrosVirtuales.mostrarAutor(i);
                cod[i]=FuncionesLibrosVirtuales.codigo(i);
                ano[i]=FuncionesLibrosVirtuales.mostrarAno(i);
                titulo[i]=FuncionesLibrosVirtuales.mostrarTitulo(i);
                edicion[i]=FuncionesLibrosVirtuales.mostrarEdicion(i);
                tam[i]=FuncionesLibrosVirtuales.mostrarTam(i);
                palabras[i]=FuncionesLibrosVirtuales.mostrarPalabras(i);
                desc[i]=FuncionesLibrosVirtuales.mostrarDesc(i);
                temas[i]=FuncionesLibrosVirtuales.mostrarTemas(i);

                libros[i]=new LibrosVirtualesTable(cod[i],autor[i],ano[i],titulo[i],palabras[i],desc[i],temas[i],tam[i],edicion[i]);
                cont=cont+1;

            }
            if(cont==1){
                librosTable= FXCollections.observableArrayList(
                        libros[0]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);
            }
            if(cont==2){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);
            }
            if(cont==3){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);
            }
            if(cont==4){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==5){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==6){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==7){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==8){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==9){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==10){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==11){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==12){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==13){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==14){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==15){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==16){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==17){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==18){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==19){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17],libros[18]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            if(cont==20){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17],libros[18],libros[19]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesTable, String>("cod"));
                tblLibro.setItems(librosTable);

            }
            FilteredList<LibrosVirtualesTable> filtro= new FilteredList<>(librosTable, b -> true);

            txtBuscar.textProperty().addListener((observable, oldValue, newValue)->{
                filtro.setPredicate(librosTableSearch -> {
                    if(newValue.isEmpty() || newValue == null){
                        return true;
                    }

                    String ano =String.valueOf(librosTableSearch.getAño());
                    String edi =String.valueOf(librosTableSearch.getEdicion());
                    String tam =String.valueOf(librosTableSearch.getTam());
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
                    else if(librosTableSearch.getCod().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(tam.indexOf(buscarTxt)>-1){
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
            SortedList<LibrosVirtualesTable> busqueda = new SortedList<>(filtro);

            busqueda.comparatorProperty().bind(tblLibro.comparatorProperty());
            tblLibro.setItems(busqueda);

        }else{
            System.out.println("x");
        }
    }


    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
    }

    public void modificarUsuario(){
        String anoStr, ediStr, tamStr;
        if(this.tblLibro.getSelectionModel().getSelectedItem() == null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO SELECCIONADO");
            aviso.setContentText("Debe de seleccionar un registro.");
            aviso.show();
        }else{

            int ano=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAño();
            anoStr=String.valueOf(ano);
            int edicion=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getEdicion();
            ediStr=String.valueOf(edicion);
            int tam=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTam();
            tamStr=String.valueOf(tam);

            String cd=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();
            String autor=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAutor();
            String titulo=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTitulo();
            String palabras=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getPalabras();
            String desc=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getDesc();
            String temas=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTemas();
            System.out.println(cd);
            txtAutor.setText(autor);
            txtAutor.setDisable(false);

            txtAno.setDisable(false);
            txtAno.setText(anoStr);

            txtTitulo.setDisable(false);
            txtTitulo.setText(titulo);

            txtDesc.setDisable(false);
            txtDesc.setText(desc);

            txtPalabra.setDisable(false);
            txtPalabra.setText(palabras);

            txtTam.setDisable(false);
            txtTam.setText(tamStr);


            txtEdicion.setDisable(false);
            txtEdicion.setText(ediStr);

            txtTema.setDisable(false);
            txtTema.setText(temas);

            btnModificar.setDisable(false);
            btnCancelarMod.setDisable(false);

        }

    }
    public void btnModificar(){
        int ano,tam,edicion;
        String autor,titulo,desc,palabra,tema,cod;
        String array[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int a=1;

        for (int i = 0; i < array.length; i++) {
            if (txtAno.getText().contains(array[i]) || txtTam.getText().contains(array[i]) || txtEdicion.getText().contains(array[i])) {
                a=2;
            }
        }
        if(a==2){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("ERROR!");
            aviso.setContentText("Los campos de año, copias y edicion no pueden llevar letras.");
            aviso.show();
        }
        if (txtAutor.getText().isEmpty() ||txtAno.getText().isEmpty() || txtTitulo.getText().isEmpty() || txtDesc.getText().isEmpty() || txtPalabra.getText().isEmpty()|| txtTema.getText().isEmpty() || txtTam.getText().isEmpty()|| txtEdicion.getText().isEmpty()){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Registro no modificado!");
            aviso.setContentText("Revise si lleno corectamente los campos.");
            aviso.show();
            a=2;

        }else if(a!=2){
            autor=txtAutor.getText();
            cod=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();
            ano=Integer.parseInt(txtAno.getText());
            titulo=txtTitulo.getText();
            desc=txtDesc.getText();
            palabra=txtPalabra.getText();
            tam =Integer.parseInt(txtTam.getText());
            edicion=Integer.parseInt(txtEdicion.getText());
            tema=txtTema.getText();
            FuncionesLibrosVirtuales.modificarLibro(cod,autor,ano,titulo,palabra,desc,tema,tam,edicion);
            this.escenarioPrincipal.cambiarEscenaLibrosVirtuales();
        }

    }
    public void cancelarMod(){
        this.escenarioPrincipal.cambiarEscenaLibrosVirtuales();
    }
    public void btnEliminar(){
        if(this.tblLibro.getSelectionModel().getSelectedItem()== null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO SELECCIONADO");
            aviso.setContentText("Debe de seleccionar un registro.");
            aviso.show();
        }
        else{
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Eliminar Libro Virtual.");
            aviso.setContentText("Esta seguro de eliminar?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                String cod=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();

                FuncionesLibrosVirtuales.eliminarLibro(cod);
                this.escenarioPrincipal.cambiarEscenaLibrosVirtuales();
            }

        }
    }
}
