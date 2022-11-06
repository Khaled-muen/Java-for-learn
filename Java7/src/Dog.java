public class Dog extends AnimalAsAbstract implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    void shout() {
        // TODO Auto-generated method stub
        System.out.println("im shouting");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        System.out.println("woof");
        
    }

    
}
