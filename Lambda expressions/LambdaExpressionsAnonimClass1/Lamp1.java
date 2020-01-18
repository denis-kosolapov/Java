package LambdaExpressionsAnonimClass1;

public class Lamp1 implements ElectricityConsumer1 {
    public void lightOn() {
        System.out.println("лампе сообщили, что выключатель включился");
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn () {
        lightOn();
    }
}
