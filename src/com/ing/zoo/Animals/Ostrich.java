package com.ing.zoo.Animals;

import com.ing.zoo.Interfaces.ICarnivore;
import com.ing.zoo.Interfaces.IHerbivore;
import com.ing.zoo.abstractClasses.Bird;

public class Ostrich extends Bird implements ICarnivore, IHerbivore
{
    public Ostrich()
    {
        super("Albert", "bruv", "noms");
    }

    public Ostrich(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    @Override
    public void eatMeat()
    {
        if(hunger >= 10) {
            System.out.println("this fella has had enough food");
            return;
        }

        incrementHunger();
        if(isFlying)
        {

            System.out.println(name + "can also eat while flying");
            System.out.println(eatText);
        }
        else{
            System.out.println(eatText);
        }
    }

    @Override
    public void sayHello()
    {
        if(isFlying)
        {
            System.out.println(name + "is not hearable from that far up");
        }
        else{
            System.out.println(helloText);
        }
        decreaseHunger();
    }

    @Override
    public void eatLeaves()
    {
        if(hunger == 10) {
            System.out.println("this fella has had enough food");
            return;
        }

        incrementHunger();
        if(isFlying)
        {

            System.out.println(name + "can also eat while flying");
            System.out.println(eatText);
        }
        else{
            System.out.println(eatText);
        }
    }
}
