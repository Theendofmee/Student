package oop.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Частина 1: ArrayList

        List<String> students = new ArrayList<>();
        students.add("Іван");
        students.add("Марія");
        students.add("Петро");
        System.out.println("Початковий список студентів: " + students);

        // Видалення одного імені
        students.remove("Марія");
        System.out.println("Список студентів після видалення: " + students);

        // Частина 2: HashMap

        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Іван", 90);
        studentGrades.put("Марія", 85);
        studentGrades.put("Петро", 95);
        System.out.println("Оцінки студентів: " + studentGrades);

        // Отримання оцінки одного студента
        String studentName = "Іван";
        System.out.println("Оцінка студента " + studentName + ": " + studentGrades.get(studentName));

        // Видалення одного студента
        studentGrades.remove("Марія");
        System.out.println("Оцінки студентів після видалення: " + studentGrades);

        // Частина 3: HashSet
       
        Set<String> colors = new HashSet<>();
        colors.add("Червоний");
        colors.add("Зелений");
        colors.add("Синій");
        System.out.println("Початковий набір кольорів: " + colors);

        // Додавання дубльованого кольору
        colors.add("Зелений"); // Не додасться, оскільки вже є
        System.out.println("Набір кольорів після спроби додати дубльований колір: " + colors);

        // Видалення одного кольору
        colors.remove("Синій");
        System.out.println("Набір кольорів після видалення: " + colors);
    }
}

