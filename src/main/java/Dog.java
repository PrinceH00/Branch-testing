public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Wuf!");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood() {
        if (true){
            System.out.println("logrer");
        }
        else System.out.println("knurrer");
    }
}
