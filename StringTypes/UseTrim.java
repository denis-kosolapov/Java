package Trim;

import java.io.*;

/*небольшой пример рпименения метода trim()*/

public class UseTrim {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите 'стоп' для завршения");
        System.out.println("Введите название штата");
        do {
            str = br.readLine();
            str = str.trim();
            if (str.equals("Иллиноис"))
                System.out.println("Столица - Спрингфилд");
            else if (str.equals("Миссури"))
                System.out.println("Столица - Джеферсонсити");
            else if (str.equals("Калифорния"))
                System.out.println("Столица - Сакраменто");
            else if (str.equals("Вашингтон"))
                System.out.println("Столица - Олимпия");
        } while (!str.equals("стоп"));
    }
}
