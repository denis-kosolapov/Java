package InMassiv;

//Воспользоваться встроенными в перечисление ме тодами values ()
//и valueOf ()

//Перечисение сортов яблок

enum Apple {
    Jonathan, GoldenDel , RedDel , Winesap , Cortland
}

public class EnumMass {
    public static void main (String args[]) {
        Apple ap;

        System.out.println("Koнcтaнты перечислимого типа Apple:");

        //применить метод values()
        Apple allapples[] = Apple.values();
        for (Apple a: allapples) {
            System.out.println(a);
        }

        System.out.println();

        //применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Пepeмeннaя ар содержит " + ap);
    }
}

