package org.ipc_p1.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import org.ipc_p1.models.Usuario;
import org.ipc_p1.models.UsuarioTable;
import org.ipc_p1.sistema.Main;
import sun.security.krb5.internal.tools.Ktab;

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
    @FXML private Button btnModificar;
    @FXML private Button btnCancelarMod;
    @FXML private AnchorPane ventana;
    int [] dpi=new int[100];
    String [] nom=new String[100];
    String [] ape=new String[100];
    String [] user=new String[100];
    String [] pass=new String[100];
    String [] rol=new String[100];
    private ObservableList<UsuarioTable> usuarios;
    Funciones funciones=new Funciones();
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
        tam=funciones.lim();
        System.out.println(tam);
        for (int i=0; i<tam; i++){

            dpi[i]=funciones.mostrarDPI(i);
            nom[i]=funciones.mostrarNom(i);
            ape[i]=funciones.mostrarApe(i);
            user[i]=funciones.mostrarUser(i);
            pass[i]=funciones.mostrarPass(i);
            rol[i]=funciones.mostrarRol(i);

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

        if(txtPassword.getText().equals(txtPassRevisar.getText())){
            int dp;
            String nom,ape,pass,user,rol;
            dp=Integer.parseInt(txtDpi.getText());
            nom=txtNombre.getText();
            ape=txtApellido.getText();
            pass=txtPassword.getText();
            user=txtUsuario.getText();
            rol=cmbRol.getSelectionModel().getSelectedItem();

            funciones.modificarUsuario(dp,nom,ape,user,pass,rol);
            this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
        }else {
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("NO MODIFICADO");
            aviso.setContentText("Debe de coincidir la nueva contraseña.");
            aviso.show();
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
                funciones.eliminarUsuario(dpi);
                this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
            }

        }
    }
    public void cancelarMod(){
        this.escenarioPrincipal.cambiarEscenaVentanaUsuarios();
    }


}
