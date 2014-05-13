/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.services;

import com.domains.TDava;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public interface DavaService {
 
    public ArrayList<TDava> davaBul(String tip);
    public ArrayList<TDava> davaGetir();
    
}
