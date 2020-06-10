package com.company.deed;

import java.util.Calendar;

public class Deed {

    private Student student=new Student();
    private static int counter=0;
    private int numOfDeed = ++counter;
    private Calendar dateOfCreating = Calendar.getInstance();
    private String characteristic = "У студента отсутствует характиристика";

    public Deed(String name,String faculty,int course,int yearOfEnrolling){
        student=new Student(name, faculty, course, yearOfEnrolling);
        if(course>Student.TRAINING_PERIOD){
            student.setStatus(StudentStatus.GRADUATED);
        }
    }

    public void changeFaculty(String faculty){
        if(student.getStatus()==StudentStatus.STUDYING) {
            student.setFaculty(faculty);
        }else{
            System.out.println("Студент выпущен");
        }
    }

    public boolean incCourse(){
        if(student.getStatus()==StudentStatus.STUDYING) {
            if (!student.incCourse()) {
                student.setStatus(StudentStatus.GRADUATED);
                return false;
            }else{
                return true;
            }
        }else{
            System.out.println("Студент выпущен");
            return false;
        }
    }

    public void changeCourse(int course){
        if(student.getStatus()==StudentStatus.STUDYING) {
            student.setCourse(course);
        }else{
            System.out.println("Студент выпущен");
        }
    }

    public void setCharacteristic(String characteristic){
        if(student.getStatus()==StudentStatus.STUDYING) {
            if (characteristic != null && !characteristic.isEmpty()) {
                this.characteristic = characteristic;
            }
        }else{
            System.out.println("Студент выпущен");
        }
    }

    public String getCharacteristic(){
        return characteristic;
    }

    public String getName(){
        return student.getName();
    }

    public String getFaculty(){
        return student.getFaculty();
    }

    public int getNumOfDeed(){
        return numOfDeed;
    }

    public int getCourse(){
        return student.getCourse();
    }

    public int getYearOfEnrolling(){
        return student.getYearOfEnrolling();
    }

    public StudentStatus getStatus(){
        return student.getStatus();
    }




    @Override
    public String toString(){
        String string=new String();
        string+="Дело создано " + dateOfCreating.getTime().toString()+"\n";
        string+="Номер дела " + numOfDeed+"\n";
        string+="Имя: " + student.getName()+"\n";
        string+="Факультет: " + student.getFaculty()+"\n";
        if(student.getStatus()==StudentStatus.STUDYING){
            string+="Курс: " + student.getCourse()+"\n";
        }
        string+="Год выпуска: " + student.getYearOfEnrolling()+"\n";
        string+="Состояние: " + student.getStatus()+"\n\n";
        string+="Характеристика:\n" + characteristic+"\n";
        return string;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        Deed other=(Deed) obj;

        return student.equals(other.student) && characteristic.equals(other.characteristic);
    }

    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+((characteristic==null)?0:characteristic.hashCode());
        result=prime*result+student.hashCode();

        return result;
    }
}