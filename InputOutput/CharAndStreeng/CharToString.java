package CharAndStreeng;

public class CharToString {
    public static void main (String[] args) {
        /*Для начала создам массив с символьным типом char
        * и заполню его объектами*/
        char c[] = {'J', 'A', 'V', 'A'};
        /*передам массив в экземпляр класса String и распечатаю его*/
        String string = new String(c);
        System.out.println(string);
        /*создам пустой массив z типа char*/
        char z[];
        /*передам в него строку из экземпляра string при помощи метода toCharArray*/
        z = string.toCharArray();
        /*переберу массив z и распечатаю его*/
        for (char x: z) {
            /*создам условие, при котором переменная x принимает другое значение в массиве
            * заменю J на D*/
            if (x == 'J') {
                x = 'D';
            }
            /*Теперь распечатаю массив*/
            System.out.println(x);
        }
    }
}
