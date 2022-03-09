package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.RevistasBiblioDev;
import org.ipc_p1.models.TesisBiblio;
import org.ipc_p1.models.TesisTable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class VentanaTesisPrestamosController implements Initializable {
    private Main escenarioPrincipal;
    private static TesisBiblio tesis[]=new TesisBiblio[100];
    @FXML private TableView<TesisBiblio> tblLibro=new TableView<>();
    @FXML private TableColumn<TesisBiblio, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, Integer>colCopias=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, String>colTema=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, String>colArea=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, String>colCod=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, String>colPrestar=new TableColumn<>();
    @FXML private TableColumn<TesisBiblio, Integer>colDisp=new TableColumn<>();
    @FXML private TextField txtBuscar;
    String[] autor=new String[100];
    String[] cod=new String[100];
    int[] ano=new int[100];
    String[] titulo=new String[100];
    int[] edicion=new int[100];
    String[] palabras=new String[100];
    String[] desc=new String[100];
    String[] area=new String[100];
    String[] temas=new String[100];
    int[] copias=new int[100];
    int[] disp=new int[100];
    Button[] btnPrestar=new Button[100];
    private ObservableList<TesisBiblio> tesisTable;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        limite=FuncionesTesis.lim();
        if(limite>0){
            for (int i=0; i<limite; i++){
                cod[i]=FuncionesTesis.codigo(i);
                autor[i]=FuncionesTesis.mostrarAutor(i);
                ano[i]=FuncionesTesis.mostrarAno(i);
                titulo[i]=FuncionesTesis.mostrarTitulo(i);
                edicion[i]=FuncionesTesis.mostrarEdicion(i);
                area[i]=FuncionesTesis.mostrarArea(i);
                palabras[i]=FuncionesTesis.mostrarPalabras(i);
                desc[i]=FuncionesTesis.mostrarDesc(i);
                temas[i]=FuncionesTesis.mostrarTemas(i);
                copias[i]=FuncionesTesis.mostrarCopias(i);
                disp[i]=FuncionesTesis.mostrarDisp(i);
                btnPrestar[i]=new Button();
                btnPrestar[i].setOnAction(this::handleButtonAction);
                tesis[i]=new TesisBiblio(cod[i],autor[i], ano[i],titulo[i],edicion[i],desc[i],temas[i],area[i],copias[i],disp[i],palabras[i],btnPrestar[i]);
                cont=cont+1;
            }
            if(cont==1){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==2){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==3){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==4){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==5){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==6){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==7){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==8){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==9){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==10){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==11){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==12){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==13){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==14){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==15){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==16){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==17){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==18){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16],tesis[17]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==19){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16],tesis[17],tesis[18]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==20){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16],tesis[17],tesis[18],tesis[19]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("copias"));
                colDisp.setCellValueFactory(new PropertyValueFactory<TesisBiblio, Integer>("disp"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblio, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }

            FilteredList<TesisBiblio> filtro= new FilteredList<>(tesisTable, b -> true);

            txtBuscar.textProperty().addListener((observable, oldValue, newValue)->{
                filtro.setPredicate(tesisTableSearch -> {
                    if(newValue.isEmpty() || newValue == null){
                        return true;
                    }
                    String cop =String.valueOf(tesisTableSearch.getCopias());
                    String ano =String.valueOf(tesisTableSearch.getAño());
                    String edi =String.valueOf(tesisTableSearch.getEdicion());

                    String buscarTxt = newValue.toLowerCase();

                    if(tesisTableSearch.getAutor().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(tesisTableSearch.getDesc().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(tesisTableSearch.getCod().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(tesisTableSearch.getTitulo().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(tesisTableSearch.getTemas().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(tesisTableSearch.getPalabras().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(tesisTableSearch.getCod().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(cop.indexOf(buscarTxt)>-1){
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

            SortedList<TesisBiblio> busqueda = new SortedList<>(filtro);
            busqueda.comparatorProperty().bind(tblLibro.comparatorProperty());
            tblLibro.setItems(busqueda);
        }
    }
    private void handleButtonAction(javafx.event.ActionEvent actionEvent) {
        int user =  FuncionesUsuario.actual;
        String codigo;
        if(actionEvent.getSource()==btnPrestar[0]){
            codigo=cod[0];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[1]){
            codigo=cod[1];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[2]){
            codigo=cod[2];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[3]){
            codigo=cod[3];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[4]){
            codigo=cod[4];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[5]){
            codigo=cod[5];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[6]){
            codigo=cod[6];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[7]){
            codigo=cod[7];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[8]){
            codigo=cod[8];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[9]){
            codigo=cod[9];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[10]){
            codigo=cod[10];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[11]){
            codigo=cod[11];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[12]){
            codigo=cod[12];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[13]){
            codigo=cod[13];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[14]){
            codigo=cod[14];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[15]){
            codigo=cod[15];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[16]){
            codigo=cod[16];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[17]){
            codigo=cod[17];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[18]){
            codigo=cod[18];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[19]){
            codigo=cod[19];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(actionEvent.getSource()==btnPrestar[20]){
            codigo=cod[20];
            System.out.println(codigo);
            FuncionesTesis.agregar(codigo,user);
            this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
        }
        if(FuncionesRevistas.res==2){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Ya tiene la la tesis en prestamo!");
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
