package duck;

public class MallardDuck extends Duck {

   public MallardDuck(){
       quackBehavior = new Quack();
       flyBehavior = new FlyWithWrings();
   }

    @Override
    public void display() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
