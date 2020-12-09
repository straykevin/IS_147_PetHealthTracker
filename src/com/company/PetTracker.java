package com.company;

/*
Name: Kevin Khamfong
Email: kevink4@umbc.edu
 */



public class PetTracker {
    private static final String[] functions = new String[] {"Pet Health Journal", "Exit"};

    public static void welcome() {
        System.out.println("\nWelcome to the Pet Tracker!");
        System.out.println("\nWhat would you like to do in the pet tracker?");
        for (int i = 1; i < functions.length + 1; i++) {
            System.out.println("Enter " + i + ". " +  "to access " + functions[i - 1]);
        }


    }



    public static void returnPetDetails( Cat pet) {
        System.out.println("\nYour Cat's Details: ");
        System.out.println("Name: " + pet.getName());
        System.out.println("Age: " + pet.getAge() + " years old");
        System.out.println("Weight: " + Math.round(pet.getWeight()) + "lbs");
        System.out.println("Notes: " + pet.getNotes());
    }

    public static void returnPetDetails( GuineaPig pet) {
        System.out.println("\nYour Guinea Pig's Details: ");
        System.out.println("Name: " + pet.getName());
        System.out.println("Age: " + pet.getAge() + " years old");
        System.out.println("Weight: " + Math.round(pet.getWeight()) + "lbs");
        System.out.println("Notes: " + pet.getNotes());
    }

    public static void returnPetDetails( Pet pet) {
        System.out.println("\nYour Pet's Details: ");
        System.out.println("Name: " + pet.getName());
        System.out.println("Age: " + pet.getAge() + " years old");
        System.out.println("Weight: " + Math.round(pet.getWeight()) + "lbs");
    }
}
