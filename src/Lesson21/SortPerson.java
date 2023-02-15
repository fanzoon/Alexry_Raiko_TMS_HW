package Lesson21;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortPerson {
    List<Person> listPerson = new ArrayList<>();
    List<Person> listPersonSort = new ArrayList<>();

    public List<Person> readFileOfPersons() {
        System.out.println("Введите путь к файлу, из которого следует прочитать данные:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        try (FileReader fr = new FileReader(file);
             BufferedReader reader = new BufferedReader(fr)) {
            String line = reader.readLine();
            while (line != null) {
                String[] stringsPerson = line.split(",");
                Person person = new Person();
                person.setName(stringsPerson[0]);
                person.setLastName(stringsPerson[1]);
                person.setGender(stringsPerson[2]);
                person.setAge(Integer.parseInt(stringsPerson[3]));
                listPerson.add(person);
                line = reader.readLine();
            }
            listPerson.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Файл c именем: " + path + " не найден");
        }
        return listPerson;
    }

    public List<Person> sortListPerson(List<Person> anyListPerson) {
        Comparator<Person> comparator = (a, b) -> {
            if (!a.getName().equals(b.getName())) {
                return a.getName().compareTo(b.getName());
            } else {
                return a.getLastName().compareTo(b.getLastName());
            }
        };
        System.out.println("after sorted:");
        listPersonSort = anyListPerson
                .stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        listPersonSort.forEach(System.out::println);
        return listPersonSort;
    }

    public void writePersonToFile(List<Person> listPerson) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Введите путь к файлу, в который следует записать данные:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try (FileWriter writer = new FileWriter("src/Lesson21/person.txt")) {
            writer.write("");
            for (Person x : listPerson) {
                String text = x.getName() + "," + x.getLastName() + "," + x.getGender() + "," + x.getAge();
                writer.write(text);
                writer.append('\n');
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Файл c именем: " + path + " не найден");
        }
    }

    static void numberOfOverThirtyYearsOld(List<Person> listPerson) {
        System.out.println("Count:" + listPerson
                .stream()
                .filter(person -> person.getAge() > 30)
                .count());
    }

    static void numberOfMen(List<Person> listPerson) {
        System.out.println("male:" + listPerson
                .stream()
                .filter(person -> person.getGender().equals("male"))
                .count());
    }

    static void numberOfWomen(List<Person> listPerson) {
        System.out.println("female:" + listPerson
                .stream()
                .filter(person -> person.getGender().equals("female"))
                .count());
    }
}













