package NumElementMass;

/*ключевое слово length помогает опрелелить длину массива*/
class Length {
    public static void main (String args[]) {
        int a1[] = new int[10];
        int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
        int a3[] = {4, 3, 2, 1};

        System . out . println ( "длинa a l равна " + a1.length );
        System . out . println ( "длинa а 2 равна " + a2.length );
        System . out . println ( "длинa а З равна " + a3.length );
    }
}

/*можно также определить длину стека*/

class Stack {
    private int stck[];
    private int tos;

    Stack(int size) {
        stck = new int [size];
        tos = -1;
    }

    void push(int item) {
        if(tos==stck.length-1)
            System.out.println("Стек завершон.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main (String args[]) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        /*чтобы стек не выдавал сообщение о том что не загружен,
        * нужно его заполнить, разместить в нем числа например*/
        for (int i=0; i<5; i++) mystack1.push(i);
        for (int i=0; i<8; i++) mystack2.push(i);

        System.out.println("Стек в mystack1: ");
        for (int i=0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2");
        for (int i=0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}