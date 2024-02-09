# Lesson 35

Java I/O (Ввод/Вывод в Java) представляет собой мощный API для работы с вводом и выводом данных в Java. Он включает в себя множество классов и интерфейсов для обработки различных типов данных, в том числе для работы с файлами, сетевыми потоками и многое другое. Давайте рассмотрим ключевые классы и методы, используемые в Java I/O для работы с различными задачами:

### Ввод с клавиатуры
Для ввода с клавиатуры обычно используется `System.in`, который является стандартным потоком ввода. Он может быть обернут в `InputStreamReader` и `BufferedReader` для удобства чтения текста.

```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String inputLine = reader.readLine(); // Чтение строки ввода с клавиатуры
```

### Вывод на экран
Для вывода текста на экран используется `System.out`, который является стандартным потоком вывода.

```java
System.out.println("Текст для вывода на экран");
```

### Сообщения об ошибке
Для вывода сообщений об ошибках используется `System.err`, который аналогичен `System.out`, но предназначен для вывода ошибок и диагностических сообщений.

```java
System.err.println("Сообщение об ошибке");
```

### Чтение и запись в файл байтово
Для байтового чтения и записи в файл используются классы из пакета `java.io`, такие как `FileInputStream` и `FileOutputStream`.

```java
// Чтение файла
FileInputStream in = new FileInputStream("input.txt");
int byteRead;
while ((byteRead = in.read()) != -1) {
    // Обработка байта
}
in.close();

// Запись в файл
FileOutputStream out = new FileOutputStream("output.txt");
out.write(byteData);
out.close();
```

### Чтение и запись в файл символьно
Для символьного чтения и записи в файлы используются `FileReader` и `FileWriter`.

```java
// Чтение файла
FileReader reader = new FileReader("input.txt");
BufferedReader bufferedReader = new BufferedReader(reader);
String line;
while ((line = bufferedReader.readLine()) != null) {
    // Обработка строки
}
reader.close();

// Запись в файл
FileWriter writer = new FileWriter("output.txt");
BufferedWriter bufferedWriter = new BufferedWriter(writer);
bufferedWriter.write("Текст для записи");
bufferedWriter.close();
```

Эти примеры демонстрируют основные способы работы с вводом/выводом в Java. 
