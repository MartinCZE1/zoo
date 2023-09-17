public class Cat extends Animal {
    private int numberOfDestroyedThings;
    private String dislikedFood;
    private String color;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, int numberOfDestroyedThings, String dislikedFood, String color) {
        super(name, age);
        this.numberOfDestroyedThings = numberOfDestroyedThings;
        this.dislikedFood = dislikedFood;
        this.color = color;
    }
    
    public void setNumberOfDestroyedThings(int numberOfDestroyedThings) {
        this.numberOfDestroyedThings = numberOfDestroyedThings;
    }

    public void setDislikedFood(String dislikedFood) {
        this.dislikedFood = dislikedFood;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String catIntroduction() {
        return String.format("Hello. My name is %s. I am %d years old and my hair color is %s. I already destroyed %d things and I don't like %s.", getName(), getAge(), color, numberOfDestroyedThings, dislikedFood);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numberOfDestroyedThings=" + numberOfDestroyedThings +
                ", dislikedFood = '" + dislikedFood + '\'' +
                ", color = '" + color + '\'' +
                '}';
    }
}
