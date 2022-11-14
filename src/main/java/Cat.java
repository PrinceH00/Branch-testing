public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    public void showMood(boolean mood) {
        if (mood) {System.out.println("katten spiner");
        } else System.out.println("katten væser");
    }
}
