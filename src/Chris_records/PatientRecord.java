package Chris_records;

//Written by Christopher Plesa - Plecy 002 - plecy002@mymail.unisa.edu.au

import javafx.application.Application;
import javafx.stage.Stage;

public class PatientRecord extends Application {


    public static void main(String[] args) {
        System.out.println("Author: Christopher Plesa");
        launch(args);
    }


    @Override
    public void start(Stage arg0) {
        new PatientRecordStage(600, 600);
    }






}
