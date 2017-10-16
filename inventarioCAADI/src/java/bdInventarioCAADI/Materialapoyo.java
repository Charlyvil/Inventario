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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author charly
 */
@Entity
@Table(name = "Material_apoyo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialapoyo.findAll", query = "SELECT m FROM Materialapoyo m")
    , @NamedQuery(name = "Materialapoyo.findByIdMaterial", query = "SELECT m FROM Materialapoyo m WHERE m.idMaterial = :idMaterial")
    , @NamedQuery(name = "Materialapoyo.findByNombreMaterial", query = "SELECT m FROM Materialapoyo m WHERE m.nombreMaterial = :nombreMaterial")})
public class Materialapoyo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_material")
    private Integer idMaterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_material")
    private String nombreMaterial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMaterial")
    private Collection<HojasTrabajo> hojasTrabajoCollection;

    public Materialapoyo() {
    }

    public Materialapoyo(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Materialapoyo(Integer idMaterial, String nombreMaterial) {
        this.idMaterial = idMaterial;
        this.nombreMaterial = nombreMaterial;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    @XmlTransient
    public Collection<HojasTrabajo> getHojasTrabajoCollection() {
        return hojasTrabajoCollection;
    }

    public void setHojasTrabajoCollection(Collection<HojasTrabajo> hojasTrabajoCollection) {
        this.hojasTrabajoCollection = hojasTrabajoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterial != null ? idMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialapoyo)) {
            return false;
        }
        Materialapoyo other = (Materialapoyo) object;
        if ((this.idMaterial == null && other.idMaterial != null) || (this.idMaterial != null && !this.idMaterial.equals(other.idMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bdInventarioCAADI.Materialapoyo[ idMaterial=" + idMaterial + " ]";
    }
    
}
