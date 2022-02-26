package org.ipc_p1.models;

public class Tesis {
    private String autor;
    private int año;
    private String titulo;
    private int edicion;
    private String desc;
    private String temas;
    private String areas;
    private int copias;
    private int disp;
    private String palabras;

    public Tesis(String autor, int año, String titulo, int edicion, String desc, String temas, String areas, int copias, int disp, String palabras) {
        this.autor = autor;
        this.año = año;
        this.titulo = titulo;
        this.edicion = edicion;
        this.desc = desc;
        this.temas = temas;
        this.areas = areas;
        this.copias = copias;
        this.disp = disp;
        this.palabras = palabras;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getDisp() {
        return disp;
    }

    public void setDisp(int disp) {
        this.disp = disp;
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }
}
