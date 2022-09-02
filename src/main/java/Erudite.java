package main.java;

public class Erudite {


    private final Cart[] carts;
    private final MessageSender messageSender;

    public Erudite(Cart[] carts, MessageSender messageSender) {

        this.carts = carts;
        this.messageSender = messageSender;
    }

    public void start() {

        messageSender.send(" Privet");

        for (Cart cart : carts) {
            messageSender.send(cart.getQustion());


        }

    }
}


//
// создать класс подсчет переменных( верных и неверных ответов)
//// создать класс Отпарвка сообщений ( отдлельно или вместе)



