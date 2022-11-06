public class Dog extends ClassForTestExtends implements Animal{
//becouse im implements the interface so i want to override all methods inside the interface 

    @Override
    public void drink() {
        System.out.println("Dog is Drinking");
        
    }

    @Override 
    public void sleep(){
        System.out.println("Dog is Sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Dog is Eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking\n");        
    }
    
}
