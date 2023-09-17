import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What animal would you like to create? (dog, cat, hamster)");
        String animalChoice = sc.nextLine();
        switch (animalChoice) {
            case "dog" -> {
                System.out.println("Enter name of your dog.");
                String dogName = sc.nextLine();
                System.out.println("Enter age of your dog.");
                int dogAge = Integer.parseInt(sc.nextLine());
                System.out.println("Enter breed of your dog.");
                String dogBreed = sc.nextLine().toLowerCase();
                System.out.println("Enter your dog's favorite food");
                String favoriteFood = sc.nextLine().toLowerCase();
                System.out.println("How many friends does your dog have?");
                int dogNumberOfFriends = Integer.parseInt(sc.nextLine());
                System.out.println("What is your dog's favorite toy?");
                String favoriteToy = sc.nextLine().toLowerCase();

                Dog myDog = new Dog(dogName, dogAge);
                myDog.setBreed(dogBreed);
                myDog.setFavoriteFood(favoriteFood);
                myDog.setNumberOfFriends(dogNumberOfFriends);
                myDog.setFavoriteToy(favoriteToy);

                System.out.println(myDog);

                System.out.println(myDog.dogIntroduction());
            }
            case "cat" -> {
                System.out.println("Enter name of your cat.");
                String catName = sc.nextLine();
                System.out.println("Enter age of your cat.");
                int catAge = Integer.parseInt(sc.nextLine());
                System.out.println("Enter color of your cat's hair.");
                String catColor = sc.nextLine().toLowerCase();
                System.out.println("Enter number of things destroyed by your cat.");
                int catNumberOfDestroyedThings = Integer.parseInt(sc.nextLine());
                System.out.println("What food your cat doesn't like?");
                String dislikedFood = sc.nextLine();

                Cat myCat = new Cat(catName, catAge);
                myCat.setColor(catColor);
                myCat.setNumberOfDestroyedThings(catNumberOfDestroyedThings);
                myCat.setDislikedFood(dislikedFood);
                System.out.println(myCat);

                System.out.println(myCat.catIntroduction());
            }
            case "hamster" -> {
                System.out.println("Enter your hamster's name.");
                String hamsterName = sc.nextLine();
                System.out.println("Enter age of your hamster.");
                int hamsterAge = Integer.parseInt(sc.nextLine());
                System.out.println("Is your hamster's running wheel squeaking? (yes/no)");
                String hamsterIsWheelSqueaking = sc.nextLine().toLowerCase();

                Hamster myHamster = new Hamster(hamsterName, hamsterAge);
                if (hamsterIsWheelSqueaking.equals("yes")) {
                    myHamster.setIsWheelSqueaking("constantly squeaking");
                } else if (hamsterIsWheelSqueaking.equals("no")) {
                    myHamster.setIsWheelSqueaking("not squeaking");
                } else {
                    myHamster.setIsWheelSqueaking("undefined, because user can't write");
                    System.out.println("I don't think you can write properly.");
                }
                System.out.println(myHamster);

                System.out.println(myHamster.hamsterIntroduction());
            }
            default ->
                    System.out.println("I know you know you shouldn't choose something else than dog, cat or hamster.");
        }


    }
}