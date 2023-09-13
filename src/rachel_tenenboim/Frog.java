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
// Subclass Frog
public class Frog extends Animal implements Land, Water {
    
    private int numberOfLegs;

    public Frog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
        this.numberOfLegs = 2;
    }

    @Override
    public void sayHello(int mood) {
        if (mood == MOOD_HAPPY) {
            System.out.println("A happy frog say quack quack quack.");
        } else if (mood == MOOD_SCARE) {
            System.out.println("A scared frog plop into the water.");
        } 
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }
}
