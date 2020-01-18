package Reader;

class Reader {
    //определить слдержится ли объект в массиве
    static <T extends  Comparable <T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) return true;
        }

            return false;
    }
    public static void main (String args[]) {
        //применить метод isIn для целых чисел
        Integer nums[] = {1,2,3,4,5};
        if (isIn(2,nums))
            System.out.println("Число 2 содержится в массиве nums");
        if (!isIn(7, nums))
            System.out.println("Число 7 отсутствует в масиые nums");

        System.out.println();

        // применить метод isIn для символьных строк
        String str[] = new String[]{"один", "два", "три", "четыре", "пять"};
        if (isIn("два", str))
            System.out.println("Два содержится в массиве str");
        if (!isIn("семь", str))
            System.out.println("семь не сотсутствует в массиве str");
    }
}
