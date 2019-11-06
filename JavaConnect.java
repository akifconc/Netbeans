/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akif
 */
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employee_info","akif","devyani@12");
          JOptionPane.showMessageDialog(null,"Connection Established");
          return conn;
      } catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
      }   
    } 
}
