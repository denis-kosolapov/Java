package ConstructorEnum;

import com.sun.applet2.Applet2;

//Исnользовать конструктор , nеременную экземпляра и метод в перечислении
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price; // цена яблока каждого сорта
    private int cent;

    //Конструктор
    Apple(int р) {
        price = р; // переменная экземпляра оформляется вот так
    }

    int getPrice() {
        return price;
    }
}

public class EnumConstructor {
    public static void main (String args[]) {
        Apple ap;

        //вывести цену на яблоко сорта Winesap
        System.out.println("Яблoкo сорта Wines ap стоит " + Apple.Winesap.getPrice() + " центов.\n " );

        //вывести цены на все сорта яблок
        System.out.println ("Цeны на все сорта яблок:");
        for (Apple a : Apple.values())
            System.out.println(a + "стоит " + a.getPrice() + " центов.");
    }
}
