package GenInterface;

/*
* Пример применения обобщенного интерфейса
* Обобщенный интерфейс MinMax для определения
* минимального и максимального значений
*/
public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// реализовать обобщенный интерфейс MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] o) {vals = o; }

    // возвратить минимаьное значение из массива vals
    public T min() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++)
            if (vals[i].compareTo(v) < 0) v = vals[i];
            return v;
    }

    // возвратить максимальное значение из массива vals
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0) v = vals[i];
            return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 10};
        Character chs[] = {'b', 'r', 'p', 'z'};
        String strl[] = {"a", "d", "c", "z"};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        MyClass<String> str = new MyClass<String>(strl);

        System.out.println("Максимальное значение в массиве inums: " + iob.max());
        System.out.println("Минимальное значение в массиве inums: " + iob.min());
        System.out.println("Максимальное значение в массиве chs: " + cob.max());
        System.out.println("Минимальное значение в массиве chs: " + cob.min());
        System.out.println("Первая букава в алфавите " + str.min());
        System.out.println("Последняя буква в алфавите " + str.max());
    }
}
