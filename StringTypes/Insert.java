package Insert;

/*Метод insert() вставляет подстроку в любое место в стрке*/

public class Insert {
    public static void main (String[] args) {
        StringBuffer sb = new StringBuffer("Мне JAVA!");
        sb.insert(4, "нравится ");
        System.out.println(sb);
    }
}
