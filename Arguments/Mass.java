//один из способов генерации данных
package Mass;

public class Mass {
    public static void main (String[] args) {

        //перебор массива и работа со значениями массива
        String nums[] = {"1 ", "2 ", "3 ", "4 "};
        String words[] = {"один", "два", "три", "четыре"};

        //перебор массива
        for (String x : nums) {
            for (String y : words) {
                System.out.println(x+y);
            }
        }
    }
}
