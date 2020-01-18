package EnsureCapacity;

public class EnsureCapacity {
    public static void main (String[] args) {
        /*Так как в самом начале StringBuffer инициализируется строкой "Java",
        то его емкость составляет 4 + 16 = 20 символов. Затем мы увеличиваем
        емкость буфера с помощью вызова strBuffer.ensureCapacity(32) повышаем
        минимальную емкость буфера до 32 символов. Однако финальная емкость может
        отличаться в большую сторону. Так, в данном случае я получаю емкость не
        32 и не 32 + 4 = 36, а 42 символа. Дело в том,
        что в целях повышения эффективности Java может дополнительно выделять память.*/

        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Емкость текста: " + strBuffer.capacity()); // 20
        strBuffer.ensureCapacity(50); //расширяю емкость буфера
        System.out.println("Емкость выделена: " + strBuffer.capacity()); // 42
        System.out.println("Длина: " + strBuffer.length()); // 4

        strBuffer.setLength(3); //ограничил колиество символов в строке str до 3
        System.out.println(strBuffer.toString()); // вывел Jav
    }
}


