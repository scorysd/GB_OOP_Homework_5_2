package Messenger;

public class Message {
     User user;
     String text;
     public Message(User user, String text){
         this.user = user;
         this.text = text;
     }
     public void sendMessage(){
         System.out.println(text);
     }

}
