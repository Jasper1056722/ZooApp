package com.ing.zoo.abstractClasses;

//im using inheritance because it removes the need for duplication of so much code
public abstract class Animal {

    public String name;
    protected String helloText;
    protected String eatText;
    protected int hunger;

    public Animal(String name, String helloText, String eatText)
    {
        this.name = name;
        this.helloText = helloText;
        this.eatText = eatText;
        hunger = 0;
    }

    protected void decreaseHunger()
    {
        hunger--;
        if(hunger < 0)
        {
            hunger = 0;
        }
    }

    protected void incrementHunger()
    {
        hunger++;
        if(hunger > 10)
        {
            hunger = 10;
        }
    }

    public void sayHello()
    {
        System.out.println(helloText);
        decreaseHunger();
    }
}
