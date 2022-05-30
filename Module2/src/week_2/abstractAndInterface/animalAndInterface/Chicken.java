package week_2.abstractAndInterface.animalAndInterface;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuc ta cuc tac...!";
    }

    @Override
    public String howtoEat() {
        return "could be fried!";
    }
}
