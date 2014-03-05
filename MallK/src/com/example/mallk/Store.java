package com.example.mallk;

import java.util.ArrayList;

public class Store {
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Horario;
    private String Website;
    private String Email;
    private ArrayList<Comment> Comentarios;
    private String Favorito;
    private String Lugar;

    public Store(String Nombre,String Direccion,String Telefono,String Horario, String Website, String Email,ArrayList<Comment> Comentarios,String Favorito,String Lugar){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Horario = Horario;
        this.Website = Website;
        this.Email = Email;
        this.Comentarios = Comentarios;
        this.Favorito = Favorito;
        this.Lugar = Lugar;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getFavorito() {
        return Favorito;
    }

    public void setFavorito(String Favorito) {
        this.Favorito = Favorito;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public ArrayList<Comment> getComentarios() {
        return this.Comentarios;
    }

    public void setComentarios(ArrayList<Comment> commentList) {
        this.Comentarios = commentList;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
