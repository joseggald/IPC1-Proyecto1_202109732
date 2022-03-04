package org.ipc_p1.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;

public class LibrosBiblioDev {
    private final StringProperty autor;
    private final IntegerProperty año;
    private final StringProperty titulo;
    private final IntegerProperty edicion;
    private final IntegerProperty isbn;
    private final StringProperty palabras;
    private final StringProperty desc;
    private final StringProperty temas;
    private final IntegerProperty copias;
    private final IntegerProperty disp;
    private Button btnPrestar;

    public LibrosBiblioDev(String aut, int año, String titulo, int edicion, int isbn, String palabras, String desc, String temas, int copias, int disp, Button btnPrestar) {
        this.autor = new SimpleStringProperty(aut);
        this.año = new SimpleIntegerProperty(año);
        this.titulo = new SimpleStringProperty(titulo);
        this.edicion = new SimpleIntegerProperty(edicion);
        this.isbn = new SimpleIntegerProperty(isbn);
        this.palabras = new SimpleStringProperty(palabras);
        this.desc = new SimpleStringProperty(desc);
        this.temas = new SimpleStringProperty(temas);
        this.copias = new SimpleIntegerProperty(copias);
        this.disp = new SimpleIntegerProperty(disp);
        this.btnPrestar=btnPrestar;
        this.btnPrestar.setText("Devolver");
    }

    public Button getBtnPrestar() {
        return btnPrestar;
    }

    public void setBtnPrestar(Button btnPrestar) {
        this.btnPrestar = btnPrestar;
    }

    public String getAutor() {
        return autor.get();
    }

    public StringProperty autorProperty() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor.set(autor);
    }

    public int getAño() {
        return año.get();
    }

    public IntegerProperty añoProperty() {
        return año;
    }

    public void setAño(int año) {
        this.año.set(año);
    }

    public String getTitulo() {
        return titulo.get();
    }

    public StringProperty tituloProperty() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo.set(titulo);
    }

    public int getEdicion() {
        return edicion.get();
    }

    public IntegerProperty edicionProperty() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion.set(edicion);
    }

    public int getIsbn() {
        return isbn.get();
    }

    public IntegerProperty isbnProperty() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn.set(isbn);
    }

    public String getPalabras() {
        return palabras.get();
    }

    public StringProperty palabrasProperty() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras.set(palabras);
    }

    public String getDesc() {
        return desc.get();
    }

    public StringProperty descProperty() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc.set(desc);
    }

    public String getTemas() {
        return temas.get();
    }

    public StringProperty temasProperty() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas.set(temas);
    }

    public int getCopias() {
        return copias.get();
    }

    public IntegerProperty copiasProperty() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias.set(copias);
    }

    public int getDisp() {
        return disp.get();
    }

    public IntegerProperty dispProperty() {
        return disp;
    }

    public void setDisp(int disp) {
        this.disp.set(disp);
    }
}
