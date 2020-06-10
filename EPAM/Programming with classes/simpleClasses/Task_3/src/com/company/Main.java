package com.company;
//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Main {

    public static void main(String[] args) {
        Student [] students = new Student[10];

        students[0] = new Student("Прадед К.В.", 11, new int[]{7, 6, 8, 7, 9});
        students[1] = new Student("Иванов И.И.", 11, new int[]{4, 5, 7, 10, 6});
        students[2] = new Student("Николаев К.В.", 21, new int[]{9, 8, 8, 10, 9});
        students[3] = new Student("Крупский Н.В.", 1, new int[]{10, 10, 10, 10, 10});
        students[4] = new Student("Козаков В.В.", 11, new int[]{4,7,8,5,3});
        students[5] = new Student("Путин В.В.", 11, new int[]{9, 9, 10, 10, 9});
        students[6] = new Student("Навальный А.Н.", 21, new int[]{10,8,9,9,9});
        students[7] = new Student("Осипов К.К.", 11, new int[]{7, 6, 8, 7, 9});
        students[8] = new Student("Петров Н.К.", 11, new int[]{10,10,10,10,9});
        students[9] = new Student("ФантазияЗакончилась В.В.", 11, new int[]{10,9,9,10,9});
        Student.getExcellentStudents(students);
    }
}
