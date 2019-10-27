package b_strukturalne.decorator_demo;

public class BodyTypeDecorator extends AnimalDecorator{
    protected BodyType type;

    BodyTypeDecorator(Animal decorateAnimal,BodyType type){
        super(decorateAnimal);
        this.type = type;
    }

    @Override
    public void becomeAlive() {
        decoratedAnimal.becomeAlive();
        System.out.println("Its body type is" + type.toString());

    }

    @Override
    public void giveSound() {
        decoratedAnimal.giveSound();

    }

    @Override
    public String discription() {

        return decoratedAnimal.discription()
                + "of body type "
                + type.toString();
    }
}
