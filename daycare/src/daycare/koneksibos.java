/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class koneksibos {
    private Connection connection ;
    
    public Connection setConnection() 
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/zendaycare";
            String user = "root";
            String pass = "";
          
////            
//            String url ="jdbc:sqlserver://CHEETAH;databaseName=zendaycare";   
//            String user ="sa";
//            String pass = "123qwe"; // terserah kamu aja 
            
                Class.forName("com.mysql.jdbc.Driver"); // mysql package
//               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
                connection = DriverManager.getConnection(url, user, pass);
                System.out.println("berhasil konek ke database");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error "+e.getMessage());
        }
        return connection;
       }
}
