package org.ipc_p1.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UsuarioTable {

    private final StringProperty us;
    private final StringProperty pass;
    private final StringProperty nom;
    private final StringProperty ape;
    private final StringProperty rl;
    private final IntegerProperty cui;

    public UsuarioTable(String us, String pass, String nom, String ape, String rl, int cui) {
        this.us = new SimpleStringProperty(us);
        this.pass = new SimpleStringProperty(pass);
        this.nom = new SimpleStringProperty(nom);
        this.ape = new SimpleStringProperty(ape);
        this.rl = new SimpleStringProperty(rl);
        this.cui = new SimpleIntegerProperty(cui);
    }

    public String getUs() {
        return us.get();
    }

    public StringProperty usProperty() {
        return us;
    }

    public void setUs(String us) {
        this.us.set(us);
    }

    public String getPass() {
        return pass.get();
    }

    public StringProperty passProperty() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass.set(pass);
    }

    public String getNom() {
        return nom.get();
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getApe() {
        return ape.get();
    }

    public StringProperty apeProperty() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape.set(ape);
    }

    public String getRl() {
        return rl.get();
    }

    public StringProperty rlProperty() {
        return rl;
    }

    public void setRl(String rl) {
        this.rl.set(rl);
    }

    public int getCui() {
        return cui.get();
    }

    public IntegerProperty cuiProperty() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui.set(cui);
    }

}
