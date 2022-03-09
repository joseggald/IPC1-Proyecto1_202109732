package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.ipc_p1.models.RevistasBiblio;
import org.ipc_p1.models.RevistasBiblioDev;
import org.ipc_p1.sistema.Main;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class VentanaMisRevistasPrestamosController implements Initializable {
    private Main escenarioPrincipal;
    private static RevistasBiblioDev revista[]=new RevistasBiblioDev[100];
    @FXML private TableView<RevistasBiblioDev> tblLibro=new TableView<>();
    @FXML private TableColumn<RevistasBiblioDev, String> colAutor=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, Integer>colAno=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, String>colTitulo=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, String>colDesc=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, Integer>colCopias=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, Integer>colEjemplares=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, Integer>colEdicion=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, String>colTema=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, String>colPalabras=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, String>colCate=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, String>colCod=new TableColumn<>();
    @FXML private TableColumn<RevistasBiblioDev, String>colPrestar=new TableColumn<>();

    @FXML private TextField txtBuscar;
    String[] autor=new String[100];
    String[] cod=new String[100];
    int[] ano=new int[100];
    String[] titulo=new String[100];
    int[] edicion=new int[100];
    int[] ejemplares=new int[100];
    String[] palabras=new String[100];
    String[] desc=new String[100];
    String[] temas=new String[100];
    int[] copias=new int[100];
    int[] disp=new int[100];
    String[] cate=new String[100];
    Button[] btnPrestar=new Button[100];
    private ObservableList<RevistasBiblioDev> revistaTable;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int limite, cont=0;
        limite=FuncionesRevistas.limite(FuncionesUsuario.actual);
        if(limite>0){
            for (int i=0; i<limite; i++){
                cod[i]=FuncionesRevistas.codUser(FuncionesUsuario.actual,i);
                autor[i]=FuncionesRevistas.autorUser(FuncionesUsuario.actual,i);
                ano[i]=FuncionesRevistas.anoUser(FuncionesUsuario.actual,i);
                titulo[i]=FuncionesRevistas.tituloUser(FuncionesUsuario.actual,i);
                edicion[i]=FuncionesRevistas.edicionUser(FuncionesUsuario.actual,i);
                ejemplares[i]=FuncionesRevistas.ejemplarUser(FuncionesUsuario.actual,i);
                palabras[i]=FuncionesRevistas.palabrasUser(FuncionesUsuario.actual,i);
                cate[i]=FuncionesRevistas.cateUser(FuncionesUsuario.actual,i);
                desc[i]=FuncionesRevistas.descUser(FuncionesUsuario.actual,i);
                temas[i]=FuncionesRevistas.temasUser(FuncionesUsuario.actual,i);
                copias[i]=FuncionesRevistas.copiasUser(FuncionesUsuario.actual,i);
                disp[i]=FuncionesRevistas.dispUser(FuncionesUsuario.actual,i);
                btnPrestar[i]=new Button();
                btnPrestar[i].setOnAction(this::handleButtonAction);
                revista[i]=new RevistasBiblioDev(cod[i],autor[i], ano[i],titulo[i],edicion[i],desc[i],cate[i],temas[i],ejemplares[i],copias[i],disp[i],palabras[i],btnPrestar[i]);
                cont=cont+1;
            }
            if(cont==1){
                revistaTable= FXCollections.observableArrayList(
                        revista[0]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==2){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==3){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==4){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==5){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==8){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==9){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==10){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==11){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==12){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==13){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11],revista[12]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==14){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11],revista[12],revista[13]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==15){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11],revista[12],revista[13],revista[14]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==16){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11],revista[12],revista[13],revista[14],revista[15]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==17){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11],revista[12],revista[13],revista[14],revista[15],revista[16]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==18){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11],revista[12],revista[13],revista[14],revista[15],revista[16],revista[17]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==19){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11],revista[12],revista[13],revista[14],revista[15],revista[16],revista[17],revista[18]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            if(cont==20){
                revistaTable= FXCollections.observableArrayList(
                        revista[0],revista[1],revista[2],revista[3],revista[4],revista[5],revista[6],revista[7],revista[8],revista[9],
                        revista[10],revista[11],revista[12],revista[13],revista[14],revista[15],revista[16],revista[17],revista[18],revista[19]
                );
                colCod.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cod"));
                colAutor.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("autor"));
                colTitulo.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("titulo"));
                colPalabras.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("palabras"));
                colDesc.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("desc"));
                colTema.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("temas"));
                colCate.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("cate"));
                colAno.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("año"));
                colEdicion.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("edicion"));
                colCopias.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("copias"));
                colEjemplares.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, Integer>("ejemplares"));
                colPrestar.setCellValueFactory(new PropertyValueFactory<RevistasBiblioDev, String>("btnPrestar"));
                tblLibro.setItems(revistaTable);
            }
            FilteredList<RevistasBiblioDev> filtro= new FilteredList<>(revistaTable, b -> true);

            txtBuscar.textProperty().addListener((observable, oldValue, newValue)->{
                filtro.setPredicate(revistasTableSearch -> {
                    if(newValue.isEmpty() || newValue == null){
                        return true;
                    }
                    String cop =String.valueOf(revistasTableSearch.getCopias());
                    String ano =String.valueOf(revistasTableSearch.getAño());
                    String edi =String.valueOf(revistasTableSearch.getEdicion());
                    String ejem =String.valueOf(revistasTableSearch.getEjemplares());
                    String buscarTxt = newValue.toLowerCase();

                    if(revistasTableSearch.getAutor().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getDesc().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getCod().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getTitulo().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getTemas().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getPalabras().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(revistasTableSearch.getCate().toLowerCase().indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(cop.indexOf(buscarTxt)>-1){
                        return true;
                    }
                    else if(ejem.indexOf(buscarTxt)>-1){
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

            SortedList<RevistasBiblioDev> busqueda = new SortedList<>(filtro);
            busqueda.comparatorProperty().bind(tblLibro.comparatorProperty());
            tblLibro.setItems(busqueda);
        }
    }
    private void handleButtonAction(javafx.event.ActionEvent actionEvent) {
        int user =  FuncionesUsuario.actual;
        String codigo;
        if(actionEvent.getSource()==btnPrestar[0]){
            codigo=cod[0];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }

        }
        if(actionEvent.getSource()==btnPrestar[1]){
            codigo=cod[1];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[2]){
            codigo=cod[2];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[3]){
            codigo=cod[3];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[4]){
            codigo=cod[4];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[5]){
            codigo=cod[5];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[6]){
            codigo=cod[6];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[7]){
            codigo=cod[7];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[8]){
            codigo=cod[8];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[9]){
            codigo=cod[9];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[10]){
            codigo=cod[10];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[11]){
            codigo=cod[11];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[12]){
            codigo=cod[12];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[13]){
            codigo=cod[13];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[14]){
            codigo=cod[14];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[15]){
            codigo=cod[15];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[16]){
            codigo=cod[16];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[17]){
            codigo=cod[17];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[18]){
            codigo=cod[18];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[19]){
            codigo=cod[19];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
            }
        }
        if(actionEvent.getSource()==btnPrestar[20]){
            codigo=cod[20];
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Devolucion de Revista.");
            aviso.setContentText("Esta seguro de devolver?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                FuncionesRevistas.eliminarBiblio(codigo,user);
                this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
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
