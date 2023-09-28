package pratice.oop;

public class DecoyDuck  extends  Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoways());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
