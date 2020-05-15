package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet tigerCub = new VirtualPet();
        Scanner scanner = new Scanner(System.in);
        while (true){
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
            tigerCub.interactWithTigerCub(userChoice);






        }
    }

}
