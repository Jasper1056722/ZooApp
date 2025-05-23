package com.ing.zoo.Animals;

import com.ing.zoo.Interfaces.ITrick;
import com.ing.zoo.abstractClasses.Animal;
import com.ing.zoo.Interfaces.ICarnivore;
import java.util.Random;

public class Tiger extends Animal implements ICarnivore, ITrick
{
    public String trick;

    public Tiger(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    public Tiger()
    {
        super("Tiger", "Tiger HelloText", "Tiger EatText" );
    }

    @Override
    public void eatMeat()
    {
        if(hunger == 10){
            System.out.println("Hunger problems are solved in the world");
        }
        else{
            incrementHunger();
            System.out.println(eatText);
            System.out.println("grrr.... this is fine but i would have prefered human arms");
        }
    }

    @Override
    public void performTrick()
    {
        if(hunger == 0){
            System.out.println(name + " is too hungry to do a trick.");
            return;
        }
        decreaseHunger();
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
