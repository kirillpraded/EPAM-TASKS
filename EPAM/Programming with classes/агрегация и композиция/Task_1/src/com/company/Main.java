package com.company;
//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.
public class Main {

    public static void main(String[] args) {
        Word word = new Word("Introduction To Java");
        Text text = new Text(word);
        text.addSentence(new Sentence("Зарегистрируйтесь на training.by."));
        text.addSentence(new Sentence("Регистрация на training.by позволит вам при успешном окончании тренинга" +
                " пройти дальнейшее обучение на очных курсах Java Web Development и претендовать на место в Java-лаборатории."));
        text.printText();
    }
}
