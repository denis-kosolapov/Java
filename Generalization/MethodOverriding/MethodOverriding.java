package MethodOverriding;

import java.util.concurrent.TimeUnit;

// Переопределение обобщенного метода в обобщенном классе
class Gen<T> {
    T ob; // объявить объект типа Т

    // передать конструктору ссылку на обхект Т
    Gen(T o)   {
        ob = o;
    }

    // передать конструктору ссылку на объект типа Т
    T getob() {
        System.out.print("Метод getOb() из класса Gen: ");
        return ob;
    }
}


// Подкласс, производный от класса Gen и
// переобпределенный метод getob()
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }

    // переобпределить метод getob()
    T getob() {
        System.out.print("Метод getOb() из класса Gen2: ");
        return ob;
    }
}

// продемонстрировать переопределение обобщенных методов
class OverrideDemo {

    /**
     * @param method метод для замера
     * @param timeUnit единица измерения
     * @return время работы
     */
    private static long timer(Runnable method, TimeUnit timeUnit) {
        long time = System.nanoTime();
        method.run();
        time = System.nanoTime() - time;
        return TimeUnit.NANOSECONDS.convert(time, timeUnit);
    }

    public static void main(String[] args) {

        // создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<>(88);

        // создать объект типа Gen2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // создать объект типа Gen2 для символьных строк
        Gen2<String> strOb2 = new Gen2<String>("Текст сообщений");
        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
