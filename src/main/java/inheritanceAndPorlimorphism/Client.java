package inheritanceAndPorlimorphism;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {

        System.out.println(-8 % 7);
        System.out.println(Math.floorMod(-8,7));
        // Make a call to display method as per question requirements here
    }
    static void display(Iterable stack) {
        for (Object n : stack ){
            System.out.println(n);
        }
    }
    // Write the display method as per requirements of question here

}