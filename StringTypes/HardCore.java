package StringOperations;

/*Продолжаем работать со строками*/

import java.util.Objects;

public class HardCore {

    public static void main (String[] args) {
        char chars[] = {'a', 'b', 'c'};
        char ch = "привет мир!".charAt(2);
        System.out.println(ch);
        String s = new String(chars, 1,2);
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(chars, 0, 2));

        String d = "Вывести на экран одно слово";
        int start = 0;
        int end = 7;
        char buf[] = new char[end - start];
        d.getChars(start, end, buf, 0);
        System.out.println(buf);

        char[] mass;
        mass = d.toCharArray();
        for (char x: mass) {
            if (x == ' ') {
                x = '_';
            }

            System.out.print(x);
//            System.out.print(x + " = ");
//            int b = (int) x;
//            System.out.println(b + " ");
        }

        System.out.println();

        String b = "Вывести на экран одно слово";
        String c = "ВЫВЕСТИ НА ЭКРАН ОДНО СЛОВО";

        // вот такое ветвление можно заменить
        if (b.equals(c) || b.equalsIgnoreCase(c)) {
            System.out.println("Эти строки одинаковые");
        } else {
            System.out.println("Эти строки разные");
        }
        // на унарную операцию
        //так еомпилятор ругается
        System.out.println(b.equals(c) ? "Эти строки одинаковые" : "Эти строки разные");
        String str;
        //даже можно сравнить два объекта, а вот так нет
        str = (Objects.equals(b, c) ? "строки одинаковые" : "строки разные");
        System.out.println(str);

        String str1 = "Это кусок текста";
        String str2 = "кусок текста";
        String str3 = "КУСОК ТЕКСТА";

        //наверное может пригодиться не только для строкового типа
        //проверяет, содержится ли подстрока в строке и выводит true/false
        System.out.println(str1.regionMatches(4, str2, 0, 12));
        //то же самое, без учета регистра
        System.out.println(str1.regionMatches(true, 4, str3, 0, 12));
        //начинается ли объект с данной подстроки?
        System.out.println(str1.startsWith("Это"));
        //заканчивается ли объект данной подстрокой?
        System.out.println(str1.endsWith("текста"));

        //метод equals() не одно и то же что и ==

        /*рпеобразование данных методом valueOf*/
        char ar[] = {'1','2','3','4'};
        System.out.println(String.valueOf(ar));

        /*задать верхний или нижний регистр toUpperCase() и toLowerCase()*/
        System.out.println(str1.toUpperCase() + " " + str1.toLowerCase());

        /*метод join() для вставки пробелов знаков и прочего*/
        String stroke = String.join(": ","Мир", "в", "котором", "мы", "живем");
        System.out.println(stroke);

        /*чтобы узнать длину строки и не только нужен метод length()
        * чтобы узнать размер выделяемой памяти чего либо пригодится capacity()*/
        System.out.println(str1.length() + " длина");
        StringBuffer stringBuffer = new StringBuffer("Это текст");
        System.out.println(stringBuffer.capacity() + " размер строки в байтах");

        /*большинство методов применяется не толбко в строках*/
    }
}
