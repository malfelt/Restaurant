package view;

import model.Drink;
import model.MainDish;
import model.Product;
import model.Salad;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import service.Console;
import model.Repository;

import java.util.ArrayList;
import java.util.List;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("restaurant.fxml"));
        primaryStage.setTitle("Стол заказов");
        primaryStage.setScene(new Scene(root, 600, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
