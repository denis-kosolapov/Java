package TypesPuck;

public class AutoBox2 {
    //принять параметр типа Integer и возвратить
    //значение типа int
    static int m(Integer v) {
        return v;
    }

    public static void main(String[] args) {
        /*Передать значение типа int методу m() и присвоить
        * возвращаемое значение объекту типа Integer
        * Здесь значение аргумента автоматически упаковывается в объект типа
        * Integer. Возвращаемое значение так же упаковывается в объект
        * типа Integer*/
        Integer pro = m(100);
        System.out.println(pro);

        Integer ob = 1000;
        int i = ob.byteValue();
        Double ob2 = 10.25;
        String j = ob2.toString();
        String k = "10.25";
        if (j.equals(k)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(i);
        System.out.println(j);
    }
}
