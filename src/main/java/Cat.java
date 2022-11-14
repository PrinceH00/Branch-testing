public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
    public void showMood() {
        if (true){
            System.out.println("katten spiner");
        }
        else System.out.println("katten væser");
    }
}
