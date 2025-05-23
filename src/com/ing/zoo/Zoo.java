package com.ing.zoo;

import java.util.List;
import java.util.ArrayList;
import com.ing.zoo.Animals.*;
import com.ing.zoo.Interfaces.ICarnivore;
import com.ing.zoo.Interfaces.IHerbivore;
import com.ing.zoo.Interfaces.ITrick;
import com.ing.zoo.abstractClasses.Animal;
import java.util.Scanner;

public class Zoo {

    public static void allSayHello(List<Animal> zooAnimals)
    {
        for( Animal animal : zooAnimals){
            animal.sayHello();
        }
    }

    public static void feedAllHerbs(List<Animal> zooAnimals){
        for( Animal animal : zooAnimals){
            if(animal instanceof IHerbivore){
                ((IHerbivore) animal).eatLeaves();
            }
        }
    }

    public static void feedAllCarnivores(List<Animal> zooAnimals){
        for( Animal animal : zooAnimals){
            if(animal instanceof ICarnivore){
                ((ICarnivore) animal).eatMeat();
            }
        }
    }

    public static void doAllTricks(List<Animal> zooAnimals){
        for( Animal animal : zooAnimals){
            if(animal instanceof ITrick){
                ((ITrick) animal).performTrick();
            }
        }
    }

    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        //cant perform on no diet
        wally.eatMeat();
        Zebra marty = new Zebra();
        marty.name = "marty";
        Ostrich harvy = new Ostrich("Harvy", "kawk", "nom kawk");
        harvy.Fly();
        harvy.Land();
        Ant marky = new Ant();
        marky.name = "marky";

        List<Animal> zooAnimals = new ArrayList<>();
        zooAnimals.add(henk);
        zooAnimals.add(elsa);
        zooAnimals.add(dora);
        zooAnimals.add(wally);
        zooAnimals.add(marty);
        zooAnimals.add(harvy);
        zooAnimals.add(marky);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.startsWith(commands[0].toLowerCase()))
        {
            String foundName = input.substring(5).trim();
            for( Animal animal : zooAnimals){
                if(animal.name.equalsIgnoreCase(foundName)){
                    animal.sayHello();
                    return;
                }
            }
            allSayHello(zooAnimals);
        }
        else if(input.equals(commands[1].toLowerCase())) {
            feedAllHerbs(zooAnimals);
        }
        else if(input.equals(commands[2].toLowerCase())){
            feedAllCarnivores(zooAnimals);
        }
        else if(input.equals(commands[3].toLowerCase())){
            doAllTricks(zooAnimals);
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
