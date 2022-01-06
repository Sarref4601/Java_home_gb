/**
 *   Java 1. Homework #6
 *
 *   @author Andrei Boiko
 *   @version 06/01/2022
 */
class SixthHomework {
    public static void main(String[] args) {
        IAnimal cat = new Cat("Котяра", 0, 200);
        IAnimal dog = new Dog("Пёс", 10, 500);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.swim(5));
            System.out.println(animal.run(150));
        }
    }
}

class Cat extends Animal {
    Cat(String name, int maxSwimDistance, int maxRunDistance) {
        super(name, maxSwimDistance, maxRunDistance);
    }
}

class Dog extends Animal {
    Dog(String name, int maxSwimDistance, int maxRunDistance) {
        super(name, maxSwimDistance, maxRunDistance);
    }
}

    interface IAnimal {
        String swim(int swimDistance);
        String run(int runDistance);
    }

abstract class Animal implements IAnimal {
    protected String name;
    protected int maxSwimDistance;
    protected int maxRunDistance;

    Animal(String name, int maxSwimDistance, int maxRunDistance) {
        this.name = name;
        this.maxSwimDistance = maxSwimDistance;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public String toString() {
        return name + ", Проплыть: " + maxSwimDistance + "м " + ", Пробежать: " + maxRunDistance + "м";
    }

    @Override
    public String swim(int swimDistance) {
        if (swimDistance < maxSwimDistance) {
            return name + " проплыл!";
        } else {
            return name + " не смог проплыть...";
        }
    }

    @Override
    public String run(int runDistance) {
        if (runDistance < maxRunDistance) {
            return name + " пробежал!";
        } else {
            return name + " не смог пробежать...";
        }
    }
}