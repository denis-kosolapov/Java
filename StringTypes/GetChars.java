package GetChars;

/*получить символ из буферизированной строки
* получить массив символов из строки*/

public class GetChars {
    public static void main (String[] args) {
        String str = new String("Добро пожаловать в программирование");
        char[] str2 = new char[7]; // максимально 7 символов
        try {
            str.getChars(2, 9, str2, 0);
            System.out.println("Скопированное значение: ");
            System.out.println(str2);
        } catch (Exception ex) {
            System.out.println("Возникло исключение...");
        }
    }
}
