package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import org.ipc_p1.models.UsuarioTable;
import org.ipc_p1.sistema.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class VentanaUsuarioController implements Initializable {
    private Main escenarioPrincipal;
    private static UsuarioTable users[]=new UsuarioTable[100];

    @FXML private TableView<UsuarioTable> tblUsuario=new TableView<>();
    @FXML private TableColumn<UsuarioTable, Integer>colDpi=new TableColumn<>();
    @FXML private TableColumn<UsuarioTable, String>colNom=new TableColumn<>();
    @FXML private TableColumn<UsuarioTable, String>colApe=new TableColumn<>();
    @FXML private TableColumn<UsuarioTable, String>colUser=new TableColumn<>();
    @FXML private TableColumn<UsuarioTable, String>colPass=new TableColumn<>();
    @FXML private TableColumn<UsuarioTable, String>colRol=new TableColumn<>();
    @FXML private TextField txtUsuario;
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private ComboBox<String> cmbRol;
    @FXML private TextField txtPassword;
    @FXML private TextField txtPassRevisar;
    @FXML private TextField txtDpi;
    @FXML private TextField txtBuscar;
    @FXML private Button btnModificar;
    @FXML private Button btnCancelarMod;
    @FXML private Button btnBuscar;
    int [] dpi=new int[100];
    String [] nom=new String[100];
    String [] ape=new String[100];
    String [] user=new String[100];
    String [] pass=new String[100];
    String [] rol=new String[100];
    String rl;
    private ObservableList<UsuarioTable> usuarios;
    FuncionesUsuario funcionesUsuario =new FuncionesUsuario();
    int cont=0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtDpi.setDisable(true);
        txtApellido.setDisable(true);
        txtUsuario.setDisable(true);
        txtNombre.setDisable(true);
        txtPassword.setDisable(true);
        txtPassRevisar.setDisable(true);
        cmbRol.setDisable(true);
        btnModificar.setDisable(true);
        btnCancelarMod.setDisable(true);
        int tam;
        tam= funcionesUsuario.lim();
        System.out.println(tam);

        for (int i=0; i<tam; i++){

            dpi[i]= funcionesUsuario.mostrarDPI(i);
            nom[i]= funcionesUsuario.mostrarNom(i);
            ape[i]= funcionesUsuario.mostrarApe(i);
            user[i]= funcionesUsuario.mostrarUser(i);
            pass[i]= funcionesUsuario.mostrarPass(i);
            rol[i]= funcionesUsuario.mostrarRol(i);

            users[i] = new UsuarioTable(user[i],pass[i],nom[i],ape[i],rol[i], dpi[i]);

            cont=cont+1;
        }
        if(cont==1){
            usuarios= FXCollections.observableArrayList(
                    users[0]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==2){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==3){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==4){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==5){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==6){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==7){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==8){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==9){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==10){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==11){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==12){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==13){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==14){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12],users[13]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==15){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12],users[13], users[14]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==16){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12],users[13], users[14], users[15]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==17){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12],users[13], users[14], users[15],users[16]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==18){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12],users[13], users[14], users[15],users[16],users[17]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==19){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12],users[13], users[14], users[15],users[16],users[17],users[18]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==20){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12],users[13], users[14], users[15],users[16],users[17],users[18],users[19]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }
        if(tam==21){
            usuarios= FXCollections.observableArrayList(
                    users[0], users[1],users[2], users[3], users[4],users[5],users[6],users[7],users[8],users[9],users[10]
                    ,users[11], users[12],users[13], users[14], users[15],users[16],users[17],users[18],users[19],users[20]
            );
            colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
            colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
            colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
            colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
            colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
            colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
            tblUsuario.setItems(usuarios);
        }


    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaAdmin();
    }

    public void ventanaUsuario(){
        this.escenarioPrincipal.cambiarEscenaCrearUsuario();
    }

    public void modificarUsuario(){
        String a;
        if(this.tblUsuario.getSelectionModel().getSelectedItem() == null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO SELECCIONADO");
            aviso.setContentText("Debe de seleccionar un registro.");
            aviso.show();
        }else{
            int dpi=usuarios.get(tblUsuario.getSelectionModel().getSelectedIndex()).getCui();
            a=String.valueOf(dpi);
            String nom=usuarios.get(tblUsuario.getSelectionModel().getSelectedIndex()).getNom();
            String ape=usuarios.get(tblUsuario.getSelectionModel().getSelectedIndex()).getApe();
            String us=usuarios.get(tblUsuario.getSelectionModel().getSelectedIndex()).getUs();
            String ps=usuarios.get(tblUsuario.getSelectionModel().getSelectedIndex()).getPass();
            String ps2=usuarios.get(tblUsuario.getSelectionModel().getSelectedIndex()).getPass();
            String rol=usuarios.get(tblUsuario.getSelectionModel().getSelectedIndex()).getRl();
            rl=rol;
            txtDpi.setText(a);
            txtNombre.setText(nom);
            txtNombre.setDisable(false);
            txtApellido.setText(ape);
            txtApellido.setDisable(false);
            txtPassword.setText(ps);
            txtPassword.setDisable(false);
            txtPassRevisar.setText(ps2);
            txtPassRevisar.setDisable(false);
            txtUsuario.setText(us);
            txtUsuario.setDisable(false);
            cmbRol.setPromptText(rol);
            cmbRol.setDisable(false);
            cmbRol.getItems().add("Usuario");
            cmbRol.getItems().add("Administrador");
            btnModificar.setDisable(false);
            btnCancelarMod.setDisable(false);
        }

    }

    public void btnModificar(){
        int a = 1;
        String array[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < array.length; i++) {
            if (txtDpi.getText().contains(array[i])) {
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("ERROR!");
                aviso.setContentText("El DPI no puede llevar letras.");
                aviso.show();
                a=2;
            }

        }
        if(txtUsuario.getText().isEmpty() || txtApellido.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPassword.getText().isEmpty() || txtPassRevisar.getText().isEmpty()||txtDpi.getText().trim().isEmpty()){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("ERROR!");
            aviso.setContentText("No deje campos vacios.");
            aviso.show();

        }else if(a!=2){
            if(txtPassword.getText().equals(txtPassRevisar.getText())){
                int dp;
                String nom,ape,pass,user,rol;
                dp=Integer.parseInt(txtDpi.getText());
                nom=txtNombre.getText();
                ape=txtApellido.getText();
                pass=txtPassword.getText();
                user=txtUsuario.getText();
                rol=cmbRol.getSelectionModel().getSelectedItem();
                if(rol==null){
                    rol=rl;
                }
                funcionesUsuario.modificarUsuario(dp,nom,ape,user,pass,rol);
                this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
            }else {
                Alert aviso = new Alert(Alert.AlertType.ERROR);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("NO MODIFICADO");
                aviso.setContentText("Debe de coincidir la nueva contraseña.");
                aviso.show();
            }
        }


    }

    public void btnEliminar(){
        if(this.tblUsuario.getSelectionModel().getSelectedItem()== null){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO SELECCIONADO");
            aviso.setContentText("Debe de seleccionar un registro.");
            aviso.show();
        }
        else{
            Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Eliminar Usuario.");
            aviso.setContentText("Esta seguro de eliminar?");
            Optional<ButtonType> result = aviso.showAndWait();
            if(result.get() == ButtonType.OK){
                int dpi=usuarios.get(tblUsuario.getSelectionModel().getSelectedIndex()).getCui();
                funcionesUsuario.eliminarUsuario(dpi);
                this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
            }

        }
    }

    public void cancelarMod(){
        this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
    }

    public void buscar(){
        if(txtBuscar.getText().equals("")){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO HAY BUSQUEDAS");
            aviso.setContentText("Debe de llenar el campo para la busqueda.");
            aviso.show();
        }

        int tam, a, r=0;
        tam= funcionesUsuario.lim();
        a=Integer.parseInt(txtBuscar.getText());
        for (int i=0; i<tam;i++){
            if(a==funcionesUsuario.mostrarDPI(i)){
                usuarios= FXCollections.observableArrayList(
                        users[i]
                );
                colDpi.setCellValueFactory(new PropertyValueFactory<UsuarioTable, Integer>("cui"));
                colNom.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("nom"));
                colApe.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("ape"));
                colUser.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("us"));
                colPass.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("pass"));
                colRol.setCellValueFactory(new PropertyValueFactory<UsuarioTable, String>("rl"));
                tblUsuario.setItems(usuarios);
                r=0;
                i=tam;
                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("BUSQUEDA ENCONTRADO");
                aviso.setContentText("Busqueda exitosa!");
                aviso.show();
            }
            else{
                r=1;
            }
        }
        if(r==1){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO HAY BUSQUEDAS");
            aviso.setContentText("No se encontraron resultados.");
            aviso.show();
        }

    }
    public void reporte(){
        // para crear un archivo
        File archivo = new File("reportes\\usuarios.html");
        // aperturar un archivo
        FileWriter escribir;
        // crear nuevas lineas dentro un archivo
        PrintWriter nuevaLinea;
        int prestados;
        if(!archivo.exists()){
            try {
                //crear mi archivo
                archivo.createNewFile();
                // le pasao el archivo donde quiero escribir, true
                escribir = new FileWriter(archivo,true);
                // escribiendo dentro de mi archivo
                nuevaLinea = new PrintWriter(escribir);
                nuevaLinea.println("<!DOCTYPE html>\n" +
                                "<html style=\"font-size: 16px; font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\">\n" +
                                "  <head>\n" +
                                "    <meta charset=\"UTF-8\">\n" +
                                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                                "    <title>Proyecto 1 - 202109732 - José Galdámez</title>\n" +
                                "    <link rel=\"stylesheet\" href=\"CSS/style.css\">\n" +
                                "  </head>\n" +
                                "  <body ><header ><div></div></header> \n" +
                                "    <section>\n" +
                                "      <div>\n" +
                                "        <h1 style=\"text-align: center; font-size: 1.75rem;\"> Reporte de Usuarios 2022</h1>\n" +
                                "        <h3 style=\"text-align: center; font-size: 1.6rem;\"> LABORATORIO IPC1- PRIMER SEMESTRE 2022</h3>\n" +
                                "        <h3 style=\"text-align: center; font-size: 1.3rem;\"> Creado por José Galdámez/202109732</h3> "
                               );

                for (int i=1; i<FuncionesUsuario.lim(); i++){

                    prestados=FuncionesRevistas.prestados[i]+FuncionesTesis.prestados[i]+FuncionesLibros.prestados[i];
                    nuevaLinea.println( "<p style=\"padding-top: 5rem;\">\n" +
                            "          <span style=\"font-size: 1.1rem; padding-left: 3rem;\">DPI: "+  FuncionesUsuario.mostrarDPI(i) +"</span>\n" +
                            "          <br>\n" +
                            "        </p>\n" +
                            "        <p>\n" +
                            "          <span style=\"font-size: 1.1rem; padding-left: 3rem;\">Nombre Completo: "+ FuncionesUsuario.mostrarNom(i)+" "+ FuncionesUsuario.mostrarApe(i)+"</span>\n" +
                            "          <br>\n" +
                            "        </p>\n" +
                            "        <p>\n" +
                            "          <span style=\"font-size: 1.1rem; padding-left: 3rem;\"> No. de libros prestados: "+prestados+"</span>\n" +
                            "          <br>\n" +
                            "        </p>"

                    );
                    if(prestados>0) {
                        nuevaLinea.println("<Center>\n" +
                                "          <span style=\"font-size: 1.5rem; font-weight: bold; padding: 2rem;\">Libros prestados del Usuario: </span>\n" +
                                "          <br>\n" +
                                "          <table style=\"padding-top: 1rem; width: 90%; border: 1px solid black; border-collapse: collapse;\">\n" +
                                "            <tr style=\"text-align: center; border: 1px solid black; border-collapse: collapse;\">\n" +
                                "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown;\">Tipo</th>\n" +
                                "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown;\">Titulo</th>\n" +
                                "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown;\">Autor</th>\n" +
                                "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown;\">Año de publicación</th>\n" +
                                "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown;\">Descripción</th>\n" +
                                "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown;\">Temas</th>\n" +
                                "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown;\">Palabras</th>\n" +
                                "            </tr>");
                        for (int j = 0; j < FuncionesLibros.prestados[i]; j++) {
                            nuevaLinea.println("<tr style=\"text-align: center;\">\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse;\">Libro</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.tituloUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.autorUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.anoUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.descUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.temasUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.palabrasUser(i, j) + "</td>\n" +
                                    "          \n" +
                                    "            </tr>");
                        }
                        for (int j = 0; j < FuncionesRevistas.prestados[i]; j++) {
                            nuevaLinea.println("<tr style=\"text-align: center;\">\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">Revistas</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.tituloUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.autorUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.anoUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.descUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.temasUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.palabrasUser(i, j) + "</td>\n" +
                                    "          \n" +
                                    "            </tr>");
                        }
                        for (int j = 0; j < FuncionesTesis.prestados[i]; j++) {
                            nuevaLinea.println("<tr style=\"text-align: center;\">\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">Tesis</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.tituloUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.autorUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.anoUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.descUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.temasUser(i, j) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.palabrasUser(i, j) + "</td>\n" +
                                    "          \n" +
                                    "            </tr>");
                        }
                        nuevaLinea.println("</table>\n" +
                                "        </Center>");
                    }
                }
                nuevaLinea.println("</section>\n" +
                        "        \n" +
                        "</div>    \n" +
                        "</body>\n" +
                        "</html>");

                escribir.close();


            } catch (Exception e) {

            }
        }
    }

}
