package Search;

/*методы indexOf() находит первое значение вхождения символа или подстроки
и lastIndexOf() находит последнее значение вхождение символа или подстроки*/

public class IndexOfDemo {
    public static void main (String[] args) {
        String s = "Now is the time for all good men " +
                "to come to the aid of their country.";
        System.out.println(s);
        System.out.println("indexOf(t) = " + s.indexOf('t'));
        System.out.println("lastIndexOf (t) = " + s.lastIndexOf('t'));

        System.out.println();

        /*метож substring() извлекает подстроку из символьной строки*/
        String org = "This is a test. This is too.";
        String search = "is";
        String sub = "was";
        String result = "";

        int i;
        do {//заменить все совпадающие подстроки
            System.out.println(org);
            i = org.lastIndexOf(search);
            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        } while (i != -1);

        System.out.println();

        /*метод concat() для сцепления строк*/
        System.out.println(search.concat(sub));

        System.out.println();

        /*метод replace() имеет две формы
        * первая - заменяет все вхождения одного символа на другой
        * вторая - заменяется последвательность символов*/

        System.out.println(org.replace('t', 'Z')); // заменили символ
        System.out.println(org.replace("This", "There")); // заменили последовательность символов

        System.out.println();

        /*метод trim() удаляет пробелы из строки в начале и в конце*/
        String abc = "          Привет! Здесь Много Пробелов!             ";
        System.out.println(abc); // выводится с пробелами в начале и в конце
        System.out.println(abc.trim()); // подчищаются пробелы в начале и в конце
    }
}
