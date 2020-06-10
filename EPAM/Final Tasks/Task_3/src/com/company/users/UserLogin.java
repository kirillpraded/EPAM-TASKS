package com.company.users;

public class UserLogin {

    private static String password="JHerc4kf#@dsvS2020";
//если пользователь вводит пароль доступа - логинится как админ, иначе - как обычный пользователь
    public User getUser(String password, String login){
        if(password.equals(password)) {
            return new Admin(login, password);
        }
        return new User(login,password);

    }

}
