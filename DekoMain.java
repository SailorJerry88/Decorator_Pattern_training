package b_strukturalne.decorator_demo;

public class DekoMain {

    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.becomeAlive();

        Animal garfield = new FoodTypeDecorator(new Cat(),FoodType.FISH);
        garfield.becomeAlive();

        Animal garfield1 = new BodyTypeDecorator(new Cat(), BodyType.HUGE);
        garfield1.becomeAlive();


        Animal animal = new Cat();
        Animal bt = new FoodTypeDecorator(animal,FoodType.EGGS);
        Animal idefix = new FoodTypeDecorator(bt,FoodType.MEAT);
        bt.becomeAlive();
        System.out.println(idefix.discription());


        Animal dog = new Dog();
        dog.becomeAlive();






    }
}
