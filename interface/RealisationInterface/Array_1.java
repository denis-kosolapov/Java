package RealisationInterface;

public class Array_1  implements  Array{

    int a[]  = new int[4];
    int size = 0;

    @Override
    public int Get(int i) {
        if (i < a.length)
            return a[a.length - i - 1];
        else
            return a[0];
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
