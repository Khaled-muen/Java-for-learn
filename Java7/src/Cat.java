public class Cat extends AnimalAsAbstract implements Animal{

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    void shout() {
        // TODO Auto-generated method stub
        System.out.println("im shouting");
        
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        System.out.println("Meow");
        
    }
    
}
