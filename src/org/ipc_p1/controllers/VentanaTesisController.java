package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.RevistasTable;
import org.ipc_p1.models.TesisTable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class VentanaTesisController implements Initializable {

    private Main escenarioPrincipal;
    private static TesisTable tesis[]=new TesisTable[100];
    @FXML
    private TableView<TesisTable> tblLibro=new TableView<>();
    @FXML private TableColumn<TesisTable, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<TesisTable, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<TesisTable, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<TesisTable, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<TesisTable, Integer>colCopias=new TableColumn<>();
    @FXML private TableColumn<TesisTable, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<TesisTable, String>colTema=new TableColumn<>();
    @FXML private TableColumn<TesisTable, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<TesisTable, String>colArea=new TableColumn<>();
    @FXML private TableColumn<TesisTable, String>colCod=new TableColumn<>();
    @FXML private TextField txtAutor;
    @FXML private TextField txtAno;
    @FXML private TextField txtTitulo;
    @FXML private TextField txtDesc;
    @FXML private TextField txtPalabra;
    @FXML private TextField txtCopias;
    @FXML private TextField txtArea;
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
    String[] palabras=new String[100];
    String[] desc=new String[100];
    String[] area=new String[100];
    String[] temas=new String[100];
    int[] copias=new int[100];
    int[] disp=new int[100];

    private ObservableList<TesisTable> tesisTable;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        txtAutor.setDisable(true);
        txtAno.setDisable(true);
        txtTitulo.setDisable(true);
        txtDesc.setDisable(true);
        txtPalabra.setDisable(true);
        txtCopias.setDisable(true);
        txtArea.setDisable(true);
        txtEdicion.setDisable(true);
        txtTema.setDisable(true);
        btnModificar.setDisable(true);
        btnCancelarMod.setDisable(true);
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
                tesis[i]=new TesisTable(cod[i],autor[i], ano[i],titulo[i],edicion[i],desc[i],temas[i],area[i],copias[i],disp[i],palabras[i]);
                cont=cont+1;
            }
                if(cont==1){
                    tesisTable= FXCollections.observableArrayList(
                            tesis[0]
                    );
                    colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                    colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                    colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                    colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                    colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                    colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                    colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                    colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                    colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                    colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                    tblLibro.setItems(tesisTable);
                }
                if(cont==2){
                    tesisTable= FXCollections.observableArrayList(
                            tesis[0],tesis[1]
                    );
                    colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                    colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                    colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                    colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                    colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                    colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                    colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                    colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                    colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                    colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                    tblLibro.setItems(tesisTable);
                }
                if(cont==3){
                    tesisTable= FXCollections.observableArrayList(
                            tesis[0],tesis[1],tesis[2]
                    );
                    colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                    colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                    colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                    colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                    colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                    colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                    colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                    colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                    colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                    colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                    tblLibro.setItems(tesisTable);
                }if(cont==4){
                    tesisTable= FXCollections.observableArrayList(
                            tesis[0],tesis[1],tesis[2],tesis[3]
                    );
                    colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                    colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                    colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                    colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                    colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                    colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                    colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                    colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                    colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                    colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                    tblLibro.setItems(tesisTable);
                }if(cont==5){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==6){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==7){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==9){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==10){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==11){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==12){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==13){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==14){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==15){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16],tesis[17],tesis[18]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==17){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==18){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16],tesis[17]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==19){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16],tesis[17],tesis[18]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==20){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4],tesis[5],tesis[6],tesis[7],tesis[8],tesis[9],
                        tesis[10],tesis[11],tesis[12],tesis[13],tesis[14],tesis[15],tesis[16],tesis[17],tesis[18],tesis[19]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisTable, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisTable, Integer>("copias"));
                tblLibro.setItems(tesisTable);
            }
            FilteredList<TesisTable> filtro= new FilteredList<>(tesisTable, b -> true);

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

            SortedList<TesisTable> busqueda = new SortedList<>(filtro);
            busqueda.comparatorProperty().bind(tblLibro.comparatorProperty());
            tblLibro.setItems(busqueda);
        }
        else{
            System.out.println("x");
        }
    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
    }
    public void modificarTesis(){
        String anoStr, ediStr, copiaStr;
        if(this.tblLibro.getSelectionModel().getSelectedItem() == null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO SELECCIONADO");
            aviso.setContentText("Debe de seleccionar un registro.");
            aviso.show();
        }else{

            int ano=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAño();
            anoStr=String.valueOf(ano);
            int edicion=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getEdicion();
            ediStr=String.valueOf(edicion);
            int copia=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCopias();
            copiaStr=String.valueOf(copia);

            String cd=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();
            String autor=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAutor();
            String titulo=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTitulo();
            String area=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAreas();
            String palabras=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getPalabras();
            String desc=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getDesc();
            String temas=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTemas();
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

            txtArea.setDisable(false);
            txtArea.setText(area);

            btnModificar.setDisable(false);
            btnCancelarMod.setDisable(false);

        }

    }
    public void btnModificar(){
        int ano,copias,edicion;
        String autor,titulo,desc,palabra,tema,cod,area;

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
        if (txtAutor.getText().isEmpty() ||txtAno.getText().isEmpty() || txtTitulo.getText().isEmpty() || txtDesc.getText().isEmpty() || txtPalabra.getText().isEmpty()|| txtTema.getText().isEmpty() || txtCopias.getText().isEmpty() || txtArea.getText().isEmpty()){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Registro no guardado!");
            aviso.setContentText("Revise si lleno corectamente los campos.");
            aviso.show();
            a=2;

        }else if(a!=2){
            autor=txtAutor.getText();
            cod=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();
            ano=Integer.parseInt(txtAno.getText());
            titulo=txtTitulo.getText();
            desc=txtDesc.getText();
            area=txtArea.getText();
            palabra=txtPalabra.getText();
            copias =Integer.parseInt(txtCopias.getText());
            edicion=Integer.parseInt(txtEdicion.getText());
            tema=txtTema.getText();
            FuncionesTesis.modificarTesis(cod,autor,ano,titulo,edicion,desc,tema,area,copias,copias,palabra);
            this.escenarioPrincipal.cambiarEscenaTesis();
        }

    }
    public void cancelarMod(){
        this.escenarioPrincipal.cambiarEscenaTesis();
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
            aviso.setHeaderText("Eliminar Tesis.");
            aviso.setContentText("Esta seguro de eliminar?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                String cod=tesisTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();
                FuncionesTesis.eliminarTesis(cod);
                this.escenarioPrincipal.cambiarEscenaTesis();
            }

        }
    }
}
