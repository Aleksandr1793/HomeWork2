package main.java;

public class Cart {
    private final  String qustion;
    private final String[] answers;
    private final int rightAnswerIndex;



    public Cart(String qustion1, String[] answers, int rightAnswerIndex) {
        this.qustion = qustion1;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;

    }
    public String getQustion(){
        return qustion;
    }





}
