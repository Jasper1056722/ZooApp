package com.ing.zoo.Animals;

import com.ing.zoo.Interfaces.ICarnivore;
import com.ing.zoo.Interfaces.IHerbivore;
import com.ing.zoo.Interfaces.ITrick;
import com.ing.zoo.abstractClasses.Animal;

public class Pig extends Animal implements IHerbivore, ICarnivore, ITrick
{
    public String trick;

    public Pig()
    {
        //realistic pig
        super("chubby charlie", "oink oink", "oink oink");
    }

    public Pig(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    public void eatLeaves()
    {
        if(hunger < 100000000)
        {
            incrementHunger();
            System.out.println(eatText);
        }
        else{
            System.out.println("impossible code block");
        }

    }

    public void eatMeat()
    {
        decreaseHunger();
        System.out.println("the pig ate himself");
    }

    public void performTrick()
    {
        System.out.println("Pigs cant perform tricks");
        decreaseHunger();
//        Random random = new Random();
//        int rnd = random.nextInt(2);
//        if(rnd == 0)
//        {
//            trick = "rolls in the mud";
//        }
//        else
//        {
//            trick = "runs in circles";
//        }
//        System.out.println(trick);
    }
}
