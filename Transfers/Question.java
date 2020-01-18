package SampleProgram;

import java.util.Random;

//перечисление возможных ответов

enum Ansver {
    NO, YES, МАУВЕ, LATER, SOON, NEVER
}

public class Question {
    Random random = new Random(); //применение класса рандом
    Ansver ask() {
        int prob = (int) (100 * random.nextDouble()); //применение рандома к методу

        if (prob < 15)
            return Ansver.МАУВЕ; //15%
        else if (prob < 30)
            return Ansver.NO; //15%
        else if (prob < 60)
            return Ansver.YES; //30%
        else if (prob < 75)
            return Ansver.LATER; //15%
        else if (prob < 98)
            return Ansver.SOON; //13%
        else
            return Ansver.NEVER; //2%
    }
}

class AskMe {
    static void answer (Ansver result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
            case МАУВЕ:
                System.out.println("Возможно");
                break;
        }
    }

    public static void main(String args[]) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}