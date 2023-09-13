/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rachel_tenenboim;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 *
 * @author user1
 */
// Abstract class Animal
public abstract class Animal {

    protected boolean mammals;
    protected boolean carnivorous;
    public final int MOOD_HAPPY = 1;
    public final int MOOD_SCARE = 2;
    protected int mood;

    public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    public abstract void sayHello(int mood);

    public void sayHello() {

    };
    
    public boolean isMammals() {
        return mammals;
    }

    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }
}
