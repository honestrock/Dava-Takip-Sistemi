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
@Table(name = "t_muv_dava")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMuvDava.findAll", query = "SELECT t FROM TMuvDava t"),
    @NamedQuery(name = "TMuvDava.findByIdtMuvDava", query = "SELECT t FROM TMuvDava t WHERE t.idtMuvDava = :idtMuvDava"),
    @NamedQuery(name = "TMuvDava.findByMuvId", query = "SELECT t FROM TMuvDava t WHERE t.muvId = :muvId"),
    @NamedQuery(name = "TMuvDava.findByDavaId", query = "SELECT t FROM TMuvDava t WHERE t.davaId = :davaId")})
public class TMuvDava implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idt_muv_dava")
    private Integer idtMuvDava;
    @Column(name = "muv_id")
    private Integer muvId;
    @Column(name = "dava_id")
    private Integer davaId;

    public TMuvDava() {
    }

    public TMuvDava(Integer idtMuvDava) {
        this.idtMuvDava = idtMuvDava;
    }

    public Integer getIdtMuvDava() {
        return idtMuvDava;
    }

    public void setIdtMuvDava(Integer idtMuvDava) {
        this.idtMuvDava = idtMuvDava;
    }

    public Integer getMuvId() {
        return muvId;
    }

    public void setMuvId(Integer muvId) {
        this.muvId = muvId;
    }

    public Integer getDavaId() {
        return davaId;
    }

    public void setDavaId(Integer davaId) {
        this.davaId = davaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtMuvDava != null ? idtMuvDava.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMuvDava)) {
            return false;
        }
        TMuvDava other = (TMuvDava) object;
        if ((this.idtMuvDava == null && other.idtMuvDava != null) || (this.idtMuvDava != null && !this.idtMuvDava.equals(other.idtMuvDava))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domains.TMuvDava[ idtMuvDava=" + idtMuvDava + " ]";
    }
    
}
