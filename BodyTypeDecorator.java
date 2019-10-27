package b_strukturalne.decorator_demo;

public class BodyTypeDecorator extends AnimalDecorator{
    protected BodyType type1;

    BodyTypeDecorator(Animal decorateAnimal,BodyType type1){
        super(decorateAnimal);
        this.type1 = type1;
    }

    @Override
    public void becomeAlive() {
        decoratedAnimal.becomeAlive();
        System.out.println("Its body type is " + type1.toString());

    }

    @Override
    public void giveSound() {
        decoratedAnimal.giveSound();

    }

    @Override
    public String discription() {

        return decoratedAnimal.discription()
                + "of body type "
                + type1.toString();
    }
}
