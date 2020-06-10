package com.company.controller;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteData extends Note {
    private static  String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
    private Matcher matcher;

    public NoteData() {
    }

    public void noteData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите тему заметки: ");
        String theme = reader.readLine();
        super.setTheme(theme);
        super.setDate(Calendar.getInstance().getTime());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date date = super.getDate();
        String strDate = dateFormat.format(date);
        System.out.println("Дата:  " + strDate);
        System.out.println("Введите почту:");
        String email = "";
        while (true) {
            pattern = Pattern.compile(emailPattern);
            email = reader.readLine();
            matcher = pattern.matcher(email);
            if (matcher.matches()) {
                super.setEmail(email);
                break;
            } else {
                System.out.println("Ваш е-mail не валидный");
            }
        }

        System.out.println("Введите текст заметки");

        String message = "";
        message = reader.readLine();
        super.setMessage(message);
        Note note = new Note(theme, date, email, message);
        note.toString();
        FileWriter writer = new FileWriter("src/com/company/resources/notes.txt", true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write("\n" + note.toString());
        bufferWriter.close();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
