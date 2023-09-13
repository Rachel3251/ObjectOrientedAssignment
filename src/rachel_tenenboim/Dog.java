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

// Subclass Dog
public class Dog extends Animal implements Land {
    private int numberOfLegs;

    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood); 
        this.numberOfLegs = 4;
    }

    @Override
    public void sayHello() {
        System.out.println("The dog wagging its tails.");
    }

    @Override
    public void sayHello(int mood) {
        if (mood == MOOD_HAPPY) {
            System.out.println("A happy dog bark loudly.");
        } else if (mood == MOOD_SCARE) {
            System.out.println("A scared dog say whooping");
        }
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}