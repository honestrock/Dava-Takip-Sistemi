package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author apple
 */
public class DatabaseConnection {
    
      public Connection connection(){
     
    try {
            //URL myUrl = getClass().getResource(".class");
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/UES", "root", "");


        } catch (Exception sqlException) {
            //sqlException.printStackTrace();
            System.out.println("baglanti saglanmadı");
        }
        return  null;
        }
    
}
