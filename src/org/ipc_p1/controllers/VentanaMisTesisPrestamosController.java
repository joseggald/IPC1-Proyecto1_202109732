package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.*;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class VentanaMisTesisPrestamosController implements Initializable {
    private Main escenarioPrincipal;
    private static TesisBiblioDev tesis[]=new TesisBiblioDev[100];
    @FXML private TableView<TesisBiblioDev> tblLibro=new TableView<>();
    @FXML private TableColumn<TesisBiblioDev, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, Integer>colCopias=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, String>colTema=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, String>colArea=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, String>colCod=new TableColumn<>();
    @FXML private TableColumn<TesisBiblioDev, String>colPrestar=new TableColumn<>();
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
    private ObservableList<TesisBiblioDev> tesisTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        limite=FuncionesTesis.limite(FuncionesUsuario.actual);
        if(limite>0) {
            for (int i = 0; i < limite; i++) {
                cod[i] = FuncionesTesis.codUser(FuncionesUsuario.actual,i);
                autor[i] = FuncionesTesis.autorUser(FuncionesUsuario.actual,i);;
                ano[i] = FuncionesTesis.anoUser(FuncionesUsuario.actual,i);
                titulo[i] = FuncionesTesis.tituloUser(FuncionesUsuario.actual,i);
                edicion[i] = FuncionesTesis.edicionUser(FuncionesUsuario.actual,i);
                area[i] = FuncionesTesis.areaUser(FuncionesUsuario.actual,i);
                palabras[i] = FuncionesTesis.palabrasUser(FuncionesUsuario.actual,i);
                desc[i] = FuncionesTesis.descUser(FuncionesUsuario.actual,i);
                temas[i] = FuncionesTesis.temasUser(FuncionesUsuario.actual,i);
                copias[i] = FuncionesTesis.copiasUser(FuncionesUsuario.actual,i);
                disp[i] = FuncionesTesis.dispUser(FuncionesUsuario.actual,i);
                btnPrestar[i] = new Button();
                btnPrestar[i].setOnAction(this::handleButtonAction);
                tesis[i] = new TesisBiblioDev(cod[i], autor[i], ano[i], titulo[i], edicion[i], desc[i], temas[i], area[i], copias[i], disp[i], palabras[i], btnPrestar[i]);
                cont = cont + 1;
            }
            if(cont==1){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("copias"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==2){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("copias"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==3){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("copias"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==4){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("copias"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            if(cont==5){
                tesisTable= FXCollections.observableArrayList(
                        tesis[0],tesis[1],tesis[2],tesis[3],tesis[4]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("temas"));
                colArea.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("areas"));
                colAno.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, Integer>("copias"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<TesisBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(tesisTable);
            }
            FilteredList<TesisBiblioDev> filtro= new FilteredList<>(tesisTable, b -> true);

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

            SortedList<TesisBiblioDev> busqueda = new SortedList<>(filtro);
            busqueda.comparatorProperty().bind(tblLibro.comparatorProperty());
            tblLibro.setItems(busqueda);
        }
    }
    private void handleButtonAction(javafx.event.ActionEvent actionEvent) {
        int user = FuncionesUsuario.actual;
        String codigo;
        if (actionEvent.getSource() == btnPrestar[0]) {
            codigo = cod[0];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesTesis.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosTesis();
            }
        }
        if (actionEvent.getSource() == btnPrestar[1]) {
            codigo = cod[1];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesTesis.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosTesis();
            }
        }
        if (actionEvent.getSource() == btnPrestar[2]) {
            codigo = cod[2];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesTesis.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosTesis();
            }
        }
        if (actionEvent.getSource() == btnPrestar[3]) {
            codigo = cod[3];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesTesis.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosTesis();
            }
        }
        if (actionEvent.getSource() == btnPrestar[4]) {
            codigo = cod[4];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesTesis.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosTesis();
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
