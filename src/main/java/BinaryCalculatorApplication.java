import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BinaryCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/binarycalculator.fxml"));
        stage.setTitle("Calculator");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
