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
@Table(name = "t_muvekkil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMuvekkil.findAll", query = "SELECT t FROM TMuvekkil t"),
    @NamedQuery(name = "TMuvekkil.findByMuvekkilId", query = "SELECT t FROM TMuvekkil t WHERE t.muvekkilId = :muvekkilId"),
    @NamedQuery(name = "TMuvekkil.findByMuvAdi", query = "SELECT t FROM TMuvekkil t WHERE t.muvAdi = :muvAdi"),
    @NamedQuery(name = "TMuvekkil.findByMuvAdres", query = "SELECT t FROM TMuvekkil t WHERE t.muvAdres = :muvAdres"),
    @NamedQuery(name = "TMuvekkil.findByMuvTc", query = "SELECT t FROM TMuvekkil t WHERE t.muvTc = :muvTc")})
public class TMuvekkil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "muvekkil_id")
    private Integer muvekkilId;
    @Size(max = 45)
    @Column(name = "muv_adi")
    private String muvAdi;
    @Size(max = 45)
    @Column(name = "muv_adres")
    private String muvAdres;
    @Column(name = "muv_tc")
    private Integer muvTc;

    public TMuvekkil() {
    }

    public TMuvekkil(Integer muvekkilId) {
        this.muvekkilId = muvekkilId;
    }

    public Integer getMuvekkilId() {
        return muvekkilId;
    }

    public void setMuvekkilId(Integer muvekkilId) {
        this.muvekkilId = muvekkilId;
    }

    public String getMuvAdi() {
        return muvAdi;
    }

    public void setMuvAdi(String muvAdi) {
        this.muvAdi = muvAdi;
    }

    public String getMuvAdres() {
        return muvAdres;
    }

    public void setMuvAdres(String muvAdres) {
        this.muvAdres = muvAdres;
    }

    public Integer getMuvTc() {
        return muvTc;
    }

    public void setMuvTc(Integer muvTc) {
        this.muvTc = muvTc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (muvekkilId != null ? muvekkilId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMuvekkil)) {
            return false;
        }
        TMuvekkil other = (TMuvekkil) object;
        if ((this.muvekkilId == null && other.muvekkilId != null) || (this.muvekkilId != null && !this.muvekkilId.equals(other.muvekkilId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domains.TMuvekkil[ muvekkilId=" + muvekkilId + " ]";
    }
    
}
