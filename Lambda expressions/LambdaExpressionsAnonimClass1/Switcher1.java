package LambdaExpressionsAnonimClass1;

public class Switcher1 {

    public ElectricityConsumer1 consumer;

    public void SwitchOn () {
        System.out.println("Выключатель включён, но лампа еще не знает об этом");
        if (consumer != null)
            consumer.electricityOn();
    }
}
