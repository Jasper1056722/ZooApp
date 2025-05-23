package com.ing.zoo.abstractClasses;

public abstract class Bird extends Animal{

    public Bird(String name, String helloText, String eatText)
    {
        super(name, helloText, eatText);
    }

    protected boolean isFlying = false;

    public void Fly()
    {
        isFlying = true;
    }

    public void Land()
    {
        isFlying = false;
    }
}
