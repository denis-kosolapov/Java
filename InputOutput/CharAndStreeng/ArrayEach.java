package CharAndStreeng;

public class ArrayEach {
    public static void  main (String[] args) {
        char a[] = {'A'};
        char b[] = {'B'};
        String string = new String();
        for (char x: a) {
            for (char y : b) {
                string = x + "" + y;
                System.out.println(string);
            }
        }
    }
}
