package StringTest;

import java.util.*;

/*Не получается создать программу . Задание : создать текстовую переменную str1
и разместить в ней несколько слов через пробелы , причём первая и последняя буква
некоторых слов должны совпадать , например str1=“текст слово тест».Найти слова ,
у которых первая и последняя буква совпадают. Посчитать кол-во найденных слов и
результат сохранить в переменную к.*/

public class Test {

    /*для начала разрежим нашу переменую на масив слов
    метод порезки строки на слова по маркеру */

    /*создание метода как двумерного массива для добавления и
    * извлечения данных из/в коллекцию*/

    public static String[] recut(String s, String marker) { //получить слова
        int[] i = allIndexOf(s, marker); //заполнить массив словами
        String[] ss = null;
        if (i != null) { // если не пустое значение
            ss = new String[i.length + 1]; // проверить длину строки + 1
            ss[0] = s.substring(0, i[0]); //взять координаты начала слова
            for (int a = 1; a < i.length; a++) {
                // перебрать слова, сравнив начальную и конечную координату
                ss[a] = s.substring(i[a-1] + marker.length(), i[a]);
            }
            ss[ss.length - 1] = s.substring(i[i.length - 1] + marker.length()); // вывести слово без пробела
        }
        else {
            ss = new String[]{s};//записать слово в массив
        }
        return ss; //вернуть массив лов
    }

    /*метод обнаружения количества маркеров*/

    public static int[] allIndexOf(String s, String marker) {
        int[] ii = null;
        ArrayList<String> a = new ArrayList<String>();

        for (int i = 0; i < s.length() - (marker.length() - 1); i++){
            if (marker.equals(s.substring(i, i + marker.length()))) {
                a.add("" + i); //записать слово в коллекцию
            }
        }

        if (a.size() > 0) {
            ii = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                ii[i] = Integer.parseInt(a.get(i));
            }
        }

        return ii; //заполнить коллекцию словами
    }

    public static void main (String[] args) {
        String str1 = "vasya alkash konchenuy yOy buhae mnogo OOOOOO";
        String[] s = recut(str1, " ");

        int k = 0;
        for(int i = 0; i < s.length; i++){
            char[] c = s[i].toCharArray();
            if((int)c[0] == (int) c[c.length - 1]){
                k++;
            }
        }

        System.out.println("Вобшем я нащитал " + k + " таких слов, а ты ежели нам, електронным мозгам не веришь, щитай сама;(");

    }
}
