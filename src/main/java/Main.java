import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/login.fxml"))));
        //    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/fogotPassword.fxml"))));
        //    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/registration.fxml"))));
        //    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/clothifyHome.fxml"))));
        //    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/employeeRegistration.fxml"))));

              stage.show();
              stage.setResizable(false);
    }
}