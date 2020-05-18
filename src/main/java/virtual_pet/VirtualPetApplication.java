package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        gameLoop();
    }

    public static void gameLoop() {
        VirtualPet tigerCub = new VirtualPet();
        while ((tigerCub.healthLevel > 0) && (tigerCub.hungerLevel < 100) && (tigerCub.tirednessLevel < 100) && (tigerCub.thirstLevel < 100) && (tigerCub.boredomLevel < 100)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tony the Tiger Cub");
            System.out.println("Hunger: " + tigerCub.hungerLevel);
            System.out.println("Thirst: " + tigerCub.thirstLevel);
            System.out.println("Boredom: " + tigerCub.boredomLevel);
            System.out.println("Tiredness: " + tigerCub.tirednessLevel);
            System.out.println("Health: " + tigerCub.healthLevel);
            System.out.println("");
            System.out.println("What do you want to do with your tiger cub?");
            System.out.println("1: Feed Tony");
            System.out.println("2: Give Tony Water");
            System.out.println("3: Play with Tony");
            System.out.println("4: Put Tony to bed");
            System.out.println("5: Take Tony to the Vet.");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                tigerCub.hungerLevel = (tigerCub.giveTigerFood(tigerCub.hungerLevel));
                System.out.println("");
                System.out.println("You fed Tony Carol Baskin's Ex-Husband.");
                System.out.println("");
            } else if (userChoice == 2) {
                tigerCub.thirstLevel = (tigerCub.giveTigerWater(tigerCub.thirstLevel));
                System.out.println("");
                System.out.println("You gave Tony some water.");
                System.out.println("");
            } else if (userChoice == 3) {
                tigerCub.boredomLevel = tigerCub.playWithYourTiger(tigerCub.boredomLevel);
                System.out.println("");
                System.out.println("You shot a music video with Tony.");
                System.out.println("");
            } else if (userChoice == 4) {
                tigerCub.tirednessLevel = tigerCub.putTigerToBed(tigerCub.tirednessLevel);
                System.out.println("");
                System.out.println("You put Tony to bed.");
                System.out.println("");
            } else if (userChoice == 5) {
                tigerCub.healthLevel = tigerCub.takeTigerToTheVet(tigerCub.healthLevel);
                System.out.println("");
                System.out.println("You took Tony to the Vet.");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("You entered an incorrect number:");
                System.out.println("");
            }
            tigerCub.tick();
            if (tigerCub.healthLevel < 100) {
                System.out.println("Tony has gotten sick");
                System.out.println("");
            }
            if (tigerCub.healthLevel <= 0) {
                System.out.println("Tony has gotten sick and died from lack of medical care.");
                System.out.println("Game Over.");
            } else if (tigerCub.hungerLevel >= 100) {
                System.out.println("Tony has gotten too hungry and bit your arm.");
                System.out.println("He was taken away by animal control.");
                System.out.println("Game Over.");
            } else if (tigerCub.thirstLevel >= 100) {
                System.out.println("Tony died from dehydration.");
                System.out.println("Game Over.");
            } else if (tigerCub.boredomLevel >= 100) {
                System.out.println("Tony has gotten too bored.");
                System.out.println("Tony escaped and went to Doc Antle's Tiger Reserve.");
                System.out.println("Game Over.");
            } else if (tigerCub.tirednessLevel >= 100) {
                System.out.println("Tony has gotten too sleepy and won't wake up from his nap.");
                System.out.println("Game Over.");
            }
        }
    }
}



