/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import example.application.*;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author fgailly
 */
public class StudentListViewController  {
  
  private University model = new University();
  
  @FXML
  private ListView<Student> studentListView;
  private ObservableList<Student> students;

  @FXML
  private Button deleteStudent;


  public void initialize() {

    students = FXCollections.observableArrayList(model.getStudents());
    studentListView.setItems(students);
    
  }  


  void addStudent(Student student) {
    students.add(student);
  }


  public void deleteStudentBtn_click(MouseEvent mouseEvent) {
  }

  @FXML
  public void deleteStudentBtn_click(Event event) {
    Student student = studentListView.getSelectionModel().getSelectedItem();
    model.deleteStudent(student);
    students.remove(student);


  }
}
