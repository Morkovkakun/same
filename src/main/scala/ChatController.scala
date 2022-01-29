import javafx.event.ActionEvent

class ChatController extends ChatControllerBase {

  override def onBtnSend(event: ActionEvent): Unit = {

    val textMessage = username + " " + tfUserMessage.getText + "\n"

    tfUserMessage.clear()

    val allMas = taAllText.getText

    val oldNew = allMas + textMessage



    taAllText.setText(oldNew)


  }

}
