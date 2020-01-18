package TestListeners;

public class Speaker implements QuestionSpeaker {
    public void Dialog() {
        System.out.println("Слушает спикер");
    }

    @Override
    public void questionOfTheListener () {
        Dialog();
    }
}
