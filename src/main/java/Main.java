import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginForm.fxml"));
        VBox root = (VBox) loader.load();

        LoginController lc = loader.getController();

        Scene scene = new Scene(root);
        Stage window = new Stage();
        window.setScene(scene);
        window.showAndWait();

        String login = lc.login();

        loader = new FXMLLoader(getClass().getResource("chatForm.fxml"));
        root = (VBox) loader.load();

        ChatController cc = loader.getController();
        cc.setLogin(login);

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
//