package com.company;

public class TextFile extends File{
    private String context;

    public TextFile(String filename) {
        super(filename);
        this.context = "";
    }

    public TextFile(String filename, String context) {
        super(filename);
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    @Override
    public void printContext() {
        System.out.println("Содержимое текстового файла: "+context);
    }

    @Override
    public void addContext(String addable){
        context = context+addable;
        System.out.println("Успешно добавлено: " + context);
    }

    @Override
    public void deleteContext(){
        context = "";
        System.out.println("Содержание текстового файла успешно удалено");
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public void changeName(String filename) {
        this.setFilename(filename);
    }
}
