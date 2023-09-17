public class Hamster extends Animal {
    private String isWheelSqueaking;

    public Hamster(String name, int age) {
        super(name, age);
    }

    public void setIsWheelSqueaking(String isWheelSqueaking) {
        this.isWheelSqueaking = isWheelSqueaking;
    }

    public String hamsterIntroduction() {
        return String.format("Hello. My name is %s. I am %d years old and my running wheel is %s.", getName(), getAge(), isWheelSqueaking);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "isWheelSqueaking = '" + isWheelSqueaking + '\'' +
                '}';
    }
}
