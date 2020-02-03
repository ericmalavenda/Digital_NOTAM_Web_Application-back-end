package com.example.notam;
import java.sql.*;

class Database_Connection {
    // Variables

    String jdbUrl = "jdbc:postgresql://ec2-184-73-181-132.compute-1.amazonaws.com:5432/d86eut5gpfha34";
    String username = "xlapitalxalvag";
    String password = "5f87a541df18d52e4b5f3f7522594cfe807bbeb803c8183abc51735dcda70ddd";

    // Database Variables
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    // Constructor
    Database_Connection(){ }

    // Connection
    void connect(){
        try {
            conn = DriverManager.getConnection(jdbUrl, username, password);

            //print success;
            System.out.println("Connection Established");

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    //Disconnect
    void disconnect(){
        try {
            if(stmt != null) {
                stmt.close();
            }
            if(rs != null) {
                rs.close();
            }
            if(conn != null) {
                conn.close();
            }

            //print successful disconnect;
            System.out.println("Connection Ended");

        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
