/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdInventarioCAADI;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author charly
 */
@Entity
@Table(name = "Autor_actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autoractividad.findAll", query = "SELECT a FROM Autoractividad a")
    , @NamedQuery(name = "Autoractividad.findByIdAutor", query = "SELECT a FROM Autoractividad a WHERE a.idAutor = :idAutor")
    , @NamedQuery(name = "Autoractividad.findByNua", query = "SELECT a FROM Autoractividad a WHERE a.nua = :nua")})
public class Autoractividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_autor")
    private Integer idAutor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUA")
    private int nua;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAutor")
    private Collection<HojasTrabajo> hojasTrabajoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAutor")
    private Collection<Juegos> juegosCollection;

    public Autoractividad() {
    }

    public Autoractividad(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Autoractividad(Integer idAutor, int nua) {
        this.idAutor = idAutor;
        this.nua = nua;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public int getNua() {
        return nua;
    }

    public void setNua(int nua) {
        this.nua = nua;
    }

    @XmlTransient
    public Collection<HojasTrabajo> getHojasTrabajoCollection() {
        return hojasTrabajoCollection;
    }

    public void setHojasTrabajoCollection(Collection<HojasTrabajo> hojasTrabajoCollection) {
        this.hojasTrabajoCollection = hojasTrabajoCollection;
    }

    @XmlTransient
    public Collection<Juegos> getJuegosCollection() {
        return juegosCollection;
    }

    public void setJuegosCollection(Collection<Juegos> juegosCollection) {
        this.juegosCollection = juegosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutor != null ? idAutor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autoractividad)) {
            return false;
        }
        Autoractividad other = (Autoractividad) object;
        if ((this.idAutor == null && other.idAutor != null) || (this.idAutor != null && !this.idAutor.equals(other.idAutor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bdInventarioCAADI.Autoractividad[ idAutor=" + idAutor + " ]";
    }
    
}
