/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdInventarioCAADI;

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
 * @author charly
 */
@Entity
@Table(name = "Hojas_Trabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HojasTrabajo.findAll", query = "SELECT h FROM HojasTrabajo h")
    , @NamedQuery(name = "HojasTrabajo.findByIdHoja", query = "SELECT h FROM HojasTrabajo h WHERE h.idHoja = :idHoja")
    , @NamedQuery(name = "HojasTrabajo.findByDuracionHoja", query = "SELECT h FROM HojasTrabajo h WHERE h.duracionHoja = :duracionHoja")
    , @NamedQuery(name = "HojasTrabajo.findByNombreHoja", query = "SELECT h FROM HojasTrabajo h WHERE h.nombreHoja = :nombreHoja")
    , @NamedQuery(name = "HojasTrabajo.findByFecha", query = "SELECT h FROM HojasTrabajo h WHERE h.fecha = :fecha")})
public class HojasTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_hoja")
    private Integer idHoja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duracion_hoja")
    private int duracionHoja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_hoja")
    private String nombreHoja;
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
    @JoinColumn(name = "id_material", referencedColumnName = "id_material")
    @ManyToOne(optional = false)
    private Materialapoyo idMaterial;
    @JoinColumn(name = "id_nivel", referencedColumnName = "id_nivel")
    @ManyToOne(optional = false)
    private Nivel idNivel;
    @JoinColumn(name = "id_autor", referencedColumnName = "id_autor")
    @ManyToOne(optional = false)
    private Autoractividad idAutor;
    @JoinColumn(name = "id_idioma", referencedColumnName = "id_idioma")
    @ManyToOne(optional = false)
    private Idioma idIdioma;
    @JoinColumn(name = "id_rating", referencedColumnName = "id_rating")
    @ManyToOne(optional = false)
    private Rating idRating;

    public HojasTrabajo() {
    }

    public HojasTrabajo(Integer idHoja) {
        this.idHoja = idHoja;
    }

    public HojasTrabajo(Integer idHoja, int duracionHoja, String nombreHoja, Date fecha) {
        this.idHoja = idHoja;
        this.duracionHoja = duracionHoja;
        this.nombreHoja = nombreHoja;
        this.fecha = fecha;
    }

    public Integer getIdHoja() {
        return idHoja;
    }

    public void setIdHoja(Integer idHoja) {
        this.idHoja = idHoja;
    }

    public int getDuracionHoja() {
        return duracionHoja;
    }

    public void setDuracionHoja(int duracionHoja) {
        this.duracionHoja = duracionHoja;
    }

    public String getNombreHoja() {
        return nombreHoja;
    }

    public void setNombreHoja(String nombreHoja) {
        this.nombreHoja = nombreHoja;
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

    public Materialapoyo getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Materialapoyo idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Nivel getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Nivel idNivel) {
        this.idNivel = idNivel;
    }

    public Autoractividad getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Autoractividad idAutor) {
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
        hash += (idHoja != null ? idHoja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HojasTrabajo)) {
            return false;
        }
        HojasTrabajo other = (HojasTrabajo) object;
        if ((this.idHoja == null && other.idHoja != null) || (this.idHoja != null && !this.idHoja.equals(other.idHoja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bdInventarioCAADI.HojasTrabajo[ idHoja=" + idHoja + " ]";
    }
    
}
