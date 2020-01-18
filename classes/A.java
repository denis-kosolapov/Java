package SuperClass2;

/*Использовать ключевое слово Super с целью предотвратить сокрытие имен*/

public class A {
    int i;
}
/*Создать подкласс путем расширения класса А*/
class  B extends A {
    int i; // Этот член i скрывает член i из класса А

    B(int a, int b) {
        super.i = a; // Член i из класса А
        i = b;       // Член i из класса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class SuperUse {
    public static void main (String args[]) {
        B subOb = new B (1, 2);

        subOb.show();
    }
}