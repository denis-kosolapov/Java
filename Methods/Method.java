package Method;

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return height * width *depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class Method {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(15,50,23); //параметры вводятся сюда
        mybox2.setDim(12,20,54);// однако, их можно ввести и склавиатуры

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
}
