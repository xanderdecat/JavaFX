/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.ContextMenuEvent;
import example.application.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author fgailly
 */
public class StudentAddController implements Initializable {
  
  private University model = new University();

  @FXML
  private TextField txtNaam;
  @FXML
  private TextField txtNummer;
  @FXML
  private Button addStudentBtn;
  @FXML
  private TextArea txtSummary;
  @FXML
  private CheckBox chkFullTime;
  @FXML
  private CheckBox chkGraduate;
  @FXML
  private Label testLbl;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {

  }
  @FXML
  private void addStudent(ActionEvent event) {
 
    try {
      String naam = txtNaam.getText();
      int nummer = Integer.parseInt(txtNummer.getText());
      boolean fulltime = chkFullTime.isSelected();
      boolean graduate = chkGraduate.isSelected();
      String summary = txtSummary.getText();
      Student student = new Student(naam, nummer, fulltime, graduate, summary);
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/example/StudentListGUI.fxml"));
      loader.load();
      StudentListViewController controller =
              (StudentListViewController) loader.getController();
      controller.addStudent(student);
      
      //studentListView.getItems().add(student);
      model.addStudent(student);
      System.out.println("aantal studenten" + model.getStudents().size());
    } catch (IOException ex) {
      Logger.getLogger(StudentAddController.class.getName()).log(Level.SEVERE, null, ex);
    }
  
  }

  @FXML
  private void testMethode(ContextMenuEvent event) {
  }
  
  
}
