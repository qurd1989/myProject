package duck;

import org.w3c.dom.ls.LSOutput;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("Im a model duck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
