package Chris_records;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PatientRecordStage {

    double sizeX;
    double sizeY;
    double positionX;
    double positionY;


    public PatientRecordStage(double sizeX, double sizeY, double positionX, double positionY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.positionX = positionX;
        this.positionY = positionY;


        //Stage Creation
        Stage stage = new Stage();
        stage.setTitle("Sample Patient Record");


        //Scene Design
        BorderPane content = new BorderPane();
        ToolBar toolBar = new ToolBar();
        TilePane tilePane = new TilePane();
        Button homeButton = new Button("Home");
        Button TestButton = new Button("Test");
        Label TitleLabel = new Label("Title");

        //Toolbar
        toolBar.setMinWidth(100);
        toolBar.setMinHeight(100);
        toolBar.getItems().add(homeButton);
        toolBar.getItems().add(new Separator());
        toolBar.getItems().add(TestButton);
        toolBar.setOrientation(Orientation.VERTICAL);

        //Button
        homeButton.setMinWidth(90);
        homeButton.setMinHeight(50);
        TestButton.setMinWidth(90);
        TestButton.setMinHeight(50);



        //TilePane title
        tilePane.setOrientation(Orientation.HORIZONTAL);
        tilePane.setAlignment(Pos.TOP_CENTER);
        tilePane.getChildren().add(TitleLabel);
        TitleLabel.setFont(new Font("Arial", 30));



        content.setLeft(toolBar);
        toolBar.toFront();
        content.setTop(tilePane);







        //Scene
        Scene scene = new Scene(content, sizeX, sizeY);
        stage.setScene(scene);
        stage.show();

    }
}
