package com.company;

/*
Name: Kevin Khamfong
Email: kevink4@umbc.edu
 */

public class Pet {
    private String name;
    private byte age;
    private float weight;

    public Pet(){}

    public Pet(String name, byte age, float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
         return this.name;
    }
    public byte getAge() {
        return this.age;
    }
    public float getWeight() {
        return this.weight;
    }
    public void setName(String name) { this.name = name;}
    public void setAge(byte age) {this.age = age;}
    public void setWeight(float weight) {
        this.weight = weight;
    }



}

class Cat extends Pet {
    String notes = "A vet visit is required every few years, especially if your cat tends to be in the outdoors.";

    public Cat(){
        super();
    }

    public String getNotes(){
        return this.notes;
    }

}
class GuineaPig extends Pet {
    String notes = "Make sure you have 8sq ft of moving room for your guinea pig!";

    public GuineaPig(){
        super();
    }

    public String getNotes(){
        return this.notes;
    }
}
