package IncapsTry;

public class NestTry {
    public static void main (String args[]) {
        try {
            int a = args.length;
            /*Если не указаны операторы командной строки в следующем операторе
            будет сгенерировано исключение в связи с делением на нуль*/

            int b = 42 / a;

            System.out.println("a = " + a);

            try {//Вложенный блок try
                /*Если указан один аргуменет командно строки, то
                * исключение в связи с делением на нуль будет сгенерировано
                * в следующем коде*/

                if (a==a) a = a/(a-a);
                /*Если указаны два аргумента командной строки, то генерируется
                * исключение в связи с выходом за пределы массива*/

                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль " + e);
        }
    }
}
