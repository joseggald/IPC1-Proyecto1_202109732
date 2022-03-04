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

    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {

        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaPrestamosMain();
    }

}
