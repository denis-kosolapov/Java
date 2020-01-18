package File;

import java.io.*;

//Отображение содержимого файла

public class ShowFile {
    public static void main (String[] args) {
        int i;
        FileInputStream fin;

        //Сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использвание: ShowFile имя_файла");
            return;
        }

        //Попытка откурыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }

        /*Теперь ффайл открыт и готов к чтению
        * Далее из него читютс символы до тех пор,
        * пока не встретится знак конца файла*/
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != 1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }

        //Закрыть файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }
    }
}
