package RealisationInterface;

/*Данный класс реализует интерфейс
* Чтобы реализовать интерфейс нужно унаследовать его с помощью implements*/

public class MyArray implements Array {

    int a[]  = new int[50];
    int size = 0;

    /*Теперь реализуем методы
    * Нужно помнить, что все методы интерфейса должны быть реализованы!
    * в данном классе*/
    @Override
    public int Get(int i) {
        return a[i];
    }

    @Override
    public boolean Add(int value) {
        if (size != a.length) {
            a[size] = value;
            size++;
            return true;
        } else
        return false;
    }
}
