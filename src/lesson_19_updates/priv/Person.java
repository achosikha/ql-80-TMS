package lesson_19_updates.priv;

public class Person {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Вытянуть какую-то информацию таким образом, чтобы не было видно какой-то логики
    public String getInformation(){
        // Вызываю закрытый метод
        // И вывожу уже результат его работы
        // Тем самым, реальный рабочий метод скрыт
        // Виден только открытый метод, который ничего внутри не имеет, кроме вызова
        return getDataInformation();
    }

    private String getDataInformation(){
        // Я скрытно обрабатываю данные
        // Использую алгоритм
        return "DATA FROM HIDDEN PRIVATE METHOD.";
    }
}
