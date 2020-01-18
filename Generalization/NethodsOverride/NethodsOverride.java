package NethodsOverride;

// Переопределение методов для работы с разными типами данных
// в обобщенном классе

public class Gen<T> {
    T ob; // объявить объект типа Т

    // передать конструктору ссылку на объект типа Т
    public Gen(T o) {
        ob = o;
    }

    // возвратить объект ob
    T getob() {
        System.out.print("Метод getob() из класса Gen: ");
        return ob;
    }
}

// подкласс, производный от класса Gen и
// переопределяющий метод getob()
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    // переопределить метод getob()
    T getob() {
        System.out.print("Метод getob() из класса Gen2: ");
        return ob;
    }
}

// продемонстрировать переопределение обобщенных методов
class OverrideDemo {
    public static void main(String[] args) {

        // Создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Создать объект типа Gen2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // создать объект типа Gen2 для символьных строк
        Gen2<String> strOb2 = new Gen2<String>("Текст сообщений");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}

// вывод программы
// Метод getob() из класса Gen: 88
// Метод getob() из класса Gen2: 99
// Метод getob() из класса Gen2: Текст сообщений
