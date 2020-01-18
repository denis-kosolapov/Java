package SubString;

/*метод возвращает подстроку из сроки*/

public class SubString {
    public static void main (String[] args) {
        StringBuffer s = new StringBuffer("Привет всем!");
        int a = 7; int b = 11;
        System.out.println(s.substring(7));
        System.out.println(s.substring(7, 11));
        System.out.println(s.substring(a,b));
    }
}
