package com.company;

public abstract class File {
    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    abstract public void printContext();

    abstract public void addContext(String addable);

    abstract public void changeName(String filename);

    abstract public void deleteContext();

    @Override
    public String toString() {
        return "File {" +
                "filename='" + filename + '\'' +
                '}';
    }
}
