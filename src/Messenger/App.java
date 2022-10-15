package Messenger;

public class App {
    public static void main(String[] args) {
        ICQ ICQ = new ICQ();
        ICQ.createChat("Speak");
        User user1 = new User(1, "Petya");
        User user2 = new User(2, "Vanya");
        User user3 = new User(3, "Masha");
        User user4 = new User(4, "Vova");
        ICQ.appendUser(user1);
        ICQ.appendUser(user2);
        ICQ.appendUser(user3);
//        Messenger.ICQ.appendUser(user4);
        ICQ.online("Speak");
        user2.sendMessage("Hello");
        user3.sendMessage("Hi");
        user4.sendMessage("How are you?");

    }

}
