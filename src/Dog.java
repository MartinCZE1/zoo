public class Dog extends Animal {
    private String favoriteFood;
    private String favoriteToy;
    private String breed;
    private int numberOfFriends;

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name, int age, String favoriteFood, String favoriteToy, String breed, int numberOfFriends) {
        super(name, age);
        this.favoriteFood = favoriteFood;
        this.favoriteToy = favoriteToy;
        this.breed = breed;
        this.numberOfFriends = numberOfFriends;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public String dogIntroduction() {
        return String.format("Hello. My name is %s and I am %s. Currently I am %d years old. My favorite toy is %s and favorite food is %s.", getName(), breed, getAge(), favoriteToy, favoriteFood);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "favoriteFood = '" + favoriteFood + '\'' +
                ", favoriteToy = '" + favoriteToy + '\'' +
                ", breed = '" + breed + '\'' +
                ", numberOfFriends = " + numberOfFriends +
                '}';
    }
}
