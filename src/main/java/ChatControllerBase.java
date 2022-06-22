import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatControllerBase {

    @FXML
    protected Button btnSend;

    @FXML
    protected ListView<?> lvFriendView;

    @FXML
    protected TextArea msgField;

    @FXML
    protected TextField sendInput;


    @FXML
    protected void onBtnSend(ActionEvent event) {

    }

}
