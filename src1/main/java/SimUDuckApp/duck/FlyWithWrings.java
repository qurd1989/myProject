package duck;

public class FlyWithWrings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Im can fly!");
    }
}
