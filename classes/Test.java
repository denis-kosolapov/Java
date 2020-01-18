package Test;

import Box.Box;

public class Test {
    public static void main(String args[]) {
        Boxer myboxer = new Boxer();
        Box mybox = new Box();

        myboxer.depth1 = 10;
        myboxer.heighr1 = 15;
        myboxer.width1 = 20;

        mybox.depth = 15;
        mybox.height = 25;
        mybox.width = 35;

        double vol1 = mybox.depth * mybox.height * mybox.width;

        double vol = myboxer.depth1 * myboxer.heighr1 * myboxer.width1;

        System.out.println(vol);
        System.out.println(vol1);

        System.out.println(vol + vol1);



    }
}
