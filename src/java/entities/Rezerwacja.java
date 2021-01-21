/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Barto
 */
@Entity
@Table(name = "REZERWACJA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rezerwacja.findAll", query = "SELECT r FROM Rezerwacja r"),
    @NamedQuery(name = "Rezerwacja.findByRezerwacjaId", query = "SELECT r FROM Rezerwacja r WHERE r.rezerwacjaId = :rezerwacjaId")})
public class Rezerwacja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "REZERWACJA_ID")
    private Integer rezerwacjaId;
    @JoinColumn(name = "ID_WYDARZENIE", referencedColumnName = "WYDARZENIE_ID")
    @ManyToOne(optional = false)
    private Wydarzenie idWydarzenie;

    public Rezerwacja() {
    }

    public Rezerwacja(Integer rezerwacjaId) {
        this.rezerwacjaId = rezerwacjaId;
    }

    public Integer getRezerwacjaId() {
        return rezerwacjaId;
    }

    public void setRezerwacjaId(Integer rezerwacjaId) {
        this.rezerwacjaId = rezerwacjaId;
    }

    public Wydarzenie getIdWydarzenie() {
        return idWydarzenie;
    }

    public void setIdWydarzenie(Wydarzenie idWydarzenie) {
        this.idWydarzenie = idWydarzenie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rezerwacjaId != null ? rezerwacjaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rezerwacja)) {
            return false;
        }
        Rezerwacja other = (Rezerwacja) object;
        if ((this.rezerwacjaId == null && other.rezerwacjaId != null) || (this.rezerwacjaId != null && !this.rezerwacjaId.equals(other.rezerwacjaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Rezerwacja[ rezerwacjaId=" + rezerwacjaId + " ]";
    }
    
}
