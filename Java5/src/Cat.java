public class Cat extends ClassForTestExtends implements Animal {

    @Override
    public void drink() {
        System.out.println("Cat is drinking");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
        
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking\n");
    }

}
