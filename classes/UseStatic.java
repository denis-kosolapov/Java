package Static;

public class UseStatic{
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статический блок инициализирован");
        b = a * 4;
    }

    public static void main (String args[]) {
        meth(42);

        int y = a * b;
        System.out.println(y);

        for (int i = 0; i < 10; i++) {
            int z = i + a*2;
            System.out.println(z);
        }
    }
}
