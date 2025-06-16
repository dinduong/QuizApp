/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndd.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {
    public static MyAlert instance;
    public final Alert alert;
    public MyAlert(){
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Quizz App");
    }
    public static MyAlert getInstance(){
        if(instance == null)
            instance = new MyAlert();
        return instance;
    }
    public void show(String message){
        alert.setContentText(message);
        alert.showAndWait();
    }
}
