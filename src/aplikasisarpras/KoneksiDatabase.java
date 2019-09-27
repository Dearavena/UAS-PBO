/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasisarpras;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author SMK 4
 */
public class KoneksiDatabase {
    
   private static Connection koneksi; 
   public static Connection getKoneksi(){
       if (koneksi == null){
           try {String url = "jdbc:mysql://localhost:3306/aplikasisarpras";
            String user = "root";
            String pass="";
            
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        koneksi = (Connection) DriverManager.getConnection(url, user, pass);
           }
           
           catch(SQLException t){
               System.out.print("Gagal melakukan koneksi ke database");
           }
       }
       return koneksi;
   } 
}
