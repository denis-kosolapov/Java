package IndexOf_LastIndexOf;

/*определить начало и конец подстроки*/

public class Index {
    public static void main(String[] args){
        StringBuffer s = new StringBuffer("one two one");
        int i;
        i = s.indexOf("one");
        System.out.println("Индекс первого вхождения " + i);

        i = s.lastIndexOf("one");
        System.out.println("Индекс последнего вхождения " + i);

        String str = "Hello World как так то? На самом деле это массив слов";
        String[] strm = str.split(" ");
        for (String x : strm) {
            System.out.println(x);
        }
    }
}
