package Lesson21;

/*
   Домашнее задание №21

Текстовый файл содержит следующую информацию о персонах (Person) (имя, фамилия, пол, возраст).
Путь к файлу должен задаваться через консоль. Каждое поле в файле разделено запятой.

Написать программу, которая читает информацию из входного файла, сортирует персонов по имени и фамилии.
Отсортированные данные вывести в тот же файл, перезаписав его.
На консоль вывести количество человек с возрастом > 30.
На консоль вывести количество мужчин и женщин.

Пример данных в исходном файле:
Jack,Ward,male,16
Alex,Wilson, male,29
Monica,Lopez, female,33

Пример вывода на консоль:
Count: 1
male:2
female:1

Note:
Для работы с файлами можно использовать класс File.
Организовать корректую обработку исключений.
Для сортировки и вычислений можно использовать Stream.
 */

// Путь к файлу: src/Lesson21/person.txt

public class Main {
    public static void main(String[] args) {
       SortPerson sortPerson = new SortPerson();
       sortPerson.writePersonToFile(sortPerson.sortListPerson(sortPerson.readFileOfPersons()));
       SortPerson.numberOfOverThirtyYearsOld(sortPerson.listPersonSort);
       SortPerson.numberOfMen(sortPerson.listPersonSort);
       SortPerson.numberOfWomen(sortPerson.listPersonSort);
    }
}