import java.util.ArrayList;
import java.util.List;

// Посредник
public class Mediator {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        Admin admin = new Admin(chat,"admin");

        UserMediator user1 = new SimpleUser(chat, "user1");
        UserMediator user2 = new SimpleUser(chat, "user12");

        chat.setAdmin(admin);


    }
}

interface Chat {
    void sendMessage(String name, UserMediator user);
}
 interface UserMediator {
    void sendMessage(String message);
    void getMessage(String message);
}

class Admin implements UserMediator {

    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + "received message" + message);
    }
}

class SimpleUser implements UserMediator {
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + "received message" + message);
    }
}

class SimpleTextChat implements Chat {
    Admin admin;
    List<UserMediator> users = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUserToChat(UserMediator user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, UserMediator user) {
        for (UserMediator userMediator : users) {
            if (userMediator != user) {
                userMediator.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}



