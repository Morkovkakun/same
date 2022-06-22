import javafx.event.ActionEvent
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class LoginController extends LoginControllerBase {

  override def connectPress(event: ActionEvent): Unit = {
    login = textFieldLogin.getText

    val stage = connectButton.getScene.getWindow.asInstanceOf[Stage]
    stage.close()

  }


}
////import javafx.fxml.FXMLLoader

//import javafx.scene.Scene
//import javafx.stage.Stage

//val fxmlLoader = new FXMLLoader
//fxmlLoader.setLocation(getClass.getResource("NewWindow.fxml"))
/*
 * if "fx:controller" is not set in fxml
 * fxmlLoader.setController(NewWindowController);
 */
//val scene = new Scene(fxmlLoader.load, 600, 400)
//val stage = new Stage
//stage.setTitle("New Window")
//stage.setScene(scene)
