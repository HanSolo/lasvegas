 package eu.hansolo.fx;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * User: hansolo
 * Date: 17.10.22
 * Time: 10:34
 */
public class LasVegas extends Application {
    
    @Override public void init() {
    
    }
    
    private void initOnFxApplicationThread(final Stage stage) {
    
        registerListeners();
    }
    
    private void registerListeners() {
    
    }
    
    @Override public void start(final Stage stage) {
        StackPane pane = new StackPane();
        pane.setPadding(new Insets(10));
        
        Scene scene = new Scene(pane);
        
        stage.setTitle("Title");
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
    }
    
    @Override public void stop() {
        Platform.exit();
        System.exit(0);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
