package TextTXT;

import java.io.*;

public class EnterText {
    public static void main (String[] args){
        /*чтобы не писать throws IOExeption проще обратить к конструкции try/catch
        * Создадим файл и укажем метод append true*/
        try (FileWriter file = new FileWriter("Привет мир.txt", true)) {
            /*Затем вызовем класс BufferedReader для записи данных в буыер*/
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            /*Создадим строковую переменную для записи в нее текста из консоли*/
            String text;
            /*Выведем сообщение с инструкцией*/
            System.out.println("Введите 'стоп' и нажмите enter для окончания ввода");
            /*В цикле for укажем начальное число строк, равное нулю.
            * Максимальное число строк равно 10000, при помощи этого параметра можно контролировать
            * не только количество строк, но и длину строки, а так же максимальный размер файла, за счет
            * количества строк*/
            for (int i = 0; i < 10000; i++) {
                /*строковая переменная text принимает буыеризированный ввод из консоли*/
                text = br.readLine();
                /*метод file принимает данные из переменной text и записывает их в файл*/
                file.write(text);
                /*цикл прерывается, если переменная text эквивалентна "стоп"*/
                if (text.equals("стоп")) break;
            }
        } catch (IOException ex) {
            /*Данная ошибка генерируется, если не удалось создать файл*/
            System.out.println(ex.getMessage());
        }
    }
}
