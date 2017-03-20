/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_p1;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author falak
 */
public class Setup {
    
    public static final String jdbcURL 
	= "jdbc:oracle:thin:@orca.csc.ncsu.edu:1521:orcl01";
    public static String loginuserid = "";
    public static String loginpassword = "";
    public static String logintype = "";
    public static Connection conn;
    public static ResultSet rs;
    public static Statement stmt;
    public static String user = "smsejwan";
    public static String password = "200111532";
    public static String patientOfHS = "";
    public static String alertId="";
    public static void main(String args[]){
        
    }
    
    public void connect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("JDBC Driver Class not found error");
            Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conn = DriverManager.getConnection(jdbcURL, user, password);
        } catch (SQLException ex) {
            System.out.println("Driver connection error");
            Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("Statement error");
            Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void disconnect(){
        if(conn != null){
            try {    
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Connection close error");
                Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Statement close error");
                Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Result Set close error");
                Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
