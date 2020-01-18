package SuperClass;

/*Доступ к приватным данным через ключевое слово Super*/

public class Box {
    /*Создаем закрытые приватные переменные класса*/
    private double weight;
    private double height;
    private double depth;

    //сконструировать клон объекта
    Box(Box ob) {
        weight = ob.weight;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор применяемый при указании всех размеров
    Box (double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }

    /*конструктор применяемый в отстуствие размеров
     * без которого последующие классы не запускаются*/
    Box() {
        weight = -1;
        height = -1;
        depth = -1;
    }

    //конструктор применяемый при создании куба
    Box (double len) {
        height = weight = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return weight*depth*height;
    }
}

/*Теперь в классе BoxWeight реализованы все конструкторы*/

class BoxWeight extends Box {
    double weight;

    /*Сконструировать клон обекта*/
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    /*Конструктор при указании все параметров*/
    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }

    /*конструктор по умолчанию*/
    BoxWeight() {
        super();
        weight = -1;
    }

    /*Конструктор при создании куба*/
    BoxWeight(double len, double m) {
        super(len);
        weight = -1;
    }
}

class DemoSuoer {
    public static void main (String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(); //Конструктор по умолчанию
        BoxWeight mycube = new BoxWeight(2, 3);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume(); // конструктор по умолчанию
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();
    }
}