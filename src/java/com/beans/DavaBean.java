/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beans;

import com.domains.TDava;
import com.serviceimp.DavaServiceImp;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class DavaBean {

    ArrayList<TDava> d_list;
    DavaServiceImp ds=new DavaServiceImp();
    
    public DavaBean() {
    }
    
    public ArrayList<TDava> davaGetir(){
        
        d_list=ds.davaGetir();
        
        return d_list;
    }
}
