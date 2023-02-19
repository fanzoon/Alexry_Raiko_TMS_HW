package Lesson21;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class SortPerson {
    public static List<Person> readFileOfPersons() {
        System.out.println("Введите путь к файлу, из которого следует прочитать данные:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        List<Person> listPerson = new ArrayList<>();
        File file = new File(path);
        FileReader fr = null;
        BufferedReader reader = null;
        try {
            fr = new FileReader(file);
            reader = new BufferedReader(fr);
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
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (reader != null) {
                    reader.close();
                }
            }catch (IOException e) {
                System.out.println("FileReader fr или BufferedReader reader не закрыт");
            }
        }
        return listPerson;
    }

    public static List<Person> sortListPerson(List<Person> anyListPerson) {
        Comparator<Person> comparator = (a, b) -> {
            if (!a.getName().equals(b.getName())) {
                return a.getName().compareTo(b.getName());
            } else {
                return a.getLastName().compareTo(b.getLastName());
            }
        };
        System.out.println("after sorted:");
        List<Person> listPersonSort;
        listPersonSort = anyListPerson
                .stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        listPersonSort.forEach(System.out::println);
        return listPersonSort;
    }

    public static void writePersonToFile(List<Person> listPerson) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Введите путь к файлу, в который следует записать данные:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file)) {
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













