/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ndd.quizappv2;

import java.net.URL;
import java.nio.channels.ConnectionPendingException;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizzdb", "root", "root");
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery("Select * from category");
                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println(id + " - " + name);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuestionsController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }    
    
}
