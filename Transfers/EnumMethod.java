package EnumMethod;

enum Apple {
    Jonathan, GoldenDel , RedDel , Winesap , Cortland
}

public class EnumMethod {
    public static void main (String args[]) {
        Apple ap1, ap2, ap3;

        //получить все порядковые значения с помощью метода ordinal()
        System.out.println ( "Bce константы сортов яблок " + " и их порядковые значения : " );
        for (Apple a: Apple.values())
            System.out.println(a + " " + a.ordinal());

        ap1 = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        //продемонстрировать применение методов сошраrеТо() и equals()

        if(ap1.compareTo(ap2) < 0)
            System.out.println(ap1 + " предшествует" + ap2);

        if(ap1.compareTo(ap2) > 0)
            System.out.println(ap2 + " предшествует " + ap1);

        if(ap1.compareTo(ap3) == 0)
            System.out.println(ap2 + " равно " + ap1);

        System.out.println();

        if(ap1.equals(ap2))
            System.out.println(" Ошибка! ");

        if(ap1.equals(ap3))
            System.out.println(ap1 + "равно" + ap3);

        if(ap1 == ap3)
            System.out.println(ap1 + " == " + ap2);
    }
}
