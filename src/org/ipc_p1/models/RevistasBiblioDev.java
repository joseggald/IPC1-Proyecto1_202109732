package org.ipc_p1.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;

public class RevistasBiblioDev {
    private final StringProperty autor;
    private final StringProperty cod;
    private final IntegerProperty año;
    private final StringProperty titulo;
    private final IntegerProperty edicion;
    private final StringProperty desc;
    private final StringProperty cate;
    private final StringProperty temas;
    private final IntegerProperty ejemplares;
    private final IntegerProperty copias;
    private final IntegerProperty disp;
    private final StringProperty palabras;
    private Button btnPrestar;
    public RevistasBiblioDev(String cod, String autor, int año, String titulo, int edicion, String desc, String cate, String temas, int ejemplares, int copias, int disp, String palabras, Button btnPrestar) {
        this.autor = new SimpleStringProperty(autor);
        this.año = new SimpleIntegerProperty(año);
        this.titulo = new SimpleStringProperty(titulo);
        this.edicion =new SimpleIntegerProperty(edicion);
        this.desc = new SimpleStringProperty(desc);
        this.cate = new SimpleStringProperty(cate);
        this.temas = new SimpleStringProperty(temas);
        this.ejemplares = new SimpleIntegerProperty(ejemplares);
        this.copias = new SimpleIntegerProperty(copias);
        this.disp = new SimpleIntegerProperty(disp);
        this.palabras = new SimpleStringProperty(palabras);
        this.cod = new SimpleStringProperty(cod);
        this.btnPrestar=btnPrestar;
        this.btnPrestar.setText("Devolver");
    }

    public Button getBtnPrestar() {
        return btnPrestar;
    }

    public void setBtnPrestar(Button btnPrestar) {
        this.btnPrestar = btnPrestar;
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

    public int getEdicion() {
        return edicion.get();
    }

    public IntegerProperty edicionProperty() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion.set(edicion);
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

    public String getCate() {
        return cate.get();
    }

    public StringProperty cateProperty() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate.set(cate);
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

    public int getEjemplares() {
        return ejemplares.get();
    }

    public IntegerProperty ejemplaresProperty() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares.set(ejemplares);
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

    public String getPalabras() {
        return palabras.get();
    }

    public StringProperty palabrasProperty() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras.set(palabras);
    }
}
