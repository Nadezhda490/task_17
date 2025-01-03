public class Main {
    public static void main(String[] args) {

        System.out.println();
        // 1
        System.out.println("Задание 1: ");
        Circle circle = new Circle((10));
        circle.displayInfo();
//        System.out.println(circle.calculateArea());
        System.out.println();
        // 2
        System.out.println("Задание 2: ");
        Rectangle rectangle = new Rectangle(5.5,6.3);
        rectangle.displayInfo();
//        System.out.println(rectangle.calculatePerimeter());
        System.out.println();
        // 3
        System.out.println("Задание 3: ");
        Student student = new Student("Надежда", 21);
        student.displayInfo();
        System.out.println();
        // 4
        System.out.println("Задание 4: ");
        Car car = new Car("Toyota",90);
        car.displayInfo();
        car.accelerate(50);
        System.out.println();
        // 5
        System.out.println("Задание 5: ");
        Book book = new Book("Последняя война","Кир Булычев");
        System.out.println(book.getBookInfo());
        System.out.println();
        // 6
        System.out.println("Задание 6: ");
        Point point = new Point(6,3);
        point.move(1,5);
        System.out.println();
        // 7
        System.out.println("Задание 7: ");
        Person person = new Person("Надежда", "Лебединская");
        System.out.println("Полное имя: " + person.getFullName());
        System.out.println();
        // 8
        System.out.println("Задание 8: ");
        Temperature temperature = new Temperature(21.5);
        System.out.println("Температура в градусах Цельсия: " + temperature.celsius);
        System.out.println("Температура в градусах Фаренгейта: " + temperature.toFahrenheit());
        System.out.println("Температура в Кельвинах: " + temperature.toKelvin());
        System.out.println();
        // 9
        System.out.println("Задание 9: ");
        Counter counter = new Counter();
        System.out.println("Начальное значение: " + counter.getCount());
        counter.increment();
        System.out.println("Значение после увеличения: " + counter.getCount());
        counter.decrement();
        System.out.println("Значение после уменьшения: " + counter.getCount());
        System.out.println("Текущее значение: " + counter.getCount());
        System.out.println();
        // 10
        System.out.println("Задание 10: ");
        Time time = new Time(15, 20);
        System.out.print("Начальное время: ");
        if (time.hours < 10) {
            System.out.print("0");
        }
        System.out.print(time.hours + ":");
        if (time.minutes < 10) {
            System.out.print("0");
        }
        System.out.println(time.minutes);
        time.addMinutes(125);
        System.out.print("Обновлённое время: ");
        if (time.hours < 10) {
            System.out.print("0");
        }
        System.out.print(time.hours + ":");
        if (time.minutes < 10) {
            System.out.print("0");
        }
        System.out.println(time.minutes);
    }
}



//    Задание 1
//    Создайте класс Circle, который имеет:
//    Поле radius (тип double).
//    Конструктор для установки радиуса.
//    Метод calculateArea(), который возвращает площадь круга.

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public void displayInfo() {
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь круга: " + calculateArea());
    }
}

//    Задание 2
//    Создайте класс Rectangle, который имеет:
//    Поля length и width (оба типа double).
//    Конструктор для установки длины и ширины.
//    Метод calculatePerimeter(), который возвращает периметр прямоугольника.

class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayInfo() {
        System.out.println("Длина: " + length);
        System.out.println("Ширина: " + width);
        System.out.println("Периметр прямоугольника: " + calculatePerimeter());
    }
}

//    Задание 3
//    Создайте класс Student, который имеет:
//    Поля name (тип String) и age (тип int).
//    Конструктор для установки имени и возраста.
//    Метод displayInfo(), который выводит имя и возраст студента в консоль.

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Имя студента: " + name);
        System.out.println("Возраст студента: " + age);
    }
}

//    Задание 4
//    Создайте класс Car, который имеет:
//    Поля brand (тип String) и speed (тип int).
//    Конструктор для установки бренда и начальной скорости.
//    Метод accelerate(int increment), который увеличивает скорость на указанное значение.

class Car {
    String brand;
    int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println("Скорость увеличена на " + increment + ". Текущая скорость: " + speed);
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Текущая скорость: " + speed);
    }
}

//    Задание 5
//    Создайте класс Book, который имеет:
//    Поля title (тип String) и author (тип String).
//    Конструктор для установки названия книги и автора.
//    Метод getBookInfo(), который возвращает строку с информацией о книге.

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getBookInfo() {
        return "Книга: " + title + ". Автор: " + author;
    }
}

//    Задание 6
//    Создайте класс Point, который имеет:
//    Поля x и y (оба типа int).
//    Конструктор для установки координат точки.
//    Метод move(int dx, int dy), который изменяет координаты точки на заданное смещение.

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        System.out.println("Начальные координаты точки: " + x + ", " + y);
        x += dx;
        y += dy;
        System.out.println("Текущие координаты точки: " + x + ", " + y);
    }
}

//    Задание 7
//    Создайте класс Person, который имеет:
//    Поля firstName и lastName (оба типа String).
//    Конструктор для установки имени и фамилии.
//    Метод getFullName(), который возвращает полное имя человека.

class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

//    Задание 8
//    Создайте класс Temperature, который имеет:
//    Поле celsius (тип double).
//    Конструктор для установки температуры в градусах Цельсия.
//    Методы toFahrenheit() и toKelvin(), которые возвращают температуру в Фаренгейтах и Кельвинах соответственно.

class Temperature {
    double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }
}

//    Задание 9
//    Создайте класс Counter, который имеет:
//    Поле count (тип int), изначально равное 0.
//    Метод increment(), который увеличивает значение поля на 1.
//    Метод decrement(), который уменьшает значение поля на 1.
//    Метод getCount(), который возвращает текущее значение счетчика.

class Counter {
    int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}

//    Задание 10
//    Создайте класс Time, который имеет:
//    Поля hours и minutes (оба типа int).
//    Конструктор для установки времени.
//    Метод addMinutes(int minutes), который добавляет заданное количество минут к времени и корректно обновляет часы.

class Time {
    int hours;
    int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        tekusheeVremua();
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
        tekusheeVremua();
    }

    public void tekusheeVremua() {
        hours += minutes / 60;
        minutes = minutes % 60;
        hours = hours % 24;
    }

}