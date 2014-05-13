/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.serviceimp;

import com.database.DatabaseConnection;
import com.domains.TDava;
import com.services.DavaService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apple
 */
public class DavaServiceImp implements DavaService{
    
    public DatabaseConnection baglanti = new DatabaseConnection();
    private PreparedStatement pr;

    public DavaServiceImp() {
        
    }
    
    

    @Override
    public ArrayList<TDava> davaBul(String tip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TDava> davaGetir() {
            
            ArrayList<TDava> d_list=new ArrayList<TDava>();
        
        try {
            pr = baglanti.connection().prepareStatement("select * from t_dava");
            ResultSet results = pr.executeQuery();
            while(results.next()){
                TDava dava=new TDava();
                dava.setDavaAdi(results.getString("dava_adi"));
                dava.setDavaId(results.getInt("dava_id"));
                dava.setDavaTipi(results.getInt("dava_tipi"));
                dava.setDavaUcret(results.getInt("dava_ucret"));
                d_list.add(dava);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DavaServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         return d_list;
    }
    
}
