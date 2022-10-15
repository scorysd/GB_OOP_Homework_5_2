package Messenger;

import java.util.ArrayList;

class User {
    String name;
    Integer id;
    ArrayList<User> users;

    public User(Integer id, String name) {
        this.name = name;
        this.id = id;

    }
    protected String getName(){
        return name;
    }
    public void sendMessage(String text) {
        if (users.equals(getName()))
        System.out.println(getName() + " >>>>>> " +  text);
    }
}

//    public Messenger.User CreateUser(String fistName) {
//        int id = Messenger.DBUser.getLastId();
//        return new Messenger.User(id, fistName);
//    }
//}