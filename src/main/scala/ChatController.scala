import javafx.event.ActionEvent

class ChatController extends ChatControllerBase {

  override def onBtnSend(event: ActionEvent): Unit = {

    val textMessage = sendInput.getText + "\n"

    sendInput.clear()

    val takeOutput = msgField.getText

    val outputText = login + ":   " + takeOutput + textMessage

    msgField.setText(outputText)


  }

}
