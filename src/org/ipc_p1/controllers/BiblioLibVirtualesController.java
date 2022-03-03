package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.LibrosVirtuales;
import org.ipc_p1.models.LibrosVirtualesBiblio;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class BiblioLibVirtualesController implements Initializable {

    private Main escenarioPrincipal;
    private static LibrosVirtuales libros[]=new LibrosVirtuales[100];
    @FXML private TableView<LibrosVirtuales> tblLibro=new TableView<>();
    @FXML private TableColumn<LibrosVirtuales, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtuales, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtuales, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtuales, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtuales, Integer>colTam=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtuales, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtuales, String>colTema=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtuales, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtuales, String>colCod=new TableColumn<>();
    @FXML private TextField txtBuscar;

    String[] autor=new String[100];
    int[] ano=new int[100];
    String[] titulo=new String[100];
    int[] edicion=new int[100];
    int[] tam=new int[100];
    String[] palabras=new String[100];
    String[] desc=new String[100];
    String[] temas=new String[100];
    String[] cod=new String[100];

    private ObservableList<LibrosVirtuales> librosTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        limite=FuncionesLibrosVirtuales.limite(FuncionesUsuario.actual);

        if(limite>0){
            for (int i=0; i<limite; i++){

                cod[i]=FuncionesLibrosVirtuales.codUser(FuncionesUsuario.actual,i);
                autor[i]=FuncionesLibrosVirtuales.autorUser(FuncionesUsuario.actual,i);
                ano[i]=FuncionesLibrosVirtuales.anoUser(FuncionesUsuario.actual,i);
                titulo[i]=FuncionesLibrosVirtuales.tituloUser(FuncionesUsuario.actual,i);
                palabras[i]=FuncionesLibrosVirtuales.palabrasUser(FuncionesUsuario.actual,i);
                desc[i]=FuncionesLibrosVirtuales.descUser(FuncionesUsuario.actual,i);
                temas[i]=FuncionesLibrosVirtuales.temasUser(FuncionesUsuario.actual,i);
                tam[i]=FuncionesLibrosVirtuales.tamUser(FuncionesUsuario.actual,i);
                edicion[i]=FuncionesLibrosVirtuales.edicionUser(FuncionesUsuario.actual,i);
                libros[i]=new LibrosVirtuales(cod[i],autor[i],ano[i],titulo[i],palabras[i],desc[i],temas[i],tam[i],edicion[i]);
                cont=cont+1;

            }
            if(cont==1){
                librosTable= FXCollections.observableArrayList(
                        libros[0]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));


                tblLibro.setItems(librosTable);
            }
            if(cont==2){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));


                tblLibro.setItems(librosTable);
            }
            if(cont==3){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));


                tblLibro.setItems(librosTable);
            }
            if(cont==4){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));

                tblLibro.setItems(librosTable);
            }
            if(cont==5){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));

                tblLibro.setItems(librosTable);
            }
            if(cont==6){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));

                tblLibro.setItems(librosTable);
            }
            if(cont==7){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));

                tblLibro.setItems(librosTable);
            }
            if(cont==8){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));

                tblLibro.setItems(librosTable);
            }
            if(cont==9){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));

                tblLibro.setItems(librosTable);
            }
            if(cont==10){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtuales, String>("cod"));

                tblLibro.setItems(librosTable);
            }
            FilteredList<LibrosVirtuales> filtro= new FilteredList<>(librosTable, b -> true);

            txtBuscar.textProperty().addListener((observable, oldValue, newValue)->{
                filtro.setPredicate(librosTableSearch -> {
                    if(newValue.isEmpty() || newValue == null){
                        return true;
                    }

                    String ano =String.valueOf(librosTableSearch.getAño());
                    String edi =String.valueOf(librosTableSearch.getEdicion());
                    String tam =String.valueOf(librosTableSearch.getTam());
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
                    else if(librosTableSearch.getCod().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(tam.indexOf(buscarTxt)>-1){
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
            SortedList<LibrosVirtuales> busqueda = new SortedList<>(filtro);

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
        this.escenarioPrincipal.cambiarEscenaBiblioVirt();
    }
    public void btnEliminar(){
        if(this.tblLibro.getSelectionModel().getSelectedItem()== null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO SELECCIONADO");
            aviso.setContentText("Debe de seleccionar un libro.");
            aviso.show();
        }
        else{
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Eliminar Libro Virtual.");
            aviso.setContentText("Esta seguro de eliminar?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                String cod=librosTable.get(tblLibro.getSelectionModel().getSelectedIndex()).getCod();
                FuncionesLibrosVirtuales.eliminarBiblio(cod, FuncionesUsuario.actual);
                this.escenarioPrincipal.cambiarEscenaVerMiBiblioVirt();
            }

        }

    }
}
