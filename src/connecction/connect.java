/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  connecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ALYA
 */
public class connect {
     public static Connection mysqlConnect;
                             //ini bisa diubah
    public static Connection connectDB(){
        
        if(mysqlConnect==null){
            try{
                String url="jdbc:mysql://localhost:3306/db_lelang";
                String user="root";
                String pass="";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlConnect = (Connection)
                        DriverManager.getConnection(url,user,pass);
                System.out.println("Koneksi berhasil");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "gagal koneksi, silahkan coba lagi");
            }
        }
        return mysqlConnect;
    }
    
    public static void main(String[] args) {
       connectDB(); 
    }
    
}
