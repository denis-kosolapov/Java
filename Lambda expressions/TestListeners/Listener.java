package TestListeners;

public class Listener implements QuestionListener {
    public void listenYou() {
        System.out.println("Слушает слушатель");
    }

    @Override
    public void listenToYou() {
        listenYou();
    }
}
