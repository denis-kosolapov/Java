package TestListeners;

public class TestNeuron {
    public static void main (String[] args) {
        Switcher switcher = new Switcher();
        Listener listener = new Listener();
        Speaker speaker = new Speaker();

        /*слушатель подписался на спикера*/
        switcher.speaker = listener;

        /*спикер подписался на слушателя*/
        switcher.listener = speaker;

        /*говорит спикер
        * слушает слушатель*/
        switcher.SwitchS();

        /*говорит слушатель
        * слушает спикер*/
        switcher.SwitchL();

        /*Существенный недостаток - все это творится одновременно*/
    }
}
