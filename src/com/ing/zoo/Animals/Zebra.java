package com.ing.zoo.Animals;

import com.ing.zoo.Interfaces.IHerbivore;
import com.ing.zoo.Interfaces.ITrick;
import com.ing.zoo.abstractClasses.Animal;

public class Zebra extends Animal implements IHerbivore, ITrick
{
    public Zebra(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    public Zebra()
    {
        super("Zebra", "Zebra HelloText", "Zebra EatText" );
    }

    @Override
    public void eatLeaves()
    {
        if(hunger == 10){
            System.out.println("im full homie");
        }
        else{
            incrementHunger();
            System.out.println(eatText);
        }
    }

    @Override
    public void performTrick()
    {
        if(hunger == 10){
            System.out.println(name + " is too fat to perform a trick");
        }
        else if(hunger == 0){
            System.out.println("cant move man.... too hungry");
        }
        else{
            System.out.println(name + "Jumped trough hoop!");
        }
    }
}
