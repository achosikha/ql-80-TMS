package lesson_9_abstracts;

import lesson_9_abstracts.animals.*;
import lesson_9_abstracts.controlpanel.ControlSmartTV;
import lesson_9_abstracts.controlpanel.SamsungControlPanel;

// Abstracts
// Interfaces
public class MyAbstracts {
    public static void main(String[] args) {
        // CODE
        createControlSmartTV();

        // Сын - от ОТЦА и МАМЫ ОДННОВРЕМЕННО БЕЗ ИЕРАРХИИ - это называется МНОЖЕСТВЕННОЕ НАСЛЕДОВАНИЕ
        // В Джаве МНОЖЕСТВЕННОЕ НАСЛЕДОВАНИЕ ЗАПРЕЩЕНО - для этого существуют ИНТЕРФЕЙСЫ
        // Допускается МНОЖЕСТВЕННАЯ РЕАЛИЗАЦИЯ ИНТЕРФЕЙСОВ
        // Person -> Father, Mother
        // Father -> dna();
        // Mother -> dna();
        // Person child.dna() -> ??? ОШИБКА ПОМПИЛЯЦИЯ
        // Person child.Mother.dna()
    }

    public static void createControlSmartTV(){
        ControlSmartTV samsungControlPanel = new SamsungControlPanel("JK-1R", "SAMSUNG");
        samsungControlPanel.channelDown();
        samsungControlPanel.decreaseVoid();
        samsungControlPanel.turnOffTV();
    }

    public static void createNonAbstractClasses(){
        // abstract classes does not create their own classes instances
        // Animal animal = new Wolfs();
        Wolfs wolfs = new CaucasianHound("C", "D", 2001);
    }

    public static void useInstanceOf(){
        Animal lion = new Lions("Simba", "Lion", 2022); // lion у меня только функционал от Animals

        // instanceof проверяет является ли экземпляр класса реализацией какого-либо класса
        // object instanceof super_type variable ...
        System.out.println("lion instanceof Object: " + (lion instanceof Object));
        System.out.println("lion instanceof Animal: " + (lion instanceof Animal));
        System.out.println("lion instanceof Lions: " + (lion instanceof Lions)); // ЯВЛЯЕТСЯ ЭКЗЕМПЛЯРОМ КЛАССА LIONS

        // Старая версия
        if(lion instanceof Lions){
            Lions lionConverted = (Lions) lion;
        } else if (lion instanceof Cat){
            Cat catConverted = (Cat) lion;
        }

        if (lion instanceof Lions element){ // Lions element = lion;
            element.lionsRoar();
        }
    }

    public static void createAnimal(){
        // Экземпляр класса не просто создается, но ему и предоставляются доступы или же ФУНКЦИОНАЛ
        // То на основе чего создается экземпляр класса и предопределяет ЧТО ЕМУ ДОСТУПНО, А ЧТО НЕТ
        Animal lion = new Lions("Simba", "Lion", 2022); // lion у меня только функционал от Animals
        Lions lionAnimal = (Lions) lion;

        // Animals -> Cats, Lions, Cat...
        // Cats -> Cat, Lions

        Animal caucasianHound = new CaucasianHound("Edgar", "Caucasian Hound", 2021);

        // Animal (базовый класс) имя_экземпляра_класса = new какой_под_класс()
        // На основе какого БАЗОВОГО КЛАССА ВЫ создаете экземпляр - это у вас и есть ФУНКЦИОНАЛ
        Cats cat = new Cat("Jennifer", "Car", 2024);
        cat.jumpLikeCat();

        // Object + Animals + Cats + Lions = весь функционал
        Lions mufasa = new Lions("Mufasa", "Lion", 2000);
        mufasa.lionsRoar();
        System.out.println("-".repeat(60));
        CaucasianHound giorgi = new CaucasianHound("Giorgi", "Caucasian Hound", 2010);
        giorgi.trackPredators();
    }
}
