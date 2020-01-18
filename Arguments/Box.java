package Constructors;
// перегрузка конструкторов

/*Это версии класса Box доспускается инициализировать лругим объектом*/
class Box {
    double width;
    double height;
    double depth;


    /*в этом конструкторе в качестве параметра используется объект типа Box*/
    Box(Box ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    /*конструктор при указании всех размеров*/
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    /*конструктор испульзуемый если ни один из размеров не указан*/
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    /*конструктор используемый при создании куба*/
    Box(double len) {
        width = height = depth = len;
    }

    /* рассчитать и возвратить объем*/
    double volume() {
        return width*height*depth;
    }
}

class OverLoadCons2 {
    public static void main (String args[]) {
        /*создать параллелепипеды используя разные конструкторы*/
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);
        vol = mycube.volume();
        System.out.println(vol);
        vol = myclone.volume();
        System.out.println(vol);
    }
}


