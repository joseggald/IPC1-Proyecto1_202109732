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
import org.ipc_p1.models.UsuarioTable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

public class VentanaLibrosController implements Initializable {
    private Main escenarioPrincipal;
    private static LibrosTable libros[]=new LibrosTable[100];
    @FXML private TableView<LibrosTable> tblLibro=new TableView<>();
    @FXML private TableColumn<LibrosTable, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<LibrosTable, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<LibrosTable, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<LibrosTable, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<LibrosTable, Integer>colCopias=new TableColumn<>();
    @FXML private TableColumn<LibrosTable, Integer>colIsbn=new TableColumn<>();
    @FXML private TableColumn<LibrosTable, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<LibrosTable, String>colTema=new TableColumn<>();
    @FXML private TableColumn<LibrosTable, String>colPalabras=new TableColumn<>();
    @FXML private TextField txtAutor;
    @FXML private TextField txtAno;
    @FXML private TextField txtTitulo;
    @FXML private TextField txtDesc;
    @FXML private TextField txtPalabra;
    @FXML private TextField txtCopias;
    @FXML private TextField txtIsbn;
    @FXML private TextField txtEdicion;
    @FXML private TextField txtTema;
    @FXML private TextField txtBuscar;
    @FXML private Button btnModificar;
    @FXML private Button btnCancelarMod;
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
    private ObservableList<LibrosTable> librosTable;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        txtAutor.setDisable(true);
        txtAno.setDisable(true);
        txtTitulo.setDisable(true);
        txtDesc.setDisable(true);
        txtPalabra.setDisable(true);
        txtCopias.setDisable(true);
        txtIsbn.setDisable(true);
        txtEdicion.setDisable(true);
        txtTema.setDisable(true);
        btnModificar.setDisable(true);
        btnCancelarMod.setDisable(true);
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
                libros[i]=new LibrosTable(autor[i],ano[i],titulo[i],edicion[i], isbn[i],palabras[i],desc[i],temas[i],copias[i],disp[i]);
                cont=cont+1;
            }
            if(cont==1){
                librosTable= FXCollections.observableArrayList(
                        libros[0]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==2){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==3){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==4){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==5){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==6){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==7){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==8){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==9){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==10){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==11){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==12){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==13){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==14){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==15){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==16){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==17){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==18){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==19){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17],libros[18]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            if(cont==20){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9],
                        libros[10],libros[11],libros[12],libros[13],libros[14],libros[15],libros[16],libros[17],libros[18],libros[19]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosTable, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("copias"));
                colIsbn.setCellValueFactory(new PropertyValueFactory<LibrosTable, Integer>("isbn"));
                tblLibro.setItems(librosTable);
            }
            FilteredList<LibrosTable> filtro= new FilteredList<>(librosTable, b -> true);

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
            SortedList<LibrosTable> busqueda = new SortedList<>(filtro);

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
        String anoStr, ediStr, isbnStr, copiasStr, dispStr;
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
            int isbn=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getIsbn();
            isbnStr=String.valueOf(isbn);
            int copias=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCopias();
            copiasStr=String.valueOf(copias);
            int disp=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getDisp();
            dispStr=String.valueOf(disp);

            String autor=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAutor();
            String titulo=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTitulo();
            String palabras=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getPalabras();
            String desc=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getDesc();
            String temas=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTemas();

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
            txtCopias.setText(copiasStr);

            txtIsbn.setDisable(true);
            txtIsbn.setText(isbnStr);

            txtEdicion.setDisable(false);
            txtEdicion.setText(ediStr);

            txtTema.setDisable(false);
            txtTema.setText(temas);

            btnModificar.setDisable(false);
            btnCancelarMod.setDisable(false);

        }

    }
    public void btnModificar(){
        int ano,copias,isbn,edicion;
        String autor,titulo,desc,palabra,tema;
        String array[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int a=1;
        for (int i = 0; i < array.length; i++) {
            if (txtAno.getText().contains(array[i]) || txtIsbn.getText().contains(array[i]) || txtCopias.getText().contains(array[i]) || txtEdicion.getText().contains(array[i])) {
                a=2;
            }
        }
        if(a==2){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("ERROR!");
            aviso.setContentText("Los campos de año, isbn, copias y edicion no pueden llevar letras.");
            aviso.show();
        }
        if (txtAutor.getText().isEmpty()  || txtAno.getText().isEmpty() || txtTitulo.getText().isEmpty() || txtDesc.getText().isEmpty() || txtPalabra.getText().isEmpty() || txtCopias.getText().isEmpty() || txtIsbn.getText().isEmpty() || txtEdicion.getText().isEmpty() || txtTema.getText().isEmpty()){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Registro no Modificado!");
            aviso.setContentText("Revise si lleno corectamente los campos.");
            aviso.show();
            a=2;
        }else if(a!=2){
            autor=txtAutor.getText();
            ano=Integer.parseInt(txtAno.getText());
            titulo=txtTitulo.getText();
            desc=txtDesc.getText();
            palabra=txtPalabra.getText();
            copias =Integer.parseInt(txtCopias.getText());
            isbn=Integer.parseInt(txtIsbn.getText());
            edicion=Integer.parseInt(txtEdicion.getText());
            tema=txtTema.getText();
            FuncionesLibros.modificarLibro(autor,ano,titulo,edicion,isbn,palabra,desc,tema,copias,copias);
            this.escenarioPrincipal.cambiarEscenaLibros();
        }

    }
    public void cancelarMod(){
        this.escenarioPrincipal.cambiarEscenaLibros();
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
            aviso.setHeaderText("Eliminar Libro.");
            aviso.setContentText("Esta seguro de eliminar?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                int isbn=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getIsbn();
                String autor=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getAutor();
                String titulo=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getTitulo();
                FuncionesLibros.eliminarLibro(isbn,autor,titulo);
                this.escenarioPrincipal.cambiarEscenaLibros();
            }

        }
    }
}
