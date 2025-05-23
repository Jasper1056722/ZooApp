package com.ing.zoo.Animals;

import com.ing.zoo.abstractClasses.Animal;
import com.ing.zoo.Interfaces.ICarnivore;

public class Lion extends Animal implements ICarnivore
{
    public Lion()
    {
        //realistic pig
        super("herman", "rawr", "nom nom");
    }

    public Lion(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    @Override
    public void eatMeat()
    {
        if(hunger < 10) {
            incrementHunger();
            System.out.println(eatText);
        }
        else{
            System.out.println(name + "is not hungry");
        }
    }

    @Override
    public void sayHello()
    {
        decreaseHunger();
        System.out.println(helloText + " rawrrawrrawrrawrrawrrawrrawrrawrrawrrawrrawrrawrrawrrawr");
    }
}
