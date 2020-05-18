# Virtual Pet

My virtual pet game is about a tiger cub. I was inspired by the Tiger King netflix show. 

VirtualPetApplication class runs the game. I created a separate method gameLoop to hold my game code. In there I run a while loop that runs the game continuously until lets a stat get above a set level. The loop outputs the tigers current levels of hunger, thirst, boredom, tiredness, and health. The loop then lets the user choose which one address with a scanner input. An if else statement determines which to based on which integer the user inputs. I then call a tick method from the VirtualPet class. I also run another else if conditional outside the game loop which tells the user why they lost. The user loses by letting hunger, thirst, boredom, or tiredness get too high. Also, the user loses by letting health get too low.

I created VirtualPet class to hold all my game code. I created integers which hold stats for the Tiger Cub pet. I have stats to represent hunger, thirst, boredom, tiredness, and health level. 
 
I have my tick method in the VirtualPet class which adds to tigers hunger, thirst, boredom, and sleepiness after every turn. The tick also uses a random number generator to randomly make the tiger get sick. The amount the tiger gets sick is also a random number. 

I also created methods to give the tiger food, give the tiger water, play with the tiger, let the tiger sleep, and take the tiger to the vet. 
