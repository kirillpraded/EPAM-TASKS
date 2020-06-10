package com.company.users;

import com.company.deed.Archive;
import com.company.deed.Deed;

import java.util.List;

public class User {

    protected static Archive archive=new Archive();
    private String login="New user";
    private String password;

    protected User(String login,String password){
        setLogin(login);
        if(password!=null && !password.isEmpty()){
            this.password=password;
        }
    }

    public void setLogin(String login){
        if(login!=null && !login.isEmpty()){
            this.login=login;
        }
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public List<Deed> findDeedByCourse(int course){
        return archive.findDeedByCourse(course);
    }

    public List<Deed> findDeedByFaculty(String faculty){
        return archive.findDeedByFaculty(faculty);
    }



    public List<Deed> findDeedByYear(int year){
        return archive.findDeedByYear(year);
    }

    public boolean isAdmin(){
        return false;
    }

    public Archive getArchive(){
        return archive;
    }

    @Override
    public String toString(){
        return String.format("%20s %15s %15s",login,encryptPassword(),(isAdmin())?"Администратор":"Пользователь");
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        User other=(User) obj;

        return login.equals(other.login) && isAdmin()==other.isAdmin();
    }

    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+((login==null)?0:login.hashCode());
        result=prime*result+Boolean.hashCode(isAdmin());
        return result;
    }

    private String encryptPassword(){
        String string=new String();
        for(int i=0;i<password.length();i++){
            string+="*";
        }
        return string;
    }
}
