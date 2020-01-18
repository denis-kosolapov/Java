package String;

/*Работа со строками или переменными строкового типа*/
/*String класс библиотеки java для работы с символьными переменными*/

public class StringDemo {
    public static void main (String args[]) {
        String strob1 = "Первая строка";
        String strob2 = "Вторая строка";
        String strob3 = strob1;

        System.out.println("Длина строки strob1: " + strob1.length());
        System.out.println("Символ по индексу 3 в строке strob1: " + strob1.charAt(2));

        if (strob1.equals(strob2))
            System.out.println("strob1 == strob2");
        else
            System.out.println("strob1 != strob2");

        if (strob1.equals(strob3))
            System.out.println("strob1 == strob3");
        else
            System.out.println("strob1 != strob3");
    }
}

/*Работа с данными строкового типа в массивах*/

