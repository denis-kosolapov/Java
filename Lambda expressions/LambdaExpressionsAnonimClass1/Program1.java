package LambdaExpressionsAnonimClass1;

public class Program1 {
    public static void main (String[] args) {
        Switcher1 switcher1 = new Switcher1();
        Lamp1 lamp = new Lamp1();

        /*подписка на событие
        * event subscribe
        * сообщить лампе что включили выключатель*/
        switcher1.consumer = lamp;

        switcher1.SwitchOn();
    }
}
