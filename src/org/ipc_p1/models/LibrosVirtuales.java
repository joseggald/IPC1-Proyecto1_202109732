package org.ipc_p1.models;

public class LibrosVirtuales {
    private String autor;
    private int año;
    private String titulo;
    private String palabras;
    private String desc;
    private String temas;
    private int tam;

    public LibrosVirtuales(String autor, int año, String titulo, String palabras, String desc, String temas, int tam) {
        this.autor = autor;
        this.año = año;
        this.titulo = titulo;
        this.palabras = palabras;
        this.desc = desc;
        this.temas = temas;
        this.tam = tam;

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

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }


}
