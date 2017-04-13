import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import java.util.Random;
/**
 * Creates random squares with different colored borders
 * and fill in the largest one with red
 * 
 * @author (Nicholas Harasty) 
 * @version (02/27/17)
 */
public class RandomSquares extends Application
{
    
    
    /**
     * runs program
     * 
     * @param args does nothing
     */
    public static void main(String[] args)
    {

        launch(args);

    }
    
    
    /**
     * generates a random color
     * 
     * @return random color
     */
    public static Color getRandomColor() 
    {
        Random num = new Random();
        
        int red = num.nextInt(256);
        int green = num.nextInt(256);
        int blue = num.nextInt(256);
        
        
        return Color.rgb(red, green, blue);
    }

    /**
     * creates random rectangles within frame, fills biggest one with red
     * 
     * @param primaryStage is stage
     */
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        
        Rectangle largeRect = new Rectangle(0, 0, 0, 0);

        for (int i = 0; i <= 30; i++)
        {
            double axisX = Math.random() * 450;
            double axisY = Math.random() * 250;

            Random num = new Random();
            int squareSize = num.nextInt((141) + 10);

            double squareX = squareSize;
            double squareY = squareX;
            
            

            Rectangle rect = new Rectangle(axisX, axisY, squareX, squareY);
            
            
            rect.setStrokeWidth(3);
            rect.setStroke(getRandomColor());
            rect.setFill(null);
            rect.getWidth();
            
            if (rect.getWidth() >= largeRect.getWidth())
            {
                largeRect = rect;
                
            }
            
            
            

            root.getChildren().addAll(rect);
        }
        
        largeRect.setFill(Color.RED);
        //root.getChildren().add(test);
        
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("RandomSquares");
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setOnCloseRequest(e -> System.exit(0));
    }

}

