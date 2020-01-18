package Delete_DeleteCharAt;

/*метод для удаления символов из строки*/

public class Delete {
    public static void main (String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест");
        sb.delete(3, 11);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
