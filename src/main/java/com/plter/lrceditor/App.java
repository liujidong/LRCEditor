package com.plter.lrceditor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Hello world!
 *
 */
public class App extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/plter/lrceditor/views/LRCEditor.fxml"));
        primaryStage.setTitle("LRC歌词编辑器");
        primaryStage.setScene(new Scene(root, 600, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
