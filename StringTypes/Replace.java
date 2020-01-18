package Replace;

/*метод для замены подстроки*/

public class Replace {
    public static void main (String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест");
        sb.replace(4, 11, "был");
        System.out.println(sb);
    }
}
