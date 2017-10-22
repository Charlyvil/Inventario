/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diana_G
 */
@Entity
@Table(name = "juegos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juegos.findAll", query = "SELECT j FROM Juegos j")
    , @NamedQuery(name = "Juegos.findByIdJuego", query = "SELECT j FROM Juegos j WHERE j.idJuego = :idJuego")
    , @NamedQuery(name = "Juegos.findByNombreJuego", query = "SELECT j FROM Juegos j WHERE j.nombreJuego = :nombreJuego")
    , @NamedQuery(name = "Juegos.findByInstrucciones", query = "SELECT j FROM Juegos j WHERE j.instrucciones = :instrucciones")
    , @NamedQuery(name = "Juegos.findByUnidad", query = "SELECT j FROM Juegos j WHERE j.unidad = :unidad")
    , @NamedQuery(name = "Juegos.findByDuracion", query = "SELECT j FROM Juegos j WHERE j.duracion = :duracion")
    , @NamedQuery(name = "Juegos.findByFecha", query = "SELECT j FROM Juegos j WHERE j.fecha = :fecha")})
public class Juegos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_juego")
    private Integer idJuego;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_juego")
    private String nombreJuego;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "instrucciones")
    private String instrucciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unidad")
    private int unidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion")
    private int duracion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "id_estatus", referencedColumnName = "id_estatus")
    @ManyToOne(optional = false)
    private Estatus idEstatus;
    @JoinColumn(name = "id_habilidad", referencedColumnName = "id_habilidad")
    @ManyToOne(optional = false)
    private Habilidad idHabilidad;
    @JoinColumn(name = "id_nivel", referencedColumnName = "id_nivel")
    @ManyToOne(optional = false)
    private Nivel idNivel;
    @JoinColumn(name = "id_autor", referencedColumnName = "id_autor")
    @ManyToOne(optional = false)
    private AutorActividad idAutor;
    @JoinColumn(name = "id_idioma", referencedColumnName = "id_idioma")
    @ManyToOne(optional = false)
    private Idioma idIdioma;
    @JoinColumn(name = "id_rating", referencedColumnName = "id_rating")
    @ManyToOne(optional = false)
    private Rating idRating;

    public Juegos() {
    }

    public Juegos(Integer idJuego) {
        this.idJuego = idJuego;
    }

    public Juegos(Integer idJuego, String nombreJuego, String instrucciones, int unidad, int duracion, Date fecha) {
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
        this.instrucciones = instrucciones;
        this.unidad = unidad;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public Integer getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Integer idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estatus getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Estatus idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Habilidad getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(Habilidad idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    public Nivel getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Nivel idNivel) {
        this.idNivel = idNivel;
    }

    public AutorActividad getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(AutorActividad idAutor) {
        this.idAutor = idAutor;
    }

    public Idioma getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Idioma idIdioma) {
        this.idIdioma = idIdioma;
    }

    public Rating getIdRating() {
        return idRating;
    }

    public void setIdRating(Rating idRating) {
        this.idRating = idRating;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJuego != null ? idJuego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juegos)) {
            return false;
        }
        Juegos other = (Juegos) object;
        if ((this.idJuego == null && other.idJuego != null) || (this.idJuego != null && !this.idJuego.equals(other.idJuego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Juegos[ idJuego=" + idJuego + " ]";
    }
    
}
