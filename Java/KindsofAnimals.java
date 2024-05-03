/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author vince
 */
public class AnimalHouse {

    abstract class Animal {
        abstract void eat();
    }

    interface Flyable {
        void fly();
    }

    interface Runnable {
        void run();
    }

    class Bird extends Animal implements Flyable {
        public void eat() {
            System.out.println("Flying animals is eating...");
        }

        public void fly() {
            System.out.println("Flying animals is flying...");
        }
    }

    class Land extends Animal implements Runnable {
        public void eat() {
            System.out.println("Land animals is eating...");
        }

        public void run() {
            System.out.println("Land animals is running");
        }
    }

    class Sea extends Animal {
        public void eat() {
            System.out.println("Sea animals is eating...");
        }
    }

    class Zoo {
        private List<Animal> animals;

        public Zoo() {
            animals = new ArrayList<>();
        }

        public void addAnimal(Animal animal) {
            animals.add(animal);
        }

        public void commandAllToEat() {
            for (Animal animal : animals) {
                animal.eat();
            }
        }

        public void commandAllToFly() {
            for (Animal animal : animals) {
                if (animal instanceof Flyable) {
                    ((Flyable) animal).fly();
                }
            }
        }

        public void commandAllToRun() {
            for (Animal animal : animals) {
                if (animal instanceof Runnable) {
                    ((Runnable) animal).run();
                }
            }
        }
    }

    public static void main(String[] args) {
        AnimalHouse s = new AnimalHouse();
        Zoo zoo = s.new Zoo();

        Bird bird = s.new Bird();
        Land land = s.new Land();
        Sea sea = s.new Sea();

        zoo.addAnimal(bird);
        zoo.addAnimal(land);
        zoo.addAnimal(sea);

        System.out.println("All animals to eat...");
        zoo.commandAllToEat();

        System.out.println("\nAll animals to fly...");
        zoo.commandAllToFly();

        System.out.println("\nAll animals to run...=");
        zoo.commandAllToRun();
    }
}