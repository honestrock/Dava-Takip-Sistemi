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
@Table(name = "t_avukat_muv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TAvukatMuv.findAll", query = "SELECT t FROM TAvukatMuv t"),
    @NamedQuery(name = "TAvukatMuv.findByIdnewTable", query = "SELECT t FROM TAvukatMuv t WHERE t.idnewTable = :idnewTable"),
    @NamedQuery(name = "TAvukatMuv.findByMuvId", query = "SELECT t FROM TAvukatMuv t WHERE t.muvId = :muvId"),
    @NamedQuery(name = "TAvukatMuv.findByAvukatId", query = "SELECT t FROM TAvukatMuv t WHERE t.avukatId = :avukatId")})
public class TAvukatMuv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnew_table")
    private Integer idnewTable;
    @Column(name = "muv_id")
    private Integer muvId;
    @Column(name = "avukat_id")
    private Integer avukatId;

    public TAvukatMuv() {
    }

    public TAvukatMuv(Integer idnewTable) {
        this.idnewTable = idnewTable;
    }

    public Integer getIdnewTable() {
        return idnewTable;
    }

    public void setIdnewTable(Integer idnewTable) {
        this.idnewTable = idnewTable;
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
        hash += (idnewTable != null ? idnewTable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAvukatMuv)) {
            return false;
        }
        TAvukatMuv other = (TAvukatMuv) object;
        if ((this.idnewTable == null && other.idnewTable != null) || (this.idnewTable != null && !this.idnewTable.equals(other.idnewTable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domains.TAvukatMuv[ idnewTable=" + idnewTable + " ]";
    }
    
}
