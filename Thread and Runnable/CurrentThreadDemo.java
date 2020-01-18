package StateTHread;

public class CurrentThreadDemo {
    public static void main (String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения " + t);
        t.setName("NewThread");

        try {
            for (int i = 5; i > 0; i --) {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println(t.getState()); // вот так можно запросить состояние потока
            }
        } catch (InterruptedException e) {
            System.out.println("Главный исполнения прерван");
        }
    }
}
