package org.ipc_p1.controllers;

import javafx.fxml.Initializable;
import org.ipc_p1.sistema.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class PrestamosMainController implements Initializable {
    private Main escenarioPrincipal;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {

        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMain(){
        this.escenarioPrincipal.cambiarEscenaEstu();
    }
    public void ventanaLibrosPrestamos(){
        this.escenarioPrincipal.cambiarEscenaPrestamosLibros();
    }
    public void ventanaMisLibrosPrestamos(){
        this.escenarioPrincipal.cambiarEscenaMisPrestamosLibros();
    }
    public void ventanaMisRevistas(){
        this.escenarioPrincipal.cambiarEscenaMisPrestamosRevistas();
    }
    public void ventanaRevistas(){
        this.escenarioPrincipal.cambiarEscenaPrestamosRevistas();
    }
    public void ventanaTesis(){
        this.escenarioPrincipal.cambiarEscenaPrestamosTesis();
    }
    public void ventanaMisTesis(){
        this.escenarioPrincipal.cambiarEscenaMisPrestamosTesis();
    }
    public void reportes(){
        int limiteLibros,limiteTesis,limiteRevistas;
        limiteLibros=FuncionesLibros.lim();
        limiteRevistas=FuncionesRevistas.lim();
        limiteTesis=FuncionesTesis.lim();
        // para crear un archivo
        File archivo = new File("reportes\\librosPrestamos.html");
        // aperturar un archivo
        FileWriter escribir;
        // crear nuevas lineas dentro un archivo
        PrintWriter nuevaLinea;

        if(!archivo.exists()) {
            try {
                //crear mi archivo
                archivo.createNewFile();
                // le pasao el archivo donde quiero escribir, true
                escribir = new FileWriter(archivo, true);
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
                        "        <h1 style=\"text-align: center; font-size: 1.75rem;\"> Reporte de de Documentos en Prestamos 2022</h1>\n" +
                        "        <h3 style=\"text-align: center; font-size: 1.6rem;\"> LABORATORIO IPC1- PRIMER SEMESTRE 2022</h3>\n" +
                        "        <h3 style=\"text-align: center; font-size: 1.3rem;\"> Creado por José Galdámez/202109732</h3> \n" +
                        "\n" +
                        "      <Center>\n" +
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
                        "              <th style=\"border: 1px solid black; border-collapse: collapse; background-color: sandybrown; padding: 20px;\">Disponibilidad</th>\n" +
                        "              \n" +
                        "            </tr>");

                    for (int i = 0; i < limiteLibros; i++) {
                        nuevaLinea.println(" <tr style=\"text-align: center;\">\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">Libros</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesLibros.mostrarTitulo(i)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesLibros.mostrarAutor(i)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesLibros.mostrarAno(i)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesLibros.mostrarDesc(i)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesLibros.mostrarTemas(i)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesLibros.mostrarPalabras(i)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesLibros.mostrarCopias(i)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesLibros.mostrarDisp(i)+"</td>\n" +
                                "            </tr>");
                    }

                    for (int c = 0; c < limiteRevistas; c++) {
                        nuevaLinea.println(" <tr style=\"text-align: center;\">\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">Revistas</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesRevistas.mostrarTitulo(c)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesRevistas.mostrarAutor(c)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesRevistas.mostrarAno(c)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesRevistas.mostrarDesc(c)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesRevistas.mostrarTemas(c)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesRevistas.mostrarPalabras(c)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesRevistas.mostrarCopias(c)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesRevistas.mostrarDisp(c)+"</td>\n" +
                                "            </tr>");
                    }

                    for (int a = 0; a < limiteTesis; a++) {
                        String titu = FuncionesTesis.mostrarTitulo(a);
                        nuevaLinea.println(" <tr style=\"text-align: center;\">\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">Tesis</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+titu+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesTesis.mostrarAutor(a)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesTesis.mostrarAno(a)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesTesis.mostrarDesc(a)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesTesis.mostrarTemas(a)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesTesis.mostrarPalabras(a)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesTesis.mostrarCopias(a)+"</td>\n" +
                                "              <td style=\"border: 1px solid black; border-collapse: collapse; padding: 10px;\">"+FuncionesTesis.mostrarDisp(a)+"</td>\n" +
                                "            </tr>");

                    }

                    nuevaLinea.println(" </table>\n" +
                            "      </Center>\n" +
                            "</section>\n" +
                            "        \n" +
                            "</div>    \n" +
                            "</body>\n" +
                            "</html>");

                escribir.close();
            }catch(Exception e){

            }
        }




    }
}
