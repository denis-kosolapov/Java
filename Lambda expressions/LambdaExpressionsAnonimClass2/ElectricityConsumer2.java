package LambdaExpressionsAnonimClass2;

//public interface ElectricityConsumer2 {
//    void electricityOn();
//}

/*Для того чтобы лям.выражение было без круглых скобок
* можно добавить параметр*/
@FunctionalInterface
public interface ElectricityConsumer2 {
    void electricityOn(Object sender);
}
