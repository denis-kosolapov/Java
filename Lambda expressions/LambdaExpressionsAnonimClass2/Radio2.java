package LambdaExpressionsAnonimClass2;

public class Radio2 implements ElectricityConsumer2{
    public void playMusic() {
        System.out.println("Радио заиграло");
    }

    @Override
    /*Опять же, поскольку интерфейс параметризирован, то вставляем теперь параметр
     * в круглые скобки*/
    public void electricityOn(Object sender) {
        playMusic();
    }
}
