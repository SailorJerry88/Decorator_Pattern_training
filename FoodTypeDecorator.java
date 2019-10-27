package b_strukturalne.decorator_demo;

public class FoodTypeDecorator extends AnimalDecorator{
    protected FoodType type;

    FoodTypeDecorator(Animal decorateAnimal, FoodType type){
        super(decorateAnimal);
        this.type = type;
    }

    @Override
    public void becomeAlive() {
        decoratedAnimal.becomeAlive();
        System.out.println("It's food type is " + type.toString());

    }

    @Override
    public void giveSound() {
        decoratedAnimal.giveSound();

    }

    @Override
    public String discription() {
        return decoratedAnimal.discription()
                + " eats food type "
                + type.toString();
    }
}
