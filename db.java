/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    
    public static Connection mycon(){
     Connection con = null;
     
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/pos", "root", "");
         
         if (con != null) {
             return con;
         } else {
             System.out.println("Failed to establish a connection to the database.");
             return null;
         }
         
     } catch (ClassNotFoundException | SQLException e){
         System.out.println(e);
         return null;
     }
 }

    
}

