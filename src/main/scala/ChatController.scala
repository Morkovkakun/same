import javafx.event.ActionEvent

class ChatController extends ChatControllerBase {

  override def onBtnSend(event: ActionEvent): Unit = {

    val textMessage = username + " " + sendInput.getText + "\n"

    sendInput.clear()

    val Message =  msgField.getText

    val loginPlusText = Message + textMessage

    msgField.setText(loginPlusText)




  }

}
