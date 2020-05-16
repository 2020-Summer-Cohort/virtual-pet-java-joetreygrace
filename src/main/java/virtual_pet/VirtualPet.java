package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPet {
    Random rand = new Random();
    int hungerLevel = 30;
    int thirstLevel = 30;
    int boredomLevel = 0;
    int tirednessLevel = 10;
    int healthLevel = 100;

    public void gameLoop() {
        while ((healthLevel > 0) && (hungerLevel < 100) && (tirednessLevel < 100) && (thirstLevel < 100) && (boredomLevel < 100)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tony the Tiger Cub");
            System.out.println("Hunger: " + hungerLevel);
            System.out.println("Thirst: " + thirstLevel);
            System.out.println("Boredom: " + boredomLevel);
            System.out.println("Tiredness: " + tirednessLevel);
            System.out.println("Health: " + healthLevel);
            System.out.println("");
            System.out.println("What do you want to do with your tiger cub?");
            System.out.println("1: Feed Tony");
            System.out.println("2: Give Tony Water");
            System.out.println("3: Play with Tony");
            System.out.println("4: Put Tony to bed");
            System.out.println("5: Take Tony to the Vet.");
            int userChoice = scanner.nextInt();
            interactWithTigerCub(userChoice);
            tick();
        }
    }

    public void tick() {
        hungerLevel = hungerLevel + 5;
        thirstLevel = thirstLevel + 5;
        boredomLevel = boredomLevel + 5;
        tirednessLevel = tirednessLevel + 5;
        int chanceTheTigerGetsSick = rand.nextInt(11);
        int chanceTheTigerGetsSick2 = rand.nextInt(11);
        int amountTigerGetsSick = rand.nextInt(76);
        if (chanceTheTigerGetsSick == chanceTheTigerGetsSick2) {
            healthLevel = healthLevel - amountTigerGetsSick;
            System.out.println("");
            System.out.println("Tony has gotten sick");
            System.out.println("");
        }
    }

    public void interactWithTigerCub(int userChoice) {
        if (userChoice == 1) {
            hungerLevel = (giveTigerFood(hungerLevel));
            System.out.println("");
            System.out.println("You fed Tony Carol Baskin's Ex-Husband.");
            System.out.println("");
        } else if (userChoice == 2) {
            thirstLevel = (giveTigerWater(thirstLevel));
            System.out.println("");
            System.out.println("You gave Tony some water.");
            System.out.println("");
        } else if (userChoice == 3) {
            boredomLevel = playWithYourTiger(boredomLevel);
            System.out.println("");
            System.out.println("You shot a music video with Tony.");
            System.out.println("");
        } else if (userChoice == 4) {
            tirednessLevel = putTigerToBed(tirednessLevel);
            System.out.println("");
            System.out.println("You put Tony to bed.");
            System.out.println("");
        } else if (userChoice == 5) {
            healthLevel = takeTigerToTheVet(healthLevel);
            System.out.println("");
            System.out.println("You took Tony to the Vet.");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("You entered an incorrect number:");
            System.out.println("");
        }
    }

    int takeTigerToTheVet(int healthLevel) {
        healthLevel = healthLevel + 50;
        if (healthLevel > 100) {
            healthLevel = 100;
        }
        return healthLevel;
    }

    int putTigerToBed(int tirednessLevel) {
        tirednessLevel = 0;
        return tirednessLevel;
    }

    int playWithYourTiger(int boredomLevel) {
        boredomLevel = boredomLevel - 25;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
        return boredomLevel;
    }


    int giveTigerWater(int thirstLevel) {
        thirstLevel = thirstLevel - 25;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
        return thirstLevel;
    }

    int giveTigerFood(int hungerLevel) {
        hungerLevel = hungerLevel - 25;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        return hungerLevel;
    }

    public void whyYouLost() {
        if (healthLevel == 0) {
            System.out.println("");
            System.out.println("Tony has gotten sick and died from lack of medical care.");
            System.out.println("Game Over.");
        } else if (hungerLevel == 100) {
            System.out.println("");
            System.out.println("Tony has gotten too hungry and bit your arm.");
            System.out.println("He was taken away by animal control.");
            System.out.println("Game Over.");
        } else if (thirstLevel == 100) {
            System.out.println("");
            System.out.println("Tony died from dehydration.");
            System.out.println("Game Over.");
        } else if (boredomLevel == 100) {
            System.out.println("");
            System.out.println("Tony has gotten too bored.");
            System.out.println("Tony escaped and went to Doc Antle's Tiger Reserve.");
            System.out.println("Game Over.");
        } else if (tirednessLevel == 100) {
            System.out.println("");
            System.out.println("Tony has gotten too sleepy and won't wake up from his nap.");
            System.out.println("Game Over.");
        }

    }
}

