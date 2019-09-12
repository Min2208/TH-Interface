public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound(){

        return "O o o o";
    }

    @Override
    public String howtoEat(){
        return "Could be boiled";
    }
}
