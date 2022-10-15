package Messenger;

public interface Chat {

    void createChat(String nameChatroom);

    void appendUser(User user);
    void online(String nameChatroom);
}
