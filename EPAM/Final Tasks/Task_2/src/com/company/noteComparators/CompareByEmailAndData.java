package com.company.noteComparators;

import com.company.controller.Note;

import java.util.Comparator;
import java.util.Date;

public class CompareByEmailAndData implements Comparator<Note> {
    @Override
    public int compare(Note o1, Note o2) {
        Date date1 = o1.getDate();
        Date date2 = o2.getDate();
        int rez = o1.getEmail().compareTo(o2.getEmail());
        if (rez != 0) {
            return rez;
        }
        int strInt = date1.compareTo(date2);
        if (strInt != 0) {
            return strInt;
        }
        return 0;
    }
}
