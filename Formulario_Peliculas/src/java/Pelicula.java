/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Diana_G
 */
@Named(value = "pelicula")
@Dependent
public class Pelicula {

    /**
     * Creates a new instance of Pelicula
     */
    public Pelicula() {
    }
    
    String titulo_pelicula,back_cover,front_cover, nombre_actor, apellido_actor, idioma, genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    int duracion_pelicula;

    public int getDuracion_pelicula() {
        return duracion_pelicula;
    }

    public void setDuracion_pelicula(int duracion_pelicula) {
        this.duracion_pelicula = duracion_pelicula;
    }
    
    public String getTitulo_pelicula() {
        return titulo_pelicula;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setTitulo_pelicula(String titulo_pelicula) {
        this.titulo_pelicula = titulo_pelicula;
    }

    public String getBack_cover() {
        return back_cover;
    }

    public void setBack_cover(String back_cover) {
        this.back_cover = back_cover;
    }

    public String getFront_cover() {
        return front_cover;
    }

    public void setFront_cover(String front_cover) {
        this.front_cover = front_cover;
    }

    public String getNombre_actor() {
        return nombre_actor;
    }

    public void setNombre_actor(String nombre_actor) {
        this.nombre_actor = nombre_actor;
    }

    public String getApellido_actor() {
        return apellido_actor;
    }

    public void setApellido_actor(String apellido_actor) {
        this.apellido_actor = apellido_actor;
    }
    
    
}
