package duck;

import org.w3c.dom.ls.LSOutput;

public  abstract class Duck implements FlyBehavior, QuackBehavior{

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public Duck() {}

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public  void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    public  void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void swim(){
        System.out.println("All ducks  float, even decoys");
    }

    }

