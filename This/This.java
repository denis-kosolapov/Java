package This;

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return height * width *depth;
    }
    // создается конструктор, который будет содеожать переменные
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void setNDim(double w, double h, double d) {
        this.setDim(w-9, h-8, d-7);
        /*в данном примере this говорит, что нужно взять конструктор setDim и каждому его параметру присвоить
        * новое значение, которое указано в круглых скобках*/
    }
}

public class This {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        Box mybox3 = new Box();
        double vol;

        mybox1.setDim(15,50,23); //параметры вводятся сюда
        mybox2.setDim(12,20,54);// однако, их можно ввести и склавиатуры
        mybox3.setNDim(10, 10, 10);

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);

        vol = mybox3.volume();
        System.out.println(vol);
    }
}

