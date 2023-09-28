package pratice.oop;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoways();
        //quackBehavior = new Squeak();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
