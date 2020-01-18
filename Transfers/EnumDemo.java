package Apples;

//перечисление сортов яблок

enum Apple {
    Jonathan, GoldenDel , RedDel , Winesap , Cortland
}

public class EnumDemo {
    public static void main (String args[]) {
        Apple ap;

        ap = Apple.RedDel;

        //вывести значение переечисляемого типа
        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        //соавнить два значения перечисляемого типа
        if(ap == Apple.GoldenDel)
            System.out.println("Переменная ap содержит GoldenDel. \n");
        //применить пересичление для управления оператором switch

        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный");
                break;
            case GoldenDel:
                System.out.println("Copт Golden Delicious желтый.");
                break;
            case RedDel:
                System.out.println("Copт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Copт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Copт Cortland красный.");
                break;
        }
    }
}
