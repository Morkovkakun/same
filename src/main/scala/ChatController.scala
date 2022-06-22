import javafx.event.ActionEvent

class ChatController extends ChatControllerBase {

  var login: String = null

  def setLogin(login: String): Unit = this.login = login

  override def onBtnSend(event: ActionEvent): Unit = {

    val textMessage = sendInput.getText + "\n"

    sendInput.clear()

    val takeOutput = msgField.getText

    val outputText = login + ":   " + takeOutput + textMessage

    msgField.setText(outputText)


  }

}
