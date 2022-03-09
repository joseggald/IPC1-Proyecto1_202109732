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
import org.ipc_p1.models.RevistasTable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class VentanaRevistasController implements Initializable {
    private Main escenarioPrincipal;
    private static RevistasTable revista[]=new RevistasTable[100];
    @FXML private TableView<RevistasTable> tblLibro=new TableView<>();
    @FXML private TableColumn<RevistasTable, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, Integer>colCopias=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, Integer>colEjemplares=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, String>colTema=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, String>colCate=new TableColumn<>();
    @FXML private TableColumn<RevistasTable, String>colCod=new TableColumn<>();
    @FXML private TextField txtAutor;
    @FXML private TextField txtAno;
    @FXML private TextField txtTitulo;
    @FXML private TextField txtDesc;
    @FXML private TextField txtPalabra;
    @FXML private TextField txtCopias;
    @FXML private TextField txtCate;
    @FXML private TextField txtEjemplar;
    @FXML private TextField txtEdicion;
    @FXML private TextField txtTema;
    @FXML private TextField txtBuscar;
    @FXML private Button btnModificar;
    @FXML private Button btnCancelarMod;
    String[] autor=new String[100];
    String[] cod=new String[100];
    int[] ano=new int[100];
    String[] titulo=new String[100];
    int[] edicion=new int[100];
    int[] ejemplares=new int[100];
    String[] palabras=new String[100];
    String[] desc=new String[100];
    String[] temas=new String[100];
    int[] copias=new int[100];
    int[] disp=new int[100];
    String[] cate=new String[100];
    private ObservableList<RevistasTable> revistaTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        txtAutor.setDisable(true);
        txtAno.setDisable(true);
        txtTitulo.setDisable(true);
        txtDesc.setDisable(true);
        txtPalabra.setDisable(true);
        txtCopias.setDisable(true);
        txtCate.setDisable(true);
        txtEjemplar.setDisable(true);
        txtEdicion.setDisable(true);
        txtTema.setDisable(true);
        btnModificar.setDisable(true);
        btnCancelarMod.setDisable(true);
        limite=FuncionesRevistas.lim();
        if(limite>0){
            for (int i=0; i<limite; i++){
                cod[i]=FuncionesRevistas.codigo(i);
                autor[i]=FuncionesRevistas.mostrarAutor(i);
                ano[i]=FuncionesRevistas.mostrarAno(i);
                titulo[i]=FuncionesRevistas.mostrarTitulo(i);
                edicion[i]=FuncionesRevistas.mostrarEdicion(i);
                ejemplares[i]=FuncionesRevistas.mostrarEjemplares(i);
                palabras[i]=FuncionesRevistas.mostrarPalabras(i);
                cate[i]=FuncionesRevistas.mostrarCate(i);
                desc[i]=FuncionesRevistas.mostrarDesc(i);
                temas[i]=FuncionesRevistas.mostrarTemas(i);
                copias[i]=FuncionesRevistas.mostrarCopias(i);
                disp[i]=FuncionesRevistas.mostrarDisp(i);
                revista[i]=new RevistasTable(cod[i],autor[i], ano[i],titulo[i],edicion[i],desc[i],cate[i],temas[i],ejemplares[i],copias[i],disp[i],palabras[i]);
                cont=cont+1;
            }
            if(cont==1){
                revistaTable= FXCollections.observableArrayList(
                        revista[0]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==2){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==3){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==4){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==5){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==6){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==7){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==8){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==9){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==10){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==11){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==12){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==13){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11], revista[12]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==14){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11], revista[12], revista[13]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==15){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11], revista[12], revista[13], revista[14]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==16){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11], revista[12], revista[13], revista[14], revista[15]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==17){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11], revista[12], revista[13], revista[14], revista[15], revista[16]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==18){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11], revista[12], revista[13], revista[14], revista[15], revista[16], revista[17]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==19){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11], revista[12], revista[13], revista[14], revista[15], revista[16], revista[17], revista[18]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==20){
                revistaTable= FXCollections.observableArrayList(
                        revista[0], revista[1], revista[2], revista[3], revista[4], revista[5], revista[6], revista[7], revista[8], revista[9],
                        revista[10], revista[11], revista[12], revista[13], revista[14], revista[15], revista[16], revista[17], revista[18], revista[19]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasTable, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasTable, Integer>("ejemplares"));
                tblLibro.setItems(revistaTable);
            }
            else{
                System.out.println("x");
            }

            FilteredList<RevistasTable> filtro= new FilteredList<>(revistaTable, b -> true);

            txtBuscar.textProperty().addListener((observable, oldValue, newValue)->{
                filtro.setPredicate(revistasTableSearch -> {
                    if(newValue.isEmpty() || newValue == null){
                        return true;
                    }
                    String cop =String.valueOf(revistasTableSearch.getCopias());
                    String ano =String.valueOf(revistasTableSearch.getAño());
                    String edi =String.valueOf(revistasTableSearch.getEdicion());
                    String ejem =String.valueOf(revistasTableSearch.getEjemplares());
                    String buscarTxt = newValue.toLowerCase();

                    if(revistasTableSearch.getAutor().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getDesc().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getCod().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getTitulo().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getTemas().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getPalabras().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getCate().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(cop.indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(ejem.indexOf(buscarTxt)>-1){
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

            SortedList<RevistasTable> busqueda = new SortedList<>(filtro);
            busqueda.comparatorProperty().bind(tblLibro.comparatorProperty());
            tblLibro.setItems(busqueda);
        }
        }

    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
    }
        public void modificarRevista(){
        String anoStr, ediStr, copiaStr,ejeStr;
        if(this.tblLibro.getSelectionModel().getSelectedItem() == null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO SELECCIONADO");
            aviso.setContentText("Debe de seleccionar un registro.");
            aviso.show();
        }else{

            int ano=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAño();
            anoStr=String.valueOf(ano);
            int edicion=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getEdicion();
            ediStr=String.valueOf(edicion);
            int copia=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCopias();
            copiaStr=String.valueOf(copia);
            int ejempar=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getEjemplares();
            ejeStr=String.valueOf(ejempar);

            String cd=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();
            String autor=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAutor();
            String titulo=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTitulo();
            String cate=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCate();
            String palabras=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getPalabras();
            String desc=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getDesc();
            String temas=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTemas();
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

            txtCopias.setDisable(false);
            txtCopias.setText(copiaStr);


            txtEdicion.setDisable(false);
            txtEdicion.setText(ediStr);

            txtTema.setDisable(false);
            txtTema.setText(temas);

            txtCate.setDisable(false);
            txtCate.setText(cate);

            txtEjemplar.setDisable(false);
            txtEjemplar.setText(ejeStr);


            btnModificar.setDisable(false);
            btnCancelarMod.setDisable(false);

        }

    }
    public void btnModificar(){
        int ano,copias,edicion, ejemplar;
        String autor,titulo,desc,palabra,tema,cod,cate;

        String array[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int a=1;

        for (int i = 0; i < array.length; i++) {
            if (txtAno.getText().contains(array[i]) || txtCopias.getText().contains(array[i]) || txtEdicion.getText().contains(array[i])) {
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
        if (txtAutor.getText().isEmpty() ||txtAno.getText().isEmpty() || txtTitulo.getText().isEmpty() || txtCate.getText().isEmpty() || txtDesc.getText().isEmpty() || txtPalabra.getText().isEmpty()|| txtTema.getText().isEmpty() || txtCopias.getText().isEmpty() || txtEjemplar.getText().isEmpty()){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Registro no guardado!");
            aviso.setContentText("Revise si lleno corectamente los campos.");
            aviso.show();
            a=2;

        }else if(a!=2){
            autor=txtAutor.getText();
            cod=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();
            ano=Integer.parseInt(txtAno.getText());
            titulo=txtTitulo.getText();
            desc=txtDesc.getText();
            cate=txtCate.getText();
            palabra=txtPalabra.getText();
            copias =Integer.parseInt(txtCopias.getText());
            ejemplar=Integer.parseInt(txtEjemplar.getText());
            edicion=Integer.parseInt(txtEdicion.getText());
            tema=txtTema.getText();
            FuncionesRevistas.modificarRevista(cod,autor,ano,titulo,edicion,desc,cate,tema,ejemplar,copias,copias,palabra);
            this.escenarioPrincipal.cambiarEscenaRevistas();
        }

    }
    public void cancelarMod(){
        this.escenarioPrincipal.cambiarEscenaRevistas();
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
            aviso.setHeaderText("Eliminar Revista.");
            aviso.setContentText("Esta seguro de eliminar?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                String cod=revistaTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();

                FuncionesRevistas.eliminarRevista(cod);
                this.escenarioPrincipal.cambiarEscenaLibrosVirtuales();
            }

        }
    }
}
