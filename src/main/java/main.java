public class main {
    public static void main(String[] args) {
       Dog dog = new Dog();
       Cat cat = new Cat();

       dog.makeSound();
       cat.makeSound();

       dog.eat("Someone's bone");
       cat.eat("owners finger");

       dog.showMood(true);
       dog.showMood(false);

       cat.showMood(true);
       cat.showMood(false);
    }
}
