package views;

/**
 * Created by benjamind on 5/6/17.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFormaterGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader startSceneLoader = new FXMLLoader();
        String startScene = "/home/benjamind/development/TestFormater/lib/layouts/startScene.fxml";
        FileInputStream fxmlStream = new FileInputStream(startScene);
        VBox root = (VBox)startSceneLoader.load(fxmlStream);

        FXMLLoader wrapperLoader = new FXMLLoader();
        String applicationWrapper = "/home/benjamind/development/TestFormater/lib/layouts/applicationWrapper.fxml";
        FileInputStream applicationWrapStream = new FileInputStream(applicationWrapper);
        TabPane tabPane = (TabPane)wrapperLoader.load(applicationWrapStream);

        Tab mainTab = new Tab();
        mainTab.setText("Home");
        mainTab.setContent(root);
        mainTab.setClosable(false);


        tabPane.getTabs().add(mainTab);


        Scene scene = new Scene(tabPane);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.sizeToScene();
    }







}
