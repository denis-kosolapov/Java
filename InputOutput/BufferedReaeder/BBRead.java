package BufferedReaeder;

import java.io.*;

//использовать класс BufferedReader для чтения с консоли
public class BBRead {
    public static void main (String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file = new FileOutputStream("test.txt");
        System.out.println("Введите 'q' для выхода" );
        //читаь чимволы
        do {
            c = (char) br.read();
            file.write(c);
            System.out.print(c);
        } while (c != 'q');
    }
}
