package Lesson22;

/*
  Домашнее задание №22
   Создать программу для чтения номеров контрактов из файла.
   Неповторяющиеся номера контрактов следует сохранить в структуру данных
   ключ-значение, где ключ - это номер контракта, а значение - это
   объект класса Document со всей контекстной информацией (номер
   документа, дота создания и другая информация).

   Структуру данных ключ-значение, использавать коллекции Set и Map.

   Файл, откуда ты читаешь информацию содержит несколько полей, разделенных запятой, например
   Что то типо:
   Номер документа,название документа,дата создания,автор

   Путь к файлу: src/Lesson22/document_numbers
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите путь к файлу:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Map<String, Document> mapDocument = new HashMap<>();
        FileReader fr = null;
        BufferedReader reader = null;
        File file = new File(path);
        try {
            fr = new FileReader(file);
            reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] arrayString = line.split(",");
                Document document = new Document();
                document.setNumDocument(arrayString[0]);
                document.setNameDocument(arrayString[1]);
                document.setData(arrayString[2]);
                document.setDocAuthor(arrayString[3]);
                mapDocument.put(arrayString[0], document);
                line = reader.readLine();
            }

            System.out.println("Неповторяющиеся номера контрактов в структуре данных ключ-значение:");
            for (Map.Entry<String, Document> pair : mapDocument.entrySet()) {
                String key = pair.getKey();
                Document value = pair.getValue();
                System.out.println("key: " + key + "   " + "value: " + value);
            }
        }catch (IOException e) {
            System.out.println("Файл c именем: " + path + " не найден");
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("FileReader fr или BufferedReader reader не закрыт");
            }
        }
    }
}