/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author yash
 */
public class ConnectionProvider {
    public static  Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem", "root", "Madhav@10");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
           return null; 
        }
    }
     public static void main(String [] args) {
       ConnectionProvider obj = new ConnectionProvider();
      Connection c = obj.getCon();
    }
}
