package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.LibrosTable;
import org.ipc_p1.models.UsuarioTable;
import org.ipc_p1.sistema.Main;

import java.net.URL;
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
            ediStr=String.valueOf(ano);
            int isbn=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getIsbn();
            isbnStr=String.valueOf(ano);
            int copias=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCopias();
            copiasStr=String.valueOf(ano);
            int disp=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getDisp();
            dispStr=String.valueOf(ano);

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

            txtIsbn.setDisable(false);
            txtIsbn.setText(isbnStr);

            txtEdicion.setDisable(false);
            txtEdicion.setText(ediStr);

            txtTema.setDisable(false);
            txtTema.setText(temas);

            btnModificar.setDisable(false);
            btnCancelarMod.setDisable(false);


        }

    }
}
