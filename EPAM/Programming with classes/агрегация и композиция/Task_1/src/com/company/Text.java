package com.company;

import java.util.ArrayList;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
public class Text {
    private Word title;
    private ArrayList<Sentence> text;

    public Text(Word title) {
        this.title = title;
        this.text = new ArrayList<Sentence>();
    }

    public void getTitle() {
        System.out.println(title);
    }
    public void addSentence(Sentence sentence){
        text.add(sentence);
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public void printText(){
        System.out.println("\t\t\t\t\t\t\t " + title);
        for(Sentence sentence : text){
            System.out.print(sentence + " ");
        }
    }

    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }
}
