import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Font;
import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import javafx.scene.input.MouseEvent;

/**
 * Creates a circle and rectangle
 * If mouse enters the circle both shapes turn blue
 * If mouse enters rect both shapes turn red
 * Otherwise both shapes are black
 * If mouse is clicked create a green dot
 * 
 * @author (Nicholas Harasty) 
 * @version (4/3/17)
 */
public class EventPalooza extends Application
{
   
    private Circle circ1;
    private Rectangle rect1;
    private Circle circle;
    private Group root;
    
    /**
     * starts the scene
     * @param primaryStage creates stage
     */
    
    public void start(Stage primaryStage)
    {
        
        Rectangle background = new Rectangle(0, 0, 600, 400);
        background.setFill(Color.LIGHTBLUE);
        background.setOnMouseEntered(this::leaveShape);
        
        
        rect1 = new Rectangle(400, 70, 90, 250);
        rect1.setFill(Color.BLACK);
        rect1.setOnMouseEntered(this::overRect);

        circ1 = new Circle(225, 200, 95);
        circ1.setFill(Color.BLACK);
        circ1.setOnMouseEntered(this::overCircle);
   
        root = new Group(background, rect1, circ1);
        Scene scene = new Scene(root, 600, 400);
        
        scene.setOnMousePressed(this::handleMousePress);
        
        primaryStage.setTitle("Lab9");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(e -> System.exit(0));
    }
    
    /**
     * if mouse enters circle turn both shapes blue
     * 
     * @param event is mouse event
     */
    public void overCircle(MouseEvent event)
    {
        circ1.setFill(Color.BLUE);
        rect1.setFill(Color.BLUE);
    }
    
    /**
     * if mouse leaves any shape turn both shapes black
     * 
     * @param event is mouse event
     */
    public void leaveShape(MouseEvent event)
    {
        circ1.setFill(Color.BLACK);
        rect1.setFill(Color.BLACK);
    }
    
    /**
     * if mouse enters rect turn both shapes red
     * 
     * @param event is mouse event
     */
    public void overRect(MouseEvent event)
    {
        circ1.setFill(Color.RED);
        rect1.setFill(Color.RED);
    }
    
    /**
     * if the mouse is clicked create a green dot
     * 
     * @param event is mouse event
     */
    public void handleMousePress(MouseEvent event)
    {
        circle = new Circle(event.getX(), event.getY(), 10);

        circle.setStrokeWidth(3);
        circle.setFill(Color.GREEN);

        root.getChildren().add(circle);
    }
    
    /**
     * launches program
     * @param args not used
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}
