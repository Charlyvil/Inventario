/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author laboratorio
 */
@Named(value = "revista")
@Dependent
public class Revista {

    /**
     * Creates a new instance of Revista
     */
    public Revista() {
    }
    
    String id_revista, nombre_revista, titulo_revista, fecha_revista,estado_revista;

    public String getId_revista() {
        return id_revista;
    }

    public String getNombre_revista() {
        return nombre_revista;
    }

    public String getTitulo_revista() {
        return titulo_revista;
    }

    public String getFecha_revista() {
        return fecha_revista;
    }

    public String getEstado_revista() {
        return estado_revista;
    }

    public void setId_revista(String id_revista) {
        this.id_revista = id_revista;
    }

    public void setNombre_revista(String nombre_revista) {
        this.nombre_revista = nombre_revista;
    }

    public void setTitulo_revista(String titulo_revista) {
        this.titulo_revista = titulo_revista;
    }

    public void setFecha_revista(String fecha_revista) {
        this.fecha_revista = fecha_revista;
    }

    public void setEstado_revista(String estado_revista) {
        this.estado_revista = estado_revista;
    }
    
}
