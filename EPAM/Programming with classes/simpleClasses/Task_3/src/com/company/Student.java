package com.company;

public class Student {
    private String name;
    private int group;
    private int[] marks;

    public Student(String name, int group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public static void getExcellentStudents(Student[] students){
        for (Student student : students) {
            int minMark = 10;
            for (int grade : student.marks) {
                if (grade < minMark) {
                    minMark = grade;
                }
            }
            if (minMark >= 9) {
                System.out.printf("Студент-отличник: %s, Группа: %d. %n", student.name, student.group);
            }
        }
    }
}
