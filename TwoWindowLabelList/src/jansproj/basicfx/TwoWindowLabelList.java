package jansproj.basicfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TwoWindowLabelList extends Application 
{

	public void init() throws Exception
	{
		System.out.println("init called");
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
        stage.setTitle("JavaFX ThreeApp");

        FlowPane root = new FlowPane(Orientation.VERTICAL);

        Label label1 = new Label("First Label");
        Label label2 = new Label("Second Label");
        Label label3 = new Label("Third Label");
        Label label4 = new Label("Fourth Label");
        Label label5 = new Label("Fifth Label");
        Label label6 = new Label("Sixth Label");
        Button button1 = new Button("Remove");
        button1.setOnAction(new EventHandler<ActionEvent>()
        	{
        		public void handle(ActionEvent event)
       			{
       				System.out.println("button pressed");
       				System.out.println(event.getTarget().toString());
       				root.getChildren().remove(label1);
       			}
       		});

        
        root.getChildren().add(button1);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(label3);
        root.getChildren().addAll(label4,label5,label6);
        Scene scene = new Scene(root, 400, 300);

        stage.setScene(scene);
        stage.show();

        FlowPane secondRoot = new FlowPane(Orientation.VERTICAL);
        Label secondLabel = new Label("Second Window Label");
        secondRoot.getChildren().add(secondLabel);
        Scene secondScene = new Scene(secondRoot, 200, 400);
        Stage secondStage = new Stage();
        secondStage.setScene(secondScene);
        secondStage.setX(10);
        secondStage.setY(10);
        secondStage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}

}
