abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("The animal is sleeping");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }

    @Override
    public void play() {
        System.out.println("The dog plays fetch");
    }
}

class Cat extends Animal implements Pet {
    @Override
    void sound() {
        System.out.println("The cat meows");
    }

    @Override
    public void play() {
        System.out.println("The cat plays with a ball of yarn");
    }
}

public class abstract_interfaces {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        Pet petDog = new Dog();
        petDog.play();

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();

        Pet petCat = new Cat();
        petCat.play();
    }
}
