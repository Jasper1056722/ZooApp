package com.ing.zoo.Animals;

import com.ing.zoo.Interfaces.IHerbivore;
import com.ing.zoo.abstractClasses.Animal;


public class Ant extends Animal implements IHerbivore
{
    public Ant(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    public Ant(){
        super("henk-jan-willem", "......", ".......");
    }

    public void eatLeaves()
    {
        if(hunger >= 10){
            System.out.println("ant got too big");
            return;
        }

        incrementHunger();
        System.out.println(name + " " + eatText);
    }

    @Override
    public void sayHello()
    {
        System.out.println("ants cant be heard too small");
    }
}
