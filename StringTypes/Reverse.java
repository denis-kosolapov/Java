package Reverse;

/*название говорить само за себя*/

public class Reverse {
    public static void main (String[] args) {
        StringBuffer s = new StringBuffer("abcdef");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
