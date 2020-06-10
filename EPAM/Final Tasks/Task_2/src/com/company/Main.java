package com.company;

import com.company.controller.FileNote;
import com.company.controller.Note;
import com.company.controller.NoteData;
import com.company.noteComparators.CompareByData;
import com.company.noteComparators.CompareByDataAndTitle;
import com.company.noteComparators.CompareByEmailAndData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Разработать консольное приложение, работающее с Заметками в Блокноте.
 * Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).
 * Общие пояснения к практическому заданию:
 * • В начале работы приложения данные должны считываться из файла, в конце
 * работы – сохраняться в файл.
 * • У пользователя должна быть возможность найти запись по любому параметру
 * или  по  группе  параметров  (группу  параметров  можно  определить
 * самостоятельно), получить требуемые записи в отсортированном виде, найти
 * записи,  текстовое  поле  которой  содержит  определенное  слово,  а  также
 * добавить новую запись.
 * • Особое  условие:  поиск,  сравнение  и  валидацию  вводимой  информации
 * осуществлять с использованием регулярных выражений.
 * • Особое  условие:  проверку  введенной  информации  на  валидность  должен
 * осуществлять код, непосредственно добавляющий информацию.
 * */
public class Main {

    public static void main(String[] args) throws IOException {
        FileNote fileNote = new FileNote();
        List<Note> noteList = new ArrayList<>();
        if (fileNote.getAll() != null) {
            noteList.addAll(fileNote.getAll());
        }
        String str = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            System.out.println("1)Добавить заметку");
            System.out.println("2)Вывести все заметки");
            System.out.println("3)Сортировать все заметки по дате");
            System.out.println("4)Сортировать все заметки по дате и названию");
            System.out.println("5)Сортировать по почте и дате");

            int keys = 0;
            try {
                keys = Integer.parseInt(reader.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
                System.out.println("Incorrect choice of number, try again. ");
            }

            switch (keys) {
                case (0):
                    System.exit(0);
                    break;
                case (1):
                    NoteData note = new NoteData();
                    note.noteData();
                    noteList.add((Note) note);
                    break;
                case (2):
                    if (noteList != null) {
                        for (Note s : noteList) {
                            System.out.println(s.toString());
                        }
                    }
                    break;
                case (3):

                    Collections.sort(noteList, new CompareByData());
                    break;

                case (4):
                    Collections.sort(noteList, new CompareByDataAndTitle());
                    break;
                case (5):
                    Collections.sort(noteList, new CompareByEmailAndData());
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
            fileNote.saveAll(noteList);
        }

    }
}
