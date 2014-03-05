package com.example.mallk;

import java.util.ArrayList;

public class Photo {
    private String URL;
    private String descripcion;
    private ArrayList<Comment>Comentarios;
    private String Favorito;
    public Photo(String url, String descripcion,ArrayList<Comment> Comentarios,String Favorito) {
        this.URL = url;
        this.descripcion = descripcion;
        this.Comentarios = Comentarios;
        this.Favorito = Favorito;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public ArrayList<Comment> getCommentList() {
        return Comentarios;
    }
    public void setCommentList(ArrayList<Comment> Comentarios) {
        this.Comentarios = Comentarios;
    }
    public String getFavorito() {
        return Favorito;
    }
    public void setFavorito(String Favorito) {
        this.Favorito = Favorito;
    }

}