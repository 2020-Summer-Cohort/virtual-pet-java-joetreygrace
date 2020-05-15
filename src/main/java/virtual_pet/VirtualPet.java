package virtual_pet;

public class VirtualPet {
    int hungerLevel = 30;
    int thirstLevel = 30;
    int boredomLevel = 0;
    int tirednessLevel = 15;
    int healthLevel = 100;

    void interactWithTigerCub(int userChoice){
        if (userChoice == 1){
           hungerLevel = (giveTigerFood(hungerLevel));
            System.out.println("You fed Tony Carol Baskins Ex-Husband");
            System.out.println("");
//        }
//        else if (userChoice == 2){
//            tigerCub.thirstLevel = (tigerCub.giveTigerWater(tigerCub.thirstLevel));
//            System.out.println("You gave Tony some water");
//            System.out.println("");
//        }
    }
//
//    int giveTigerWater(int thirstLevel) {
//        thirstLevel = thirstLevel - 25;
//        return thirstLevel;
//    }
//
//    void playWithTiger() {
//
//    }
//
//    void tick() {
//
//
//    }
}

    int giveTigerFood(int hungerLevel) {
        hungerLevel = hungerLevel - 25;
        return hungerLevel;
    }
    }
