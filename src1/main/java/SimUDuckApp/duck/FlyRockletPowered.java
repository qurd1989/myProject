package duck;

public class FlyRockletPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I`m flying with  a rocket");
    }
}
