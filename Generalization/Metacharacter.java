// применение метасимвола

public class Metacharacter<T extends Number> {
    T[] nums; //массив класса Number и его подкласса

    /*
    * передать конструктору ссылку на массив
    * элементов Number или его подкласса
    */
    Metacharacter(T[] o) {
        nums = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
            return sum / nums.length;
    }

    /*
    * определить равенство двух средних значений
    * Обратите внимане на применение метасимвола
    */
    boolean sameAvg(Metacharacter<?> ob) {
        if (average() == ob.average())
            return true;
        return false;
    }
}

class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Metacharacter<Integer> iob = new Metacharacter<Integer>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно: " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Metacharacter<Double> dob = new Metacharacter<Double>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно: " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Metacharacter<Float> fob = new Metacharacter<Float>(fnums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно: " + x);

        // выяснить, какие массивы имеют одинаковые средние значения
        System.out.print("Средние значения iob и dob");
        if (iob.sameAvg(dob))
            System.out.println(" равны.");
        else
            System.out.println(" отличаются.");

        System.out.print("Средние iob и fob");
        if (iob.sameAvg(fob))
            System.out.print(" одинаковы.");
        else
            System.out.println(" отличаются.");

        /*
        * Результат выполнения программы
        * Среднее значение iob равно: 3.0
        * Среднее значение dob равно: 3.3
        * Среднее значение fob равно: 3.0
        * Средние значения iob и dob отличаются.
        * Средние iob и fob одинаковы.
        */
    }
}
