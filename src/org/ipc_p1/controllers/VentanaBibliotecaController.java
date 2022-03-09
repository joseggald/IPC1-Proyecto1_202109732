package org.ipc_p1.controllers;

import javafx.fxml.Initializable;
import org.ipc_p1.models.Libros;
import org.ipc_p1.models.Usuario;
import org.ipc_p1.sistema.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class VentanaBibliotecaController implements Initializable {
    private Main escenarioPrincipal;

    public Libros libros[]=new Libros[100];
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaAdmin();
    }
    public void crearIndividual(){
        this.escenarioPrincipal.cambiarEscenaCrearIndiviBiblio();
    }
    public void ventanaLibros(){
        this.escenarioPrincipal.cambiarEscenaLibros();
    }
    public void ventanaLibrosVirtuales(){
        this.escenarioPrincipal.cambiarEscenaLibrosVirtuales();
    }
    public void ventanaRevista(){
        this.escenarioPrincipal.cambiarEscenaRevistas();
    }
    public void ventanaTesis(){
        this.escenarioPrincipal.cambiarEscenaTesis();
    }
    public void crearMasivo(){
        this.escenarioPrincipal.cambiarEscenaCrearMasivoBiblio();
    }
    public void reportes() {
        int a = 1, prestados;

        // para crear un archivo
        File archivo = new File("reportes\\biblioteca.html");
        // aperturar un archivo
        FileWriter escribir;
        // crear nuevas lineas dentro un archivo
        PrintWriter nuevaLinea;

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
                        "        <h1 style=\"text-align: center; font-size: 1.75rem;\"> Reporte de Prestamos de Libros 2022</h1>\n" +
                        "        <h3 style=\"text-align: center; font-size: 1.6rem;\"> LABORATORIO IPC1- PRIMER SEMESTRE 2022</h3>\n" +
                        "        <h3 style=\"text-align: center; font-size: 1.3rem;\"> Creado por José Galdámez/202109732</h3> \n" +
                        "\n");

                nuevaLinea.println("<Center>\n" +
                        "          <table style=\"padding-top: 1rem; width: 98%; border: 1px solid black; border-collapse: collapse;\">\n" +
                        "            <tr style=\"text-align: center; border: 1px solid black; border-collapse: collapse;\">\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown;\">Tipo</th>\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Titulo</th>\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Autor</th>\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Año de publicación</th>\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Descripción</th>\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Temas</th>\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Palabras</th>\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Copias</th>\n" +
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Prestamo acreaditado al Estudiante</th>\n" +
                        "            </tr>");
                for (int i = 1; i < FuncionesUsuario.lim(); i++) {
                    prestados = FuncionesRevistas.prestados[i] + FuncionesTesis.prestados[i] + FuncionesLibros.prestados[i];
                    if (prestados > 0) {
                        for (int k = 0; k < FuncionesLibros.prestados[i]; k++) {
                            nuevaLinea.println("<tr style=\"text-align: center;\">\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">Libro</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.tituloUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.autorUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.anoUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.descUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.temasUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.palabrasUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesLibros.copiasUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesUsuario.mostrarNom(i) + ""+FuncionesUsuario.mostrarApe(i) +"</td>\n" +
                                    "          \n" +
                                    "            </tr>");
                        }
                        for (int k = 0; k < FuncionesRevistas.prestados[i]; k++) {
                            nuevaLinea.println("<tr style=\"text-align: center;\">\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">Revistas</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.tituloUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.autorUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.anoUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.descUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.temasUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.palabrasUser(i, k) + "</td>\n" +
                                        "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesRevistas.copiasUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesUsuario.mostrarNom(i) + ""+FuncionesUsuario.mostrarApe(i) +"</td>\n" +
                                    "          \n" +
                                    "            </tr>");
                        }
                        for (int k = 0; k < FuncionesTesis.prestados[i]; k++) {
                            nuevaLinea.println("<tr style=\"text-align: center;\">\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">Tesis</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.tituloUser(i, k) + "</td>\n" +
                                        "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.autorUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.anoUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.descUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.temasUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.palabrasUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesTesis.copiasUser(i, k) + "</td>\n" +
                                    "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">" + FuncionesUsuario.mostrarNom(i) + ""+FuncionesUsuario.mostrarApe(i)+ "</td>\n" +
                                    "          \n" +
                                    "            </tr>");
                        }
                    }
                }
                escribir.close();


            } catch (Exception e) {

            }
        }
    }




}
