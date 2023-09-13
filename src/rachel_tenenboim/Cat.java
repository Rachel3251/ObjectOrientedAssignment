/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rachel_tenenboim;

// Subclass Cat
public class Cat extends Animal implements Land {

    private int numberOfLegs;

    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        this.numberOfLegs = 4;
    }

    @Override
    public void sayHello() {
        System.out.println("The cat say meow~.");
    }

    @Override
    public void sayHello(int mood) {
        if (mood == MOOD_HAPPY) {
            System.out.println("A happy cat say purr, purr.");
        } else if (mood == MOOD_SCARE) {
            System.out.println("A scared cat say hiss.");
        } 
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
