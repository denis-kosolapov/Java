package Append;

/*метод append() присоединяет строковое представление любого другого типа
* в конце вызывающего объекта StringBuffer*/

public class Append {
    public static void main (String[] args) {
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);
        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
