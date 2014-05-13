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
@Table(name = "t_dava")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TDava.findAll", query = "SELECT t FROM TDava t"),
    @NamedQuery(name = "TDava.findByDavaId", query = "SELECT t FROM TDava t WHERE t.davaId = :davaId"),
    @NamedQuery(name = "TDava.findByDavaAdi", query = "SELECT t FROM TDava t WHERE t.davaAdi = :davaAdi"),
    @NamedQuery(name = "TDava.findByDavaTipi", query = "SELECT t FROM TDava t WHERE t.davaTipi = :davaTipi"),
    @NamedQuery(name = "TDava.findByDavaUcret", query = "SELECT t FROM TDava t WHERE t.davaUcret = :davaUcret")})
public class TDava implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dava_id")
    private Integer davaId;
    @Size(max = 45)
    @Column(name = "dava_adi")
    private String davaAdi;
    @Column(name = "dava_tipi")
    private Integer davaTipi;
    @Column(name = "dava_ucret")
    private Integer davaUcret;

    public TDava() {
    }

    public TDava(Integer davaId) {
        this.davaId = davaId;
    }

    public Integer getDavaId() {
        return davaId;
    }

    public void setDavaId(Integer davaId) {
        this.davaId = davaId;
    }

    public String getDavaAdi() {
        return davaAdi;
    }

    public void setDavaAdi(String davaAdi) {
        this.davaAdi = davaAdi;
    }

    public Integer getDavaTipi() {
        return davaTipi;
    }

    public void setDavaTipi(Integer davaTipi) {
        this.davaTipi = davaTipi;
    }

    public Integer getDavaUcret() {
        return davaUcret;
    }

    public void setDavaUcret(Integer davaUcret) {
        this.davaUcret = davaUcret;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (davaId != null ? davaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TDava)) {
            return false;
        }
        TDava other = (TDava) object;
        if ((this.davaId == null && other.davaId != null) || (this.davaId != null && !this.davaId.equals(other.davaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domains.TDava[ davaId=" + davaId + " ]";
    }
    
}
