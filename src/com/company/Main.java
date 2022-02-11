package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setBreed("Forel");
        fish.setAge((byte) 1);
        fish.setWeight(2.3f);
        fish.setHeight(0.4f);
        fish.setColor("Grey");

        System.out.println("  Fish Class");
        System.out.println("Fish breed:  " + fish.getBreed() + "\n" + "Fish age: " + fish.getAge() + "\n" +
                "Fish weight: " + fish.getWeight() + "\n" + "Fish height: " + fish.getHeight() + "\n" +
                "Fish color:  " + fish.getColor() + "\n\n");


        Parrot parrot = new Parrot();
        parrot.setBreed("Blue Macaw");
        parrot.setAge((byte) 17);
        parrot.setColor("Blue");
        parrot.setHeight(0.35f);
        parrot.setWeight(2.4f);
        parrot.setName("Rio");
        parrot.setFly(true);

        System.out.println("  Parrot Class");
        System.out.println("Parrot name:  " + parrot.getName() + "\n" + "Parrot breed: " + parrot.getBreed() + "\n" +
                "Parrot age:   " + parrot.getAge() + "\n" + "Parrot color: " + parrot.getColor() + "\n" +
                "Parrot height: " + parrot.getHeight() + "\n" + "Parrot weight: " + parrot.getWeight() + "\n" +
                "Parrot fly?   " + parrot.getFly() + "\n\n");


        Cat cat = new Cat();
        cat.setName("Tomas");
        cat.setBreed("Munchkin");
        cat.setAge((byte) 2);
        cat.setColor("Brown");
        cat.setHeight(0.5f);
        cat.setWeight(3.5f);

        System.out.println("  Cat Class");
        System.out.println("Cat name: " + cat.getName() + "\n" + "Cat breed: " + cat.getBreed() + "\n" +
                "Cat age: " + cat.getAge() + "\n" + "Cat color: " + cat.getColor() + "\n" + "Cat height: " +
                cat.getHeight() + "\n" + "Cat weight: " + cat.getWeight() + "\n\n");


        Dog dog = new Dog();
        dog.setName("Barsik");
        dog.setBreed("Ovcharka");
        dog.setAge((byte) 4);
        dog.setColor("Dark-Brown");
        dog.setHeight(0.85f);
        dog.setWeight(20);

        System.out.println("  Dog Class");
        System.out.println("Dog name: " + dog.getName() + "\n" + "Dog breed: " + dog.getBreed() + "\n" +
                "Dog age: " + dog.getAge() + "\n" + "Dog color: " + dog.getColor() + "\n" +
                "Dog height: " + dog.getHeight() + "\n" + "Dog weight: " + dog.getWeight() + "\n\n");

    }
}
