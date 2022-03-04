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
