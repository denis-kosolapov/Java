package TestListeners;

public class Switcher {
    public QuestionListener speaker;

    public QuestionSpeaker listener;

    public void SwitchS() {
        if (speaker != null) {
            /*спикер это пользователь*/
            System.out.println("Говорит спикер");
            speaker.listenToYou();
        }
    }

    public void SwitchL () {
        if (listener != null){
            /*слушатель это интеллект*/
            System.out.println("Говорит слушатель");
            listener.questionOfTheListener();
        }
    }
}
