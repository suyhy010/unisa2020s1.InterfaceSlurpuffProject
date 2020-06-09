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

        //Initial Stage Creation
        Stage stage = new Stage();
        stage.setTitle("Records");


        //Scene Design Initializers
        BorderPane record = new BorderPane();
        ToolBar toolBar = new ToolBar();
        Button homeButton = new Button("Home");
        Button newButton = new Button("New Record");
        Button editButton = new Button("Edit Existing Record");
        Label TitleLabel = new Label("Records");
        Text text = new Text("This Area is for the Patient Records, on the left you can choose to create a user" +
                "\n"+ "or choose to edit some existing records");

        //Buttons on Toolbar
        toolBar.setMinWidth(135);
        toolBar.setMinHeight(130);
        toolBar.getItems().add(homeButton);
        toolBar.getItems().add(new Separator());
        toolBar.getItems().add(newButton);
        toolBar.getItems().add(new Separator());
        toolBar.getItems().add(editButton);
        toolBar.setOrientation(Orientation.VERTICAL);
        toolBar.setStyle("-fx-padding: 4px;");

        //Button Width + Heights
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


        //newUser button and pane creation - Note this has to be done, since you cant share a button across
        //2 scenes
        BorderPane newUserScene = new BorderPane();
        Button newUserBackButton = new Button("Go Back to Records");
        Button newUserHomeButton = new Button("Home");
        Button newUserEditButton = new Button("Edit Existing Record");

        //Button Height/Width
        newUserBackButton.setMinWidth(125);
        newUserBackButton.setMinHeight(50);
        newUserHomeButton.setMinWidth(125);
        newUserHomeButton.setMinHeight(50);
        newUserEditButton.setMinWidth(125);
        newUserEditButton.setMinHeight(50);


        //New User Scene
        Scene newUser = new Scene(newUserScene, sizeX, sizeY);
        ToolBar newUserTB = new ToolBar();
        newUserTB.setMinWidth(135);
        newUserTB.setMinHeight(130);
        newUserTB.getItems().add(newUserHomeButton);
        newUserTB.getItems().add(new Separator());
        newUserTB.getItems().add(newUserBackButton);
        newUserTB.getItems().add(new Separator());
        newUserTB.getItems().add(newUserEditButton);
        newUserTB.setOrientation(Orientation.VERTICAL);
        newUserTB.setStyle("-fx-padding: 4px;");


        newUserScene.setCenter(new Label("Hello!"));
        newUserScene.setLeft(newUserTB);


        //Switch scene to new user screen and rename Stage title
        EventHandler<ActionEvent> newUserScreen = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                stage.setScene(newUser);
                stage.setTitle("New User Creation");
            }
        };

        newButton.setOnAction(newUserScreen);

        //Switch scene Back to Records and rename Stage title
        EventHandler<ActionEvent> backToRecordScreen = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                stage.setScene(records);
                stage.setTitle("Records");
            }
        };

        newUserBackButton.setOnAction(backToRecordScreen);

    }
}
