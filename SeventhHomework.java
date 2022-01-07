/**
 *   Java 1. Homework #7
 *
 *   @author Andrei Boiko
 *   @version 07/01/2022
*/

class SeventhHomework {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Barsik", 5),
            new Cat("Murzik", 10),
            new Cat("Pusik", 20),
            new Cat("Tom", 20),
        };
        Plate plate = new Plate(50);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.addFood(50);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}


class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    public void setFullness(boolean status) {
        fullness = status;
    }

    @Override
    public String toString() {
        return "Кот: " + name + ", аппетит: " + appetite + ", сытость: " + fullness;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        if (n > food) {
            return false;
        } else {
        food -= n;
        return true;
        }
    }

    void addFood(int food) {
        if (this.food <= food) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Еды: " + food;
    }
}