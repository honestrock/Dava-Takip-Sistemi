/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beans;

import com.database.DatabaseConnection;
import com.domains.TUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author apple
 */
public class DtsBean {
   private TUser userinformation;
    private PreparedStatement titlesQuery;
    private DatabaseConnection m_con;
   private String email;
    public DtsBean(){
        m_con=new DatabaseConnection();
        userinformation=new TUser();
        userinformation.setMailUser("");
        userinformation.setNameUser("");
        userinformation.setSurnameUser("");
        userinformation.setTypeUser(1);
        m_con.connection();
    }
    
  
    public String login(){
        
        try{
            userinformation.setTypeUser(1);
            titlesQuery=m_con.connection().prepareStatement("select * from t_user where mail_user=? ");
            System.out.println(userinformation.getMailUser());
            System.out.println(userinformation.getPasswordUser());
            titlesQuery.setString(1, userinformation.getMailUser());
            ResultSet result=titlesQuery.executeQuery();
            
            while (result.next()) {
                System.out.println(result.getString("mail_user"));
                 System.out.println(result.getString("password_user"));
                if (result.getString("mail_user").equals(userinformation.getMailUser()) && result.getString("password_user").equals(userinformation.getPasswordUser())) {

                       
                        userinformation.setMailUser(result.getString("mail_user"));
                        userinformation.setTypeUser(result.getInt("type_user"));
                      
                }
                   return "admin";
            }
            
         
            return "login";
                    
        }catch(Exception ex){
                System.out.println("degerler yanlis");
             return "login";
        }
        
       
    }
    

    /**
     * @return the userinformation
     */
    public TUser getUserinformation() {
        return userinformation;
    }

    /**
     * @param userinformation the userinformation to set
     */
    public void setUserinformation(TUser userinformation) {
        this.userinformation = userinformation;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the testDomain
     */
   
}
