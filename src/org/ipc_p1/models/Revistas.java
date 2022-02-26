package org.ipc_p1.models;

public class Revistas {
    private String autor;
    private int año;
    private String titulo;
    private int edicion;
    private String desc;
    private String cate;
    private String temas;
    private String ejemplares;
    private int copias;
    private int disp;
    private String palabras;

    public Revistas(String autor, int año, String titulo, int edicion, String desc, String cate, String temas, String ejemplares, int copias, int disp, String palabras) {
        this.autor = autor;
        this.año = año;
        this.titulo = titulo;
        this.edicion = edicion;
        this.desc = desc;
        this.cate = cate;
        this.temas = temas;
        this.ejemplares = ejemplares;
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

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public String getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(String ejemplares) {
        this.ejemplares = ejemplares;
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
