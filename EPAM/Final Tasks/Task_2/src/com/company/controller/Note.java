package com.company.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Note implements Comparator<Note> {
    private String theme;
    private Date date;
    private String email;
    private String message;

    public Note(String theme, Date date, String email, String message) {
        this.theme = theme;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public Note() {
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        return "Тема=" + theme + "|" + ", Дата=" + strDate + "|" + ", Почта=" + email + "|" + ", Текст=" + message
                    + "|";
    }

    @Override
    public int compare(Note o1, Note o2) {
        int strInt = o1.getTheme().compareTo(o2.getTheme());
        if (strInt != 0) {
            return strInt;
        }return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(theme, note.theme) &&
                Objects.equals(date, note.date) &&
                Objects.equals(email, note.email) &&
                Objects.equals(message, note.message);
    }

    @Override
    public int hashCode() {
        /*
        int result = theme != null ? theme.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
        */
        return Objects.hash(theme, date, email, message);
    }
}
