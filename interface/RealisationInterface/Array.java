package RealisationInterface;

public interface Array {
    /*все поля тут static по умолчанию, объявляются только final*/
    /*все методы являются абстрактными и не нужно писать abstract*/
    int Get (int i);
    boolean Add (int value);
}
/*На заметку! Вложенный интерфейс это интерфейс который вложен в класс или в другой интерфйс
* Можно еще сказать что такой интерфейс является динамическим и применяется чаще всего
* Например в программе калькулятора он используется*/
