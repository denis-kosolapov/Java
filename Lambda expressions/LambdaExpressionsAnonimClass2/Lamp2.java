package LambdaExpressionsAnonimClass2;

public class Lamp2 implements ElectricityConsumer2 {
    public void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    /*Опять же, поскольку интерфейс параметризирован, то вставляем теперь параметр
    * в круглые скобки*/
    public void electricityOn (Object sender) {
        lightOn();
    }
}
