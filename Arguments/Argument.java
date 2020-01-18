package Argument;

/*передача аргументов по значению*/

public class Argument {
    void meth (int i, int j) {
        j *= 2;
        j /= 2;
    }
}

class CallByValye {
    public static void main (String args[]) {
        Argument ob = new Argument();

        int a = 15, b = 20;

        System.out.println( a + " " + b);

        ob.meth(10,20);
        System.out.println(a + " " + b);
    }
}

/*теперь по ссылке*/

class Test2 {
    int a, b;
    Test2(int i, int j) {
        a = i;
        b = j;
    }

    /*передать объект*/
    void meth(Test2 o ) {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassObjRe {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println(ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println(ob.a + " " + ob.b);
    }
}
