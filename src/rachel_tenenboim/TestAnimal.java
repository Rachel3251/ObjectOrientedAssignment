/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rachel_tenenboim;

/**
 *
 * @author user1
 */
public class TestAnimal {

    public static void main(String[] args) {
        Cat c = new Cat(true, true, 1);
        c.sayHello();
        c.sayHello(c.mood);
        c.mood = 2;
        c.sayHello(c.mood);
        System.out.println("the cat is mammals? " + c.isMammals());
        System.out.println("the cat is carnivorous? " + c.isCarnivorous());
        System.out.println("the cat has " + c.getNumberOfLegs() + " legs");

        Dog d = new Dog(true, true, 1);
        d.sayHello();
        d.sayHello(d.mood);
        d.mood = 2;
        d.sayHello(d.mood);
        System.out.println("the dog is mammals? " + d.isMammals());
        System.out.println("the dog is carnivorous? " + d.isCarnivorous());
        System.out.println("the dog has " + d.getNumberOfLegs() + " legs");

        Frog f = new Frog(false, false, 1);
        f.sayHello(f.mood);
        f.mood = 2;
        f.sayHello(f.mood);
        System.out.println("the frog is mammals? " + f.isMammals());
        System.out.println("the frog is carnivorous? " + f.isCarnivorous());
        System.out.println("the frog has " + f.getNumberOfLegs() + " legs");
        System.out.println("the frog hasGills ?" + f.hasGills());
        System.out.println("the frog hasLaysEggs? " + f.hasLaysEggs());
    }
}
