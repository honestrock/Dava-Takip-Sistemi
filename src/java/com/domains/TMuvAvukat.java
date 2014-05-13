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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apple
 */
@Entity
@Table(name = "t_muv_avukat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMuvAvukat.findAll", query = "SELECT t FROM TMuvAvukat t"),
    @NamedQuery(name = "TMuvAvukat.findByIdtMuvAvukat", query = "SELECT t FROM TMuvAvukat t WHERE t.idtMuvAvukat = :idtMuvAvukat"),
    @NamedQuery(name = "TMuvAvukat.findByMuvId", query = "SELECT t FROM TMuvAvukat t WHERE t.muvId = :muvId"),
    @NamedQuery(name = "TMuvAvukat.findByAvukatId", query = "SELECT t FROM TMuvAvukat t WHERE t.avukatId = :avukatId")})
public class TMuvAvukat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idt_muv_avukat")
    private Integer idtMuvAvukat;
    @Column(name = "muv_id")
    private Integer muvId;
    @Column(name = "avukat_id")
    private Integer avukatId;

    public TMuvAvukat() {
    }

    public TMuvAvukat(Integer idtMuvAvukat) {
        this.idtMuvAvukat = idtMuvAvukat;
    }

    public Integer getIdtMuvAvukat() {
        return idtMuvAvukat;
    }

    public void setIdtMuvAvukat(Integer idtMuvAvukat) {
        this.idtMuvAvukat = idtMuvAvukat;
    }

    public Integer getMuvId() {
        return muvId;
    }

    public void setMuvId(Integer muvId) {
        this.muvId = muvId;
    }

    public Integer getAvukatId() {
        return avukatId;
    }

    public void setAvukatId(Integer avukatId) {
        this.avukatId = avukatId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtMuvAvukat != null ? idtMuvAvukat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMuvAvukat)) {
            return false;
        }
        TMuvAvukat other = (TMuvAvukat) object;
        if ((this.idtMuvAvukat == null && other.idtMuvAvukat != null) || (this.idtMuvAvukat != null && !this.idtMuvAvukat.equals(other.idtMuvAvukat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domains.TMuvAvukat[ idtMuvAvukat=" + idtMuvAvukat + " ]";
    }
    
}
