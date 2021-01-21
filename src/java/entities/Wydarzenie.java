/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
 * @author Barto
 */
@Entity
@Table(name = "WYDARZENIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wydarzenie.findAll", query = "SELECT w FROM Wydarzenie w"),
    @NamedQuery(name = "Wydarzenie.findByWydarzenieId", query = "SELECT w FROM Wydarzenie w WHERE w.wydarzenieId = :wydarzenieId"),
    @NamedQuery(name = "Wydarzenie.findByLiczbaMiejsc", query = "SELECT w FROM Wydarzenie w WHERE w.liczbaMiejsc = :liczbaMiejsc"),
    @NamedQuery(name = "Wydarzenie.findByNazwaWydarzenia", query = "SELECT w FROM Wydarzenie w WHERE w.nazwaWydarzenia = :nazwaWydarzenia"),
    @NamedQuery(name = "Wydarzenie.findByDataWydarzenia", query = "SELECT w FROM Wydarzenie w WHERE w.dataWydarzenia = :dataWydarzenia"),
    @NamedQuery(name = "Wydarzenie.findByGodzinaRozpoczecia", query = "SELECT w FROM Wydarzenie w WHERE w.godzinaRozpoczecia = :godzinaRozpoczecia"),
    @NamedQuery(name = "Wydarzenie.findByTypWydarzenia", query = "SELECT w FROM Wydarzenie w WHERE w.typWydarzenia = :typWydarzenia"),
    @NamedQuery(name = "Wydarzenie.findByLinkDoWydarzenia", query = "SELECT w FROM Wydarzenie w WHERE w.linkDoWydarzenia = :linkDoWydarzenia"),
    @NamedQuery(name = "Wydarzenie.findByMiejsceWydarzenia", query = "SELECT w FROM Wydarzenie w WHERE w.miejsceWydarzenia = :miejsceWydarzenia"),
    @NamedQuery(name = "Wydarzenie.findByCzasTrwania", query = "SELECT w FROM Wydarzenie w WHERE w.czasTrwania = :czasTrwania")})
public class Wydarzenie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WYDARZENIE_ID")
    private Integer wydarzenieId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LICZBA_MIEJSC")
    private int liczbaMiejsc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NAZWA_WYDARZENIA")
    private String nazwaWydarzenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DATA_WYDARZENIA")
    private String dataWydarzenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "GODZINA_ROZPOCZECIA")
    private String godzinaRozpoczecia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TYP_WYDARZENIA")
    private String typWydarzenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LINK_DO_WYDARZENIA")
    private String linkDoWydarzenia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MIEJSCE_WYDARZENIA")
    private String miejsceWydarzenia;
    @Column(name = "CZAS_TRWANIA")
    private Integer czasTrwania;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idWydarzenie")
    private Collection<Rezerwacja> rezerwacjaCollection;

    public Wydarzenie() {
    }

    public Wydarzenie(Integer wydarzenieId) {
        this.wydarzenieId = wydarzenieId;
    }

    public Wydarzenie(Integer wydarzenieId, int liczbaMiejsc, String nazwaWydarzenia, String dataWydarzenia, String godzinaRozpoczecia, String typWydarzenia, String linkDoWydarzenia, String miejsceWydarzenia) {
        this.wydarzenieId = wydarzenieId;
        this.liczbaMiejsc = liczbaMiejsc;
        this.nazwaWydarzenia = nazwaWydarzenia;
        this.dataWydarzenia = dataWydarzenia;
        this.godzinaRozpoczecia = godzinaRozpoczecia;
        this.typWydarzenia = typWydarzenia;
        this.linkDoWydarzenia = linkDoWydarzenia;
        this.miejsceWydarzenia = miejsceWydarzenia;
    }

    public Integer getWydarzenieId() {
        return wydarzenieId;
    }

    public void setWydarzenieId(Integer wydarzenieId) {
        this.wydarzenieId = wydarzenieId;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public String getNazwaWydarzenia() {
        return nazwaWydarzenia;
    }

    public void setNazwaWydarzenia(String nazwaWydarzenia) {
        this.nazwaWydarzenia = nazwaWydarzenia;
    }

    public String getDataWydarzenia() {
        return dataWydarzenia;
    }

    public void setDataWydarzenia(String dataWydarzenia) {
        this.dataWydarzenia = dataWydarzenia;
    }

    public String getGodzinaRozpoczecia() {
        return godzinaRozpoczecia;
    }

    public void setGodzinaRozpoczecia(String godzinaRozpoczecia) {
        this.godzinaRozpoczecia = godzinaRozpoczecia;
    }

    public String getTypWydarzenia() {
        return typWydarzenia;
    }

    public void setTypWydarzenia(String typWydarzenia) {
        this.typWydarzenia = typWydarzenia;
    }

    public String getLinkDoWydarzenia() {
        return linkDoWydarzenia;
    }

    public void setLinkDoWydarzenia(String linkDoWydarzenia) {
        this.linkDoWydarzenia = linkDoWydarzenia;
    }

    public String getMiejsceWydarzenia() {
        return miejsceWydarzenia;
    }

    public void setMiejsceWydarzenia(String miejsceWydarzenia) {
        this.miejsceWydarzenia = miejsceWydarzenia;
    }

    public Integer getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(Integer czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    @XmlTransient
    public Collection<Rezerwacja> getRezerwacjaCollection() {
        return rezerwacjaCollection;
    }

    public void setRezerwacjaCollection(Collection<Rezerwacja> rezerwacjaCollection) {
        this.rezerwacjaCollection = rezerwacjaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wydarzenieId != null ? wydarzenieId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wydarzenie)) {
            return false;
        }
        Wydarzenie other = (Wydarzenie) object;
        if ((this.wydarzenieId == null && other.wydarzenieId != null) || (this.wydarzenieId != null && !this.wydarzenieId.equals(other.wydarzenieId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Wydarzenie[ wydarzenieId=" + wydarzenieId + " ]";
    }
    
}
