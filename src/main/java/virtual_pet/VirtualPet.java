package virtual_pet;

import java.util.Random;

public class VirtualPet {
    Random rand = new Random();
    int hungerLevel = 30;
    int thirstLevel = 30;
    int boredomLevel = 0;
    int tirednessLevel = 10;
    int healthLevel = 100;

    void tick() {
        hungerLevel = hungerLevel + 5;
        thirstLevel = thirstLevel + 5;
        boredomLevel = boredomLevel + 5;
        tirednessLevel = tirednessLevel + 5;
        int chanceTheTigerGetsSick = rand.nextInt(11);
        int chanceTheTigerGetsSick2 = rand.nextInt(11);
        int amountTigerGetsSick = rand.nextInt(76);
        if (chanceTheTigerGetsSick == chanceTheTigerGetsSick2) {
            healthLevel = healthLevel - amountTigerGetsSick;
            if (healthLevel < 0) {
                healthLevel = 0;
            }
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
}

