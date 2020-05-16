package virtual_pet;

import java.util.Scanner;

public class VirtualPet {
    int hungerLevel = 30;
    int thirstLevel = 30;
    int boredomLevel = 0;
    int tirednessLevel = 10;
    int healthLevel = 100;

    public void gameLoop() {
        while ((healthLevel > 0) && (hungerLevel < 100) && (thirstLevel < 100) && (boredomLevel < 100)) {
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
        }
    }

    void interactWithTigerCub(int userChoice) {
        if (userChoice == 1) {
            hungerLevel = (giveTigerFood(hungerLevel));
            System.out.println("You fed Tony Carol Baskins Ex-Husband");
            System.out.println("");
        } else if (userChoice == 2) {
            thirstLevel = (giveTigerWater(thirstLevel));
            System.out.println("You gave Tony some water");
            System.out.println("");
        } else if (userChoice == 3) {
            boredomLevel = playWithYourTiger(boredomLevel);
            System.out.println("You shot a music video with Tony");
            System.out.println("");
        } else if (userChoice == 4) {
            tirednessLevel = putTigerToBed(tirednessLevel);
            System.out.println("You put Tony to bed");
            System.out.println("");
        }
    }

    int putTigerToBed(int tirednessLevel) {
        tirednessLevel = tirednessLevel - 25;
        return tirednessLevel;
    }

    int playWithYourTiger(int boredomLevel) {
        boredomLevel = boredomLevel - 25;
        return boredomLevel;
    }


    int giveTigerWater(int thirstLevel) {
        thirstLevel = thirstLevel - 25;
        return thirstLevel;
    }

    int giveTigerFood(int hungerLevel) {
        hungerLevel = hungerLevel - 25;
        return hungerLevel;
    }

}

