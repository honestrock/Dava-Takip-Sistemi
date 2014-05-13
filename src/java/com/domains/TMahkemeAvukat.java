/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.domains;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apple
 */
@Entity
@Table(name = "t_mahkeme_avukat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMahkemeAvukat.findAll", query = "SELECT t FROM TMahkemeAvukat t"),
    @NamedQuery(name = "TMahkemeAvukat.findByIdtMahkemeAvukat", query = "SELECT t FROM TMahkemeAvukat t WHERE t.idtMahkemeAvukat = :idtMahkemeAvukat"),
    @NamedQuery(name = "TMahkemeAvukat.findByTAvukatId", query = "SELECT t FROM TMahkemeAvukat t WHERE t.tAvukatId = :tAvukatId"),
    @NamedQuery(name = "TMahkemeAvukat.findByTMahkemeId", query = "SELECT t FROM TMahkemeAvukat t WHERE t.tMahkemeId = :tMahkemeId")})
public class TMahkemeAvukat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idt_mahkeme_avukat")
    private Integer idtMahkemeAvukat;
    @Size(max = 45)
    @Column(name = "t_avukat_id")
    private String tAvukatId;
    @Size(max = 45)
    @Column(name = "t_mahkeme_id")
    private String tMahkemeId;

    public TMahkemeAvukat() {
    }

    public TMahkemeAvukat(Integer idtMahkemeAvukat) {
        this.idtMahkemeAvukat = idtMahkemeAvukat;
    }

    public Integer getIdtMahkemeAvukat() {
        return idtMahkemeAvukat;
    }

    public void setIdtMahkemeAvukat(Integer idtMahkemeAvukat) {
        this.idtMahkemeAvukat = idtMahkemeAvukat;
    }

    public String getTAvukatId() {
        return tAvukatId;
    }

    public void setTAvukatId(String tAvukatId) {
        this.tAvukatId = tAvukatId;
    }

    public String getTMahkemeId() {
        return tMahkemeId;
    }

    public void setTMahkemeId(String tMahkemeId) {
        this.tMahkemeId = tMahkemeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtMahkemeAvukat != null ? idtMahkemeAvukat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMahkemeAvukat)) {
            return false;
        }
        TMahkemeAvukat other = (TMahkemeAvukat) object;
        if ((this.idtMahkemeAvukat == null && other.idtMahkemeAvukat != null) || (this.idtMahkemeAvukat != null && !this.idtMahkemeAvukat.equals(other.idtMahkemeAvukat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domains.TMahkemeAvukat[ idtMahkemeAvukat=" + idtMahkemeAvukat + " ]";
    }
    
}
