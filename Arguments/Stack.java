package Stack;

class Stack {
    int stck[] = new int[10];
    int tos;

    //Инициализировать вершину стека
    Stack () {
        tos = -1;
    }

    //Разместить элемент в стеке
    void push (int item) {
        if (tos==9)
            System.out.println("Стек заполнен.");
        else
            stck [++tos] = item;
    }

    //Извлечь элемент из стека

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не закгружен.");
            return 0;
        }
        else
            return stck [tos--];
    }
}

class TestStack {
    public static void main (String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //разместить числа в стеке
        for (int i=0; i<10; i++) mystack1.push(i);
        for (int i=10; i<20; i++) mystack2.push(i);

        //извлечь числа из стека
        System.out.println("Разместить числа в стеке mystack1 ");
        for (int i=0; i<10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Разместить числа в стеке mystack2 ");
        for (int i=0; i<10; i++)
            System.out.println(mystack2.pop());
    }
}
