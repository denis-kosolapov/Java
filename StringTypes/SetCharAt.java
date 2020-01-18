package CharAt_SetCharAt;



public class SetCharAt {
    public static void main (String[] args) {

        /*извлечь символ из буфферизированной строки*/

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        System.out.println(sb.charAt(1));

        /*вставить символ в буферизированную строку*/

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println(sb);
        System.out.println(sb.charAt(1));
    }
}
