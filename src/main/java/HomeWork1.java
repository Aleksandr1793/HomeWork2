package main.java;

public class HomeWork1 {
    public static void main(String[] args) {
        Cart cart1 = new Cart("Chto imeet dyrku", new String[]{"ponchik","Shaverma"}, 0);
        Cart cart2 = new Cart("WHat eat man", new String[]{"ponchik","Shaverma", "Meet"}, 2);



        Cart[] carts = new Cart[]{cart1, cart2};
        MessageSender messageSender = new MessageSender( );
        Erudite erudite=new Erudite(carts, messageSender);
        erudite.start();





    }
}


////
