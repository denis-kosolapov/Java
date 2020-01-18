package LambdaExpressionsAnonimClass2;

public class Program2 {

    public static void fire(Object sender) {
        System.out.println("message");
    }

    private void message(Object sender) {
        System.out.println("message_____2");
    }

    public static void main (String[] args) {
        Switcher2 switcher2 = new Switcher2();
        Lamp2 lamp2 = new Lamp2();
        Radio2 radio2 = new Radio2();

        /*подписка на событие
        * event subscribe*/
        switcher2.addElectricityListener(lamp2);
        switcher2.addElectricityListener(radio2);

//        /*Первый вариант добавления нового потребителя
//        * полностью прописать встроенный класс*/
//        class Fire implements ElectricityConsumer2 {
//            @Override
//            public void electricityOn() {
//                System.out.println("Пожар");
//            }
//        }
//        switcher2.addElectricityListener(new Fire());

        /*Второй вариант
        * Использование анонимного класса*/
        switcher2.addElectricityListener(
                new ElectricityConsumer2() {
                    @Override
        /*В анонимный класс также нужно добавить параметр и получится вот так*/
        public void electricityOn(Object sender) { // нужное раскомментировать
                    //public void electricityOn() {//без параметра в интерфейсе
                        System.out.println("Пожар");
                    }
                }
        );

        /*Теперь лямбда-выражение*/

        //первый вариант с параметризированным интерфейсом
//        switcher2.addElectricityListener( (Object sender) -> System.out.println("Пожар") );

        //второй вариант с функциональным интерфейсом, метод которого содержит параметр
        switcher2.addElectricityListener( sender -> System.out.println("Fair") );

        /*Если в реализуемом функциональном интерфейсе нет параметров или их больше одного,
        * то нужно ставить фигурные скобки. Если параметр только один, то круглые скобки
        * можно не ставить. Если в теле лямювыражения больше одного параметра, то после стрелки нужно
        * выражения поставить в фигурные скобки*/


        /*Если параметры метода в точности совпадают с параметрами лямбда-выражения
        * можно записать вот так, при условии что метод static*/
        switcher2.addElectricityListener(Program2::fire);

        /*при условии что метод не статический*/
        switcher2.addElectricityListener(sender -> new Program2().message(sender));

        switcher2.SwitchOn();
    }
}
