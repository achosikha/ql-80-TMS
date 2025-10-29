package lesson_10_objects_this.interf;

import javax.xml.transform.Source;
import java.util.Random;

public class MyInterfaces {
    public static void main(String[] args) throws CloneNotSupportedException {
        // CODE
        // class System -> переменная PrintStream out
        // сама переменная out - это объект
        // PrintStream -> метод println()
        setObjects();
    }

    public static void useObject(){
        // Object class
        Object[] values = new Object[]{
                145,
                "Archil",
                'A',
                9.11,
                true
        };
    }

    public static void setObjects(){
        Person archil = new Male("Archil", "Sikharulidze", 1988);
        Person andrey = new Male("Andrey", "Kovzik", 2005);

        // Java если вы сами не учли возможность присваивания одного объекта другому
        // То объект ничего кроме своего адреса не передаст, вообще-то любое прямое присваивание так и сделает
        archil = andrey; // archil = вложи сюда адрес на объект andrey
        // Теперь у вас две переменные archil & andrey указывают на объектa andrey
        // Ссылка на оригинальное пространство с объектом archil потерялась
        System.out.println(archil); // archil alias andrey
        System.out.println(andrey);
    }

    public static void compareToPeople() throws CloneNotSupportedException {
        // Если мы сравниваем примитивы результат всегда логический
        // НО, если сравнивать объекты это не так
        // Можно сравнивать АДРЕСА
        // Можно сравнивать по ЛОГИКЕ
        // А можно по числовому значению
        Person archil = new Male("Archil", "Sikharulidze", 1988);
        Person andrey = new Male("Andrey", "Kovzik", 2000);
        Person archilTwo = new Male("Archil", "Sikharulidze", 1988);

        // == АДРЕСА
        // NEW всегда будет другой АДРЕС
        System.out.println("archil == andrey: " + (archil == andrey)); // FALSE
        System.out.println("archil.equals(andrey): " + archil.equals(archilTwo)); // НЕ РАБОТАЕТ
        // compareTo - ЕСЛИ ПЕРВАЯ ПЕРЕМЕННАЯ ВЫШЕ (ПО КАКИМ-ЛИБО ПАРАМЕТРАМ, -1)
        // Если равны - 0
        // Если вторая переменная больше по каким-либо параметрам 1
        System.out.println("archil.compare(archilTwo): " + archil.compare(andrey));
        System.out.println("-".repeat(50));

        // archil
        // Для разблокировки некоторого функционала нужно подсказать компилятору
        // Что этот функционал нужен - для этого ЧАСТО ИСПОЛЬЗУЮТСЯ МАРКИРОВОЧНЫЕ ИНТЕРФЕЙС
        // Marker Interface
        Person archilCloned = archil.clone(); // Я должен получить ДВА НЕЗАВИСИМЫХ ОБЪЕКТА
        System.out.println(archilCloned);
        System.out.println("archil == archilCloned: " + (archil == archilCloned));
    }

    public static void createPerson(){
        Male archil = new Male("Archil", "Sikharulidze", 1988);

        // Мы можем получить доступ к переменным интерфейса через название интерфейса
        int bornYear = NonClassicalInterface.bornYear;

        EnumDays daysWeek;
        int friday = EnumDays.FRI;
    }

    public static void useComparableInterface(){
        // НЕЛЬЗЯ СОЗДАТЬ ЭКЗЕМПЛЯР ИНТЕРФЕЙСА
        // АНОНИМНАЯ РЕАЛИЗАЦИЯ/ВЫЗОВ КЛАССА

        // Анонимный класс - без имени
        // Что это означает? У него нет постоянного адреса, на который можно сослаться
        int randomNumber = new Random().nextInt(0, 11);

        // Анонимная реализация интерфейса - анонимная реализация класса
        // Button 'C'
        // ifClicked()
        ComparableInterface comparatorIrregular = new ComparableInterface() {
            @Override
            public boolean compare() {
                return false;
            }
        };
    }
}