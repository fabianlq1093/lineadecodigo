package com.lineadecodigo.javafx;

/**
 * @file HolaMundoJavaFx.java
 * @version 1.0
 * @author Ariel Carraro
 * @date   3/enero/2013
 * @url  http://lineadecodigo.com/java/hola-mundo-con-javafx/  
 * @description Hola Mundo con JavaFX
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class HolaMundoJavaFx extends Application {

    private Button boton;
    private StackPane panel;


    @Override
    public void start(Stage primaryStage) throws Exception{
    	
        
    	// Configuramos la ventana
    	primaryStage.setTitle("Iniciando con Java FX");
    	 
    	// Creamos un bot—n
    	boton = new Button("Saludar");
        boton.setVisible(true);
        boton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	System.out.println("Hola Mundo!!!");
            }
        });
        
        // El panel
        panel = new StackPane();
        // A–adimos el bot—n
        panel.getChildren().add(boton);
        
        // Configuramos la Escena

        Scene escena = new Scene(panel, 250, 150, Color.BLACK);
        primaryStage.setScene(escena);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}