package com.ing.zoo.Animals;

import com.ing.zoo.Interfaces.IHerbivore;
import com.ing.zoo.abstractClasses.Animal;

public class Hippo extends Animal implements IHerbivore
{

    public Hippo()
    {
        super("samantha", "hoi daar", "hmm lekker");
    }

    public Hippo(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    public void eatLeaves()
    {
        if(hunger < 10) {
            incrementHunger();
            System.out.println(eatText);
        }
        else{
            System.out.println(name + "is not hungry");
        }
    }

    //public void PerformTrick lol
}
