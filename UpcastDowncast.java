package com.company;

class Animal{
    String name;
    public void makeNoise(){
        System.out.println("Just a animal");
    }

}
class Dog extends Animal{
    @Override
    public  void makeNoise(){
        System.out.println("woof woof");
    }

    public void growl(){
        System.out.println("Grrrr");
    }
}

class Cat extends Animal{
    @Override
    public  void makeNoise(){
        System.out.println("mew");
    }

    public void meow(){
        System.out.println("maaaoooo");
    }
}



public class UpcastDowncast {
    public static void animalsound(Animal animal){//taking the whole animal object and then we will cast it according to the requirement.
        animal.makeNoise();//In upcasting we will get the method of child not parent
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;//down casting Dog from animal
            dog.growl();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;//down casting cat from animal
            cat.meow();
        }

    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name="zebra";
        System.out.println(animal.name);
        animal.makeNoise();

        //upcasting
        Animal Lab = new Dog();//we do this implicitly
        //giving the properties of Dog class(child) to the parent
        Lab.name = "jerry";
        System.out.println(Lab.name);
        animalsound(Lab);

        Animal Bob = new Cat();
        Bob.name = "kiwi";
        System.out.println(Bob.name);
        animalsound(Bob);

        //downcasting
        Dog doberman = new Dog();
        animalsound(doberman);

        Cat cat = new Cat();
        animalsound(cat);
    }
}

