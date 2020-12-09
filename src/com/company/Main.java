package com.company;

import java.util.Scanner;
import java.time.LocalDate;

/*
Name: Kevin Khamfong
Email: kevink4@umbc.edu
 */

public class Main {



    public static void main(String[] args) {
        String name;
        String selection;

        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        System.out.printf("Today's Date: " + date);
        System.out.println("\nHello, welcome to your personal pet tracker.");

        System.out.print("Please enter your name: ");
        name = input.next();

        System.out.println("\nWelcome, " + name);
        System.out.println("What would you like to do today?");
        for (int i = 1; i < FunctionManager.getFunctions().length + 1; i++) {
            System.out.println("Enter " + i + ". " +  "to access " + FunctionManager.getFunctions()[i - 1]);
        }
        selection = input.next();

        switch(selection) {
            case "1":
                PetTracker.welcome();
                selection = input.next();

                switch(selection) {
                    case "1":
                        System.out.println("Please enter your pet's name");
                        String petName = input.next();
                        System.out.println("Please enter your pet's age in years");
                        byte petAge = input.nextByte();
                        System.out.println("Please enter your pet's weight in lb.");
                        float petWeight = input.nextFloat();

                        System.out.println("What kind of animal is " + petName);
                        System.out.println("Available Options: \nGuineaPig \nCat\n");

                        selection = input.next();


                        if (selection.toLowerCase().equals("cat")) {
                            System.out.println("You've selected a cat");
                            Cat cat = new Cat();
                            cat.setName(petName);
                            cat.setAge(petAge);
                            cat.setWeight(petWeight);

                            PetTracker.returnPetDetails(cat);
                        } else if (selection.toLowerCase().equals("guineapig")) {
                            System.out.println("You've selected a Guinea Pig");
                            GuineaPig guineaPig = new GuineaPig();
                            guineaPig.setName(petName);
                            guineaPig.setAge(petAge);
                            guineaPig.setWeight(petWeight);

                            PetTracker.returnPetDetails(guineaPig);
                        } else {
                            System.out.println("Unknown Animal Type. You can still continue, however.");
                            Pet pet = new Pet(petName, petAge, petWeight);

                            PetTracker.returnPetDetails(pet);
                        }



                        break;
                    case "2":
                        System.out.println("Now leaving application... Thank you for your patronage.");
                        break;
                }

                break;
            case "2":
                System.out.println("Now leaving application... Thank you for your patronage.");
                break;
        }

    }
}
