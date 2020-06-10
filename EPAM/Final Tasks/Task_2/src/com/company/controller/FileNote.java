package com.company.controller;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileNote {
    public boolean add(Note note){
        Writer writer = null;
        try {
            String str = note.toString();
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/com/company/resources/notes.txt", true), "utf-8"));
            writer.write(str);
            //очищаем буферы
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error of input-output: ");
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean remove(Note note) {
        return false;
    }

    public List<Note> getAll() {
        List<Note> listNote = new ArrayList<>();
        String s;
        String listNotes = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/com/company/resources/notes.txt"));
            while ((s = br.readLine()) != null) {
                listNotes += s + "\n";
            }
            List<String> loginListAr = Arrays.asList(listNotes.split("\n"));
            for (int i = 0; i < loginListAr.size(); i++) {
                String count = loginListAr.get(i);
                listNote.add(toNote(count));
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return listNote;
    }


    public Note toNote(String note) {
        Note userNote = new Note();
        String[] unoteSplit = note.split("\\|");

        userNote.setTheme(unoteSplit[0].split("=")[1]);
        try {
            userNote.setDate(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(unoteSplit[1].split("=")[1]));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        userNote.setEmail(unoteSplit[2].split("=")[1]);
        userNote.setMessage(unoteSplit[3].split("=")[1]);

        return userNote;
    }


    public boolean saveAll(List<Note> noteList) {
        Writer writer = null;
        try {
            String str = "";
            for (Note s : noteList) {
                str += s.toString() + "\n";
            }
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("notes.txt", false), "utf-8"));
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
