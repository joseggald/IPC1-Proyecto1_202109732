package org.ipc_p1.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;

public class LibrosVirtualesBiblio {
    private final StringProperty autor;
    private final StringProperty cod;
    private final IntegerProperty año;
    private final StringProperty  titulo;
    private final StringProperty  palabras;
    private final StringProperty  desc;
    private final StringProperty temas;
    private final IntegerProperty tam;
    private final IntegerProperty edicion;
    private Button btnAgregar;
    public LibrosVirtualesBiblio(String cod,String autor, int año, String titulo, String palabras, String desc, String temas, int tam, int edicion, Button btnAgregar) {
        this.autor = new SimpleStringProperty(autor);
        this.cod = new SimpleStringProperty(cod);
        this.año = new SimpleIntegerProperty(año);
        this.titulo = new SimpleStringProperty(titulo);
        this.palabras = new SimpleStringProperty(palabras);
        this.desc = new SimpleStringProperty(desc);
        this.temas = new SimpleStringProperty(temas);
        this.tam = new SimpleIntegerProperty(tam);
        this.edicion = new SimpleIntegerProperty(edicion);
        this.btnAgregar=btnAgregar;
        this.btnAgregar.setText("Agregar");
    }

    public Button getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(Button btnAgregar) {
        this.btnAgregar = btnAgregar;
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

    public String getCod() {
        return cod.get();
    }

    public StringProperty codProperty() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod.set(cod);
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

    public int getTam() {
        return tam.get();
    }

    public IntegerProperty tamProperty() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam.set(tam);
    }
}
