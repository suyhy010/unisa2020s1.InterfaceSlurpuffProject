import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BookApplication extends Application {
	
	
	
	public static void main(String[] args) {
	    launch(args);
	}
	  
	@Override
	public void start(Stage stage) {
		
		Scene scene = new Scene(new Group(), 450, 250);

	    TextField notification = new TextField ();
	    notification.setText("Patient Information");
	    
	    notification.clear();
	    
	    GridPane grid = new GridPane();
	    grid.setVgap(10);
	    grid.setHgap(10);
	    grid.setPadding(new Insets(25, 25, 25, 25));
	    
	    Text scenetitle = new Text("Welcome");
	    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	    grid.add(scenetitle, 0, 0, 2, 1);
	     
	    Label LastName = new Label("Last Name:");
	    grid.add(LastName, 0, 1);
	     
	    TextField LastName1 = new TextField();
	    grid.add(LastName1, 1, 1);
	     
	    Label FirstName = new Label("First Name:");
	    grid.add(FirstName, 0, 2);
	     
	    TextField FirstName1 = new  TextField();
	    grid.add(FirstName1, 1, 2);
	    
	    Label Phone = new Label("Phone Number:");
	    grid.add(Phone, 0, 3);
	     
	    TextField Phone1 = new  TextField();
	    grid.add(Phone1, 1, 3);
	    
	    Label Email = new Label("Email Address:");
	    grid.add(Email, 0, 4);
	     
	    TextField Email1 = new  TextField();
	    grid.add(Email1, 1, 4);
	    
	    Label Address = new Label("Address:");
	    grid.add(Address, 0, 5);
	     
	    TextArea Address1 = new  TextArea();
	    grid.add(Address1, 1, 5);
	    
	    Label Allergy = new Label("Allergy medicines:");
	    grid.add(Allergy, 0, 6);
	     
	    TextField Allergy1 = new  TextField();
	    grid.add(Allergy1, 1, 6);
	    
	    Label checkInDatePicker = new Label("Option date:");
	    grid.add(checkInDatePicker, 0, 9);
	    
	    DatePicker checkInDatePicker1 = new DatePicker();
	    grid.add(checkInDatePicker1, 1, 9);
	    
	    Label Doctor = new Label("Choose a doctor:");
	    grid.add(Doctor, 0, 7);
	     
	    Rectangle rect = new Rectangle(150, 30);
		final Label label = new Label("Doctor");
	    
	    label.setStyle("-fx-font: 25 arial;");
	    label.setLayoutX(40);

	    rect.setStroke(Color.BLUE);
	    rect.setStrokeWidth(3);
	    rect.setFill(Color.WHITE);

	    final String[] greetings = new String[] {"Dr.Song", "Dr.Zhao", "Dr.Adaim", "Dr.Coco"};
	    final ChoiceBox<String> cb = new ChoiceBox<String>(
	        FXCollections.observableArrayList("Dr.Song", "Dr.Zhao", "Dr.Adaim", "Dr.Coco"));

	    cb.getSelectionModel().selectedIndexProperty()
	        .addListener(new ChangeListener<Number>() {
	          public void changed(ObservableValue ov, Number value, Number new_value) {
	            label.setText(greetings[new_value.intValue()]);
	          }
	        });
	    
	    cb.setTooltip(new Tooltip("Select the Doctor"));
	    cb.setValue("English");
	    grid.add(cb, 1, 7);
	    
	    Label Radiographer = new Label("Choose a radiographer:");
	    grid.add(Radiographer, 0, 8);
	     
	    Rectangle rect1 = new Rectangle(150, 30);
		final Label label1 = new Label("Radiographer");
	    
	    label1.setStyle("-fx-font: 25 arial;");
	    label1.setLayoutX(40);

	    rect1.setStroke(Color.BLUE);
	    rect1.setStrokeWidth(3);
	    rect1.setFill(Color.WHITE);

	    final String[] greetings1 = new String[] {"Cock", "Maye", "Feta", "Jojo"};
	    final ChoiceBox<String> cb1 = new ChoiceBox<String>(
	        FXCollections.observableArrayList("Cock", "Maye", "Feta", "Jojo"));

	    cb.getSelectionModel().selectedIndexProperty()
	        .addListener(new ChangeListener<Number>() {
	          public void changed(ObservableValue ov, Number value, Number new_value) {
	            label.setText(greetings1[new_value.intValue()]);
	          }
	        });
	    
	    cb.setTooltip(new Tooltip("Select the Radiographer"));
	    cb.setValue("English");
	    grid.add(cb1, 1, 8);
	    
	    Button button1 = new Button("Application");

	    button1.addEventHandler(MouseEvent.MOUSE_ENTERED,
	        new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            System.out.println("mouse entered");
	          }
	        });

	    button1.addEventHandler(MouseEvent.MOUSE_EXITED,
	        new EventHandler<MouseEvent>() {
	          @Override
	          public void handle(MouseEvent e) {
	            System.out.println("mouse out");
	          }
	        });
	    
	    button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				stage.close();
			}
		});
	    
	    HBox hbBtn = new HBox(10);
	    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	    hbBtn.getChildren().add(button1);
	    grid.add(hbBtn, 1, 10);
	    
	    Group root = (Group) scene.getRoot();
	    root.getChildren().add(grid);
	    stage.setScene(scene);
	    stage.show();
	}

}
