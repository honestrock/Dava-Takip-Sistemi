/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.domains;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apple
 */
@Entity
@Table(name = "t_mahkeme_takip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMahkemeTakip.findAll", query = "SELECT t FROM TMahkemeTakip t"),
    @NamedQuery(name = "TMahkemeTakip.findByIdtMahkemeTakip", query = "SELECT t FROM TMahkemeTakip t WHERE t.idtMahkemeTakip = :idtMahkemeTakip"),
    @NamedQuery(name = "TMahkemeTakip.findByMahkemeZaman", query = "SELECT t FROM TMahkemeTakip t WHERE t.mahkemeZaman = :mahkemeZaman"),
    @NamedQuery(name = "TMahkemeTakip.findByMahkemeYeri", query = "SELECT t FROM TMahkemeTakip t WHERE t.mahkemeYeri = :mahkemeYeri")})
public class TMahkemeTakip implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idt_mahkeme_takip")
    private Integer idtMahkemeTakip;
    @Column(name = "mahkeme_zaman")
    @Temporal(TemporalType.DATE)
    private Date mahkemeZaman;
    @Size(max = 255)
    @Column(name = "mahkeme_yeri")
    private String mahkemeYeri;

    public TMahkemeTakip() {
    }

    public TMahkemeTakip(Integer idtMahkemeTakip) {
        this.idtMahkemeTakip = idtMahkemeTakip;
    }

    public Integer getIdtMahkemeTakip() {
        return idtMahkemeTakip;
    }

    public void setIdtMahkemeTakip(Integer idtMahkemeTakip) {
        this.idtMahkemeTakip = idtMahkemeTakip;
    }

    public Date getMahkemeZaman() {
        return mahkemeZaman;
    }

    public void setMahkemeZaman(Date mahkemeZaman) {
        this.mahkemeZaman = mahkemeZaman;
    }

    public String getMahkemeYeri() {
        return mahkemeYeri;
    }

    public void setMahkemeYeri(String mahkemeYeri) {
        this.mahkemeYeri = mahkemeYeri;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtMahkemeTakip != null ? idtMahkemeTakip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMahkemeTakip)) {
            return false;
        }
        TMahkemeTakip other = (TMahkemeTakip) object;
        if ((this.idtMahkemeTakip == null && other.idtMahkemeTakip != null) || (this.idtMahkemeTakip != null && !this.idtMahkemeTakip.equals(other.idtMahkemeTakip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domains.TMahkemeTakip[ idtMahkemeTakip=" + idtMahkemeTakip + " ]";
    }
    
}
