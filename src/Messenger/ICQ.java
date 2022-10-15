package Messenger;

import java.util.ArrayList;

class ICQ implements Chat {
    String nameChatroom;
    User user;
    ArrayList<User> users = new ArrayList<>();
    @Override
    public void createChat(String nameChatroom) {
        this.nameChatroom = nameChatroom;
        System.out.println("Создана комната >>> " + nameChatroom);
    }
    @Override
    public void appendUser(User user) {

        System.out.println("Добавился " + user.getName() + " в комнату " + nameChatroom);
        users.add(user);
    }
    public void online(String nameChatroom){
        for (int i = 0; i<users.size(); i++){
            System.out.println("Онлайн >>>>> " + users.get(i).getName());
        }
    }
}

