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
