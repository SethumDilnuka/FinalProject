package lk.ijse.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
       Parent rootNode = FXMLLoader.load(getClass().getResource("/view/loginPageForm.fxml"));
        //Parent rootNode = FXMLLoader.load(getClass().getResource("/view/dashboardForm.fxml"));
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Login Form");
        stage.setResizable(false);
        stage.show();
    }
}
