package Chris_records;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PatientRecordStage {

    double sizeX;
    double sizeY;



    public PatientRecordStage(double sizeX, double sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        //Stage Creation
        Stage stage = new Stage();
        stage.setTitle("Record");


        //Scene Record Design
        BorderPane record = new BorderPane();
        ToolBar toolBar = new ToolBar();
        Button homeButton = new Button("Home");
        Button newButton = new Button("New Record");
        Button editButton = new Button("Edit Existing Record");
        Label TitleLabel = new Label("Records");
        Text text = new Text("This Area is for the Patient Records, on the left you can choose to create a user" +
                "\n"+ "or choose to edit some existing records");

        //Toolbar
        toolBar.setMinWidth(135);
        toolBar.setMinHeight(130);
        toolBar.getItems().add(homeButton);
        toolBar.getItems().add(new Separator());
        toolBar.getItems().add(newButton);
        toolBar.getItems().add(new Separator());
        toolBar.getItems().add(editButton);
        toolBar.setOrientation(Orientation.VERTICAL);
        toolBar.setStyle("-fx-padding: 4px;");

        //Button
        homeButton.setMinWidth(125);
        homeButton.setMinHeight(50);
        newButton.setMinWidth(125);
        newButton.setMinHeight(50);
        editButton.setMinWidth(125);
        editButton.setMinHeight(50);


        //TilePane title
        TitleLabel.setFont(new Font("Arial", 20));

        //Setting up Scene
        record.setLeft(toolBar);
        record.setTop(TitleLabel);
        record.setAlignment(TitleLabel, Pos.TOP_CENTER);
        record.setCenter(text);


        //Records Creation
        Scene records = new Scene(record, sizeX, sizeY);
        stage.setScene(records);
        stage.show();

        //newUser Creation
        BorderPane newUserScene = new BorderPane();
        newUserScene.setCenter(new Label("Hello!"));


        //New User Scene
        Scene newUser = new Scene(newUserScene, sizeX, sizeY);

        //Switch scene to new user screen and rename Stage title
        EventHandler<ActionEvent> newUserScreen = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                stage.setScene(newUser);
                stage.setTitle("New User Creation");
            }
        };

        newButton.setOnAction(newUserScreen);

    }
}
