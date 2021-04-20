package model;

import java.util.Random;

public class Kotik {

    // calculations of cats
    public static int numb = 0;

    {
        numb++;
    }

    // cats' characteristics

    private int prettiness;
    private String name;
    private int weight;
    private String meow;

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    // cats makers

    public Kotik() {
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    // what do the cats do?

    private static int hungry;
    private static boolean done;

    public static boolean play() {
        if (hungry <= 0) {
            System.out.println("Feed me!");
            done = false;
        } else {
            System.out.println("I like to play!");
            hungry--;
            done = true;
        }
        return done;
    }

    public static boolean sleep() {
        if (hungry <= 0) {
            System.out.println("Feed me!");
            done = false;
        } else {
            System.out.println("Good morning!");
            hungry--;
            done = true;
        }
        return done;
    }

    public static boolean chaseMouse() {
        if (hungry <= 0) {
            System.out.println("Feed me!");
            done = false;
        } else {
            System.out.println("Look, I am a hunter!");
            hungry--;
            done = true;
        }
        return done;
    }

    public static boolean sitOnTheTable() {
        if (hungry <= 0) {
            System.out.println("Feed me!");
            done = false;
        } else {
            System.out.println("I do what I want!");
            hungry--;
            done = true;
        }
        return done;
    }

    public static boolean walk() {
        if (hungry <= 0) {
            System.out.println("Feed me!");
            done = false;
        } else {
            System.out.println("I like to meet wit other cats!");
            hungry--;
            done = true;
        }
        return done;
    }

    // how cats eat

    private int wellFed;
    private String food;

    public int getWellFed() {
        return wellFed;
    }

    public void setWellFed(int wellFed) {
        this.wellFed = wellFed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void eat(int wellFed) {
        this.wellFed = wellFed;
        System.out.println("I ate some Viskas!");
        hungry += wellFed;
    }

    public void eat(int wellFed, String food) {
        this.wellFed = wellFed;
        this.food = food;
        System.out.println("I ate some " + food + "!");
        hungry += wellFed;
    }

    public void eat() {
        eat(1, "some Fish");
    }

    public static void liveAnotherDay() {
        for (int j = 24; j > 0; j--) {

            int min = 1;
            int max = 5;
            int diff = max - min;
            Random random = new Random();
            int i = random.nextInt(diff + 1) + min;

            if (i == 1) {
                play();
            } else if (i == 2) {
                sleep();
            } else if (i == 3) {
                chaseMouse();
            } else if (i == 4) {
                sitOnTheTable();
            } else walk();
        }
    }
}
