/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import example.application.*;

/**
 *
 * @author fgailly
 */
public class JavaFXApplication extends Application {
  
  private University universityModel;
  
  @Override
  public void start(Stage stage) throws Exception {
    
    universityModel = new University();

    FXMLLoader loader = new FXMLLoader(getClass().getResource("/example/StartWindow.fxml"));

    Parent root = loader.load();
        
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
  
}
