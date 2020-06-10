package com.company;

public class Directory {
    private File file;

    public Directory(File file) {
        this.file = file;
    }

    public Directory() {
    }
    public void createFile(String name){
        file = new TextFile(name);
    }
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
