package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.go();
        hare.tryEat(ball);
        ball.go();
        wolf.tryEat(ball);
        ball.go();
        fox.Eat(ball);
    }
}
