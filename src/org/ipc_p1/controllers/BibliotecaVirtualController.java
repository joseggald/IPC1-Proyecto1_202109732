package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.LibrosVirtualesBiblio;
import org.ipc_p1.models.LibrosVirtualesTable;
import org.ipc_p1.sistema.Main;

import javax.naming.spi.InitialContextFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class BibliotecaVirtualController implements Initializable {

    private Main escenarioPrincipal;
    private static LibrosVirtualesBiblio libros[]=new LibrosVirtualesBiblio[100];
    @FXML private TableView<LibrosVirtualesBiblio> tblLibro=new TableView<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, Integer>colTam=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, String>colTema=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, String>colCod=new TableColumn<>();
    @FXML private TableColumn<LibrosVirtualesBiblio, String>colAgregar=new TableColumn<>();

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
    Button[] btnAgregar=new Button[100];
    private ObservableList<LibrosVirtualesBiblio> librosTable;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;

        limite=FuncionesLibrosVirtuales.lim();
        if(limite>0){
            for (int i=0; i<limite; i++){
                autor[i]=FuncionesLibrosVirtuales.mostrarAutor(i);
                cod[i]=FuncionesLibrosVirtuales.codigo(i);
                ano[i]=FuncionesLibrosVirtuales.mostrarAno(i);
                titulo[i]=FuncionesLibrosVirtuales.mostrarTitulo(i);
                edicion[i]=FuncionesLibrosVirtuales.mostrarEdicion(i);
                tam[i]=FuncionesLibrosVirtuales.mostrarTam(i);
                palabras[i]=FuncionesLibrosVirtuales.mostrarPalabras(i);
                desc[i]=FuncionesLibrosVirtuales.mostrarDesc(i);
                temas[i]=FuncionesLibrosVirtuales.mostrarTemas(i);
                btnAgregar[i]=new Button();
                btnAgregar[i].setOnAction(this::handleButtonAction);
                libros[i]=new LibrosVirtualesBiblio(cod[i],autor[i],ano[i],titulo[i],palabras[i],desc[i],temas[i],tam[i],edicion[i],btnAgregar[i]);
                cont=cont+1;

            }
            if(cont==1){
                librosTable= FXCollections.observableArrayList(
                        libros[0]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==2){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==3){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==4){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==5){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==6){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==7){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==8){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==9){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }
            if(cont==10){
                librosTable= FXCollections.observableArrayList(
                        libros[0],libros[1],libros[2],libros[3],libros[4],libros[5],libros[6],libros[7],libros[8],libros[9]
                );
                colAutor.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("temas"));
                colAno.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("año"));
                colTam.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("tam"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, Integer>("edicion"));
                colCod.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("cod"));
                colAgregar.setCellValueFactory(new PropertyValueFactory<LibrosVirtualesBiblio, String>("btnAgregar"));

                tblLibro.setItems(librosTable);
            }

            FilteredList<LibrosVirtualesBiblio> filtro= new FilteredList<>(librosTable, b -> true);

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

            SortedList<LibrosVirtualesBiblio> busqueda = new SortedList<>(filtro);

            busqueda.comparatorProperty().bind(tblLibro.comparatorProperty());
            tblLibro.setItems(busqueda);

        }else{
            System.out.println("x");
        }
    }

    private void handleButtonAction(javafx.event.ActionEvent actionEvent) {
        int user =  FuncionesUsuario.actual;
        String codigo;
        if(actionEvent.getSource()==btnAgregar[0]){
            codigo=cod[0];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[1]){
            codigo=cod[1];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[2]){
            codigo=cod[2];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[3]){
            codigo=cod[3];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[4]){
            codigo=cod[4];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[5]){
            codigo=cod[5];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[6]){
            codigo=cod[6];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[7]){
            codigo=cod[7];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[8]){
            codigo=cod[8];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        else if(actionEvent.getSource()==btnAgregar[9]){
            codigo=cod[9];
            FuncionesLibrosVirtuales.agregar(codigo, user);

        }
        if(FuncionesLibrosVirtuales.res==2){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Este ya fue agregado!");
            aviso.setContentText("Elija otro!");
            aviso.show();
        }
    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {

        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaEstu();
    }
    public void ventanaVerMiBiblio(){
        this.escenarioPrincipal.cambiarEscenaVerMiBiblioVirt();
    }

}
