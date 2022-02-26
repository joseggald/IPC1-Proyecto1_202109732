package org.ipc_p1.models;

public class Libros {
    private String autor;
    private int ano;
    private String titulo;
    private int edicion;
    private int isbn;
    private String palabras;
    private String desc;
    private String temas;
    private int copias;
    private int disp;


    public static Libros libros;

    public Libros(String autor, int ano, String titulo, int edicion, int isbn, String palabras, String desc, String temas, int copias, int disp) {
        this.autor = autor;
        this.ano = ano;
        this.titulo = titulo;
        this.edicion = edicion;
        this.isbn = isbn;
        this.palabras = palabras;
        this.desc = desc;
        this.temas = temas;
        this.copias = copias;
        this.disp = disp;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
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
}
