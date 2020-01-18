package LambdaExpressionsAnonimClass2;

import java.util.ArrayList;
import java.util.List;

public class Switcher2 {

    /*Создаем коллекцию подписчиков на событие*/
    private List <ElectricityConsumer2> listeners = new ArrayList<>();

    /*Добавляем массив подписчиков*/
    public void addElectricityListener(ElectricityConsumer2 listener) {
        listeners.add(listener);
    }

    /*удаляем массив подписчиков*/
    public void removeElectricityListener(ElectricityConsumer2 listener) {
        listeners.remove(listener);
    }

    public void SwitchOn () {
        System.out.println("Выключатель включён");
        for (ElectricityConsumer2 c : listeners)
            /*Поскольку интерфейс теперь содержит параметр, то нужно добавить ссылку this*/
            c.electricityOn(this);
    }
}
