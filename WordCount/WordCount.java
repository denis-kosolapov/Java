package WordCount;

import java.util.ArrayList;

/*первая и последняя буква некоторых слов должны совпадать
* нужно подсчитать количество совпадений*/

public class WordCount {
    public static String[] recut (String s, String p) {
        int[] i = allIndexOf(s, p); // все значения брать из метода подсчета меркеров
        String[] ss = null; // сюда пишем слова, которые получаем после нарезки
        if (i != null) {
            ss = new String[i.length + 1]; // начинаем с 0, поэтому + 1
            ss[0] = s.substring(0, i[0]); // теперь назначаем точки начала отсчета
            for (int a = 1; a < i.length; a++) {
                ss[a] = s.substring(i[a - 1] + p.length(), i[a]); //процесс порезки
            }
            ss[ss.length - 1] = s.substring(i[i.length - 1] + p.length()); // пишем в массив, начиная с индекса 0
        } else {
            ss = new String[]{s}; //если попалось пустое значение - записать новую строку в массив
        }
        return ss; // получить массив
    }


    public static String[] splitter (String s) {
        String[] str = null;
        str = s.split(" ");
        for (String x: str) {
            System.out.println(x);
        }
        return str;
    }


    public static int[] allIndexOf(String s, String p) {
        int[] ii = null;
        ArrayList<String> a = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            if (p.equals(s.substring(i, i + p.length()))) { //от 0 до конца слова
                a.add("" + i);//запсать в коллекцию
            }
        }

        if (a.size() > 0) { //если элемент коллекции больше 0
            ii = new int[a.size()]; //добавить его значение в массив ii
            for (int i = 0; i < a.size(); i++) {
                ii[i] = Integer.parseInt(a.get(i)); // передать все элементы коллекции в массив ii с условием
            }
        }
        return ii;
    }

    public static void main(String[] args) {
        String str1 = "Здесь пишем какой-нибудь текст для подсчета слов, которые заканчиваются той же буквой, что и начинаются";
        String[] s = recut(str1, " ");

        int k = 0; // сюда количество нужных слов
        for (int i = 0; i < s.length; i++) {
            char[] c = s[i].toCharArray();
            if ((int) c[0] == (int) c[c.length - 1]) {
                k++;
            }
        }

        System.out.println("Вобшем я насчитал " + k);
        splitter(str1);
    }
}
