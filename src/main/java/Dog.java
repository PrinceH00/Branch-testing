public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Wuuf!");
    }

    @Override
    public boolean eat(String foodtype) {
        return true;
    }
}
