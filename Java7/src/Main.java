public class Main {
    public static void main(String[] args) {
        // AnimalAsAbstract a3 =new Cat();
        //polymorohism
        Animal[] bag={new Dog() , new Cat()} ;
        for (Animal a : bag) {
            a.makeSound();
            System.out.println(bag);
        }
    }
}
