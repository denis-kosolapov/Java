package TestingInterface;

 class Method {
    private double depth;
    private double height;
    private double with;

    Method (double d, double w, double h) {
        with = w;
        depth = d;
        height = h;
    }

    double Volume() {
        return with*depth*height;
    }

    double[] MassVol() {
        return new double[]{with, depth, height};
    }
}

class Box {
    public static void main(String[] args) {
        Method method = new Method(15, 16, 17);
        double vol = method.Volume();
        System.out.println(vol);

        for (double x : method.MassVol()) {
            System.out.println("Введено значение " + x);
        }
    }
}
