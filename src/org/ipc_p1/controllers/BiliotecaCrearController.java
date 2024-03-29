package org.ipc_p1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class BiliotecaCrearController implements Initializable {

    private Main escenarioPrincipal;
    @FXML private TextField txtAutor;
    @FXML private TextField txtAno;
    @FXML private TextField txtTitulo;
    @FXML private TextField txtDesc;
    @FXML private TextField txtPalabra;
    @FXML private TextField txtCopias;
    @FXML private TextField txtArea;
    @FXML private TextField txtIsbn;
    @FXML private TextField txtTam;
    @FXML private TextField txtEdicion;
    @FXML private TextField txtTema;
    @FXML private TextField txtEjemplar;
    @FXML private TextField txtCate;
    @FXML private ComboBox<String> cmbTipo;
    @FXML private Button btnCrear;
    @FXML private Button cancelar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cmbTipo.getItems().add("Libro");
        cmbTipo.getItems().add("Revista");
        cmbTipo.getItems().add("Tesis");
        cmbTipo.getItems().add("Libro Virtual");
        txtAutor.setDisable(true);
        txtArea.setDisable(true);
        txtAno.setDisable(true);
        txtTitulo.setDisable(true);
        txtDesc.setDisable(true);
        txtPalabra.setDisable(true);
        txtCopias.setDisable(true);
        txtIsbn.setDisable(true);
        txtTam.setDisable(true);
        txtEdicion.setDisable(true);
        btnCrear.setDisable(true);
        txtTema.setDisable(true);
        txtEjemplar.setDisable(true);
        txtCate.setDisable(true);
    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
    }

    public void seleccionar(){
        String tipo;
        tipo=cmbTipo.getSelectionModel().getSelectedItem();
        if(tipo==null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("ERROR!");
            aviso.setContentText("Seleccione un tipo.");
            aviso.show();
        }
        if(tipo.equals("Libro")){
            txtAutor.setDisable(false);
            txtAno.setDisable(false);
            txtTitulo.setDisable(false);
            txtArea.setDisable(true);
            txtDesc.setDisable(false);
            txtPalabra.setDisable(false);
            txtCopias.setDisable(false);
            txtIsbn.setDisable(false);
            txtTam.setDisable(true);
            btnCrear.setDisable(false);
            txtEdicion.setDisable(false);
            txtTema.setDisable(false);
            txtEjemplar.setDisable(true);
            txtCate.setDisable(true);
        }
        if(tipo.equals("Revista")){
            txtAutor.setDisable(false);
            txtAno.setDisable(false);
            txtTitulo.setDisable(false);
            txtCate.setDisable(false);
            txtArea.setDisable(true);
            txtDesc.setDisable(false);
            txtPalabra.setDisable(false);
            txtCopias.setDisable(false);
            txtIsbn.setDisable(true);
            txtTam.setDisable(true);
            btnCrear.setDisable(false);
            txtEdicion.setDisable(false);
            txtTema.setDisable(false);
            txtEjemplar.setDisable(false);
        }
        if(tipo.equals("Tesis")){
            txtAutor.setDisable(false);
            txtAno.setDisable(false);
            txtTitulo.setDisable(false);
            txtCate.setDisable(true);
            txtArea.setDisable(false);
            txtDesc.setDisable(false);
            txtPalabra.setDisable(false);
            txtCopias.setDisable(false);
            txtIsbn.setDisable(true);
            txtTam.setDisable(true);
            btnCrear.setDisable(false);
            txtEdicion.setDisable(false);
            txtTema.setDisable(false);
            txtEjemplar.setDisable(true);
        }
        if(tipo.equals("Libro Virtual")){
            txtAutor.setDisable(false);
            txtAno.setDisable(false);
            txtTitulo.setDisable(false);
            txtArea.setDisable(true);
            txtDesc.setDisable(false);
            txtPalabra.setDisable(false);
            txtCopias.setDisable(true);
            txtIsbn.setDisable(true);
            txtTam.setDisable(false);
            btnCrear.setDisable(false);
            txtEdicion.setDisable(false);
            txtTema.setDisable(false);
            txtEjemplar.setDisable(true);
        }

    }

    public void guardar(){
        String tipo;
        tipo=cmbTipo.getSelectionModel().getSelectedItem();
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
        if(tipo==null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("ERROR!");
            aviso.setContentText("Seleccione un tipo.");
            aviso.show();
        }
        if(tipo.equals("Libro")){

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
                aviso.setHeaderText("Registro no guardado!");
                aviso.setContentText("Revise si lleno corectamente los campos.");
                aviso.show();
                a=2;
            }else if(a!=2){
                autor = txtAutor.getText();
                ano = Integer.valueOf(txtAno.getText());
                titulo = txtTitulo.getText();
                desc = txtDesc.getText();
                palabras = txtPalabra.getText();
                copias = Integer.valueOf(txtCopias.getText());
                isbn = Integer.valueOf(txtIsbn.getText());
                edicion = Integer.valueOf(txtEdicion.getText());
                temas = txtTema.getText();
                dispo=copias;
                FuncionesLibros.crearLibro(autor,ano,titulo,edicion,isbn,palabras,desc,temas,copias,dispo);
                this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
            }

        }
        if(tipo.equals("Revista")){
            for (int i = 0; i < array.length; i++) {
                if (txtAno.getText().contains(array[i]) || txtEjemplar.getText().contains(array[i]) || txtCopias.getText().contains(array[i]) || txtEdicion.getText().contains(array[i])) {
                    a=2;
                }
            }
            if(a==2){
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("ERROR!");
                aviso.setContentText("Los campos de año, ejemplares, copias y edicion no pueden llevar letras.");
                aviso.show();
            }

            if (txtAutor.getText().isEmpty() || txtCate.getText().isEmpty()  || txtAno.getText().isEmpty() || txtTitulo.getText().isEmpty() || txtDesc.getText().isEmpty() || txtPalabra.getText().isEmpty() || txtCopias.getText().isEmpty() || txtEjemplar.getText().isEmpty() || txtEdicion.getText().isEmpty() ||txtTema.getText().isEmpty()){
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro no guardado!");
                aviso.setContentText("Revise si lleno corectamente los campos.");
                aviso.show();
                a=2;

            }else if(a!=2){
                autor=txtAutor.getText();
                ano=Integer.valueOf(txtAno.getText());
                titulo=txtTitulo.getText();
                cate=txtCate.getText();
                desc=txtDesc.getText();
                palabras=txtPalabra.getText();
                copias = Integer.valueOf(txtCopias.getText());
                edicion = Integer.valueOf(txtEdicion.getText());
                temas = txtTema.getText();
                ejemplares=Integer.valueOf(txtEjemplar.getText());
                FuncionesRevistas.crearRevistas(autor,ano,titulo,edicion,desc,cate,temas,ejemplares,copias,copias,palabras);
                this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
            }
        }
        if(tipo.equals("Tesis")){
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

            if (txtArea.getText().isEmpty() || txtAutor.getText().isEmpty()  || txtAno.getText().isEmpty() || txtTitulo.getText().isEmpty() || txtDesc.getText().isEmpty() || txtPalabra.getText().isEmpty() || txtCopias.getText().isEmpty() || txtEdicion.getText().isEmpty() ||txtTema.getText().isEmpty()){
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro no guardado!");
                aviso.setContentText("Revise si lleno corectamente los campos.");
                aviso.show();
                a=2;

            }else if(a!=2){
                autor=txtAutor.getText();
                ano=Integer.valueOf(txtAno.getText());
                titulo=txtTitulo.getText();
                edicion = Integer.valueOf(txtEdicion.getText());
                desc=txtDesc.getText();
                temas=txtTema.getText();
                areas=txtArea.getText();
                copias = Integer.valueOf(txtCopias.getText());
                palabras=txtPalabra.getText();
                FuncionesTesis.crearTesis(autor,ano,titulo,edicion,desc,temas,areas,copias,copias,palabras);
                this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
            }
        }
        if(tipo.equals("Libro Virtual")){
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
            if (txtAutor.getText().isEmpty() ||txtAno.getText().isEmpty() || txtTitulo.getText().isEmpty() || txtDesc.getText().isEmpty() || txtPalabra.getText().isEmpty()|| txtTema.getText().isEmpty() || txtTam.getText().isEmpty()){
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Registro no guardado!");
                aviso.setContentText("Revise si lleno corectamente los campos.");
                aviso.show();
                a=2;

            }else if(a!=2){
                autor = txtAutor.getText();
                ano = Integer.valueOf(txtAno.getText());
                titulo = txtTitulo.getText();
                desc = txtDesc.getText();
                palabras = txtPalabra.getText();
                temas = txtTema.getText();
                tam = Integer.valueOf(txtTam.getText());
                edicion = Integer.valueOf(txtEdicion.getText());
                FuncionesLibrosVirtuales.crearLbVirtuales(autor,ano,titulo,palabras,desc,temas,tam,edicion);
                this.escenarioPrincipal.cambiarEscenaVentanaBiblio();
            }
        }
    }


}
