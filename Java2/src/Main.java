
public class Main {
    public static void main(String[] args){
        //create the object from class Car
        //Car >>class  car >>object    new >>> create object   car();>>>>.constructor
        // Car bmw=new Car();
        // bmw.color="black";
        // bmw.speed=250;
        // bmw.turnOn();
        // bmw.turnoff();
        // System.out.println(bmw.model);//if you unassigned the value the value will be null

        // //each object has a spacefic fields and methods  ====as instance of class
        // Car fiat =new Car();
        // fiat.brake();
        // fiat.speed=25;
        // System.out.println(fiat.speed);
        // fiat.model="2025";
        //while create object we can set the model

        Car subaro =new Car("2025");
        Car pego =new Car(255, "2026");
        subaro.print();
        pego.print();
        Car kia =new Car();
        kia.print();
        Car bmw =new Car(false, 700);
        //i cannt show the data in class car becouse the acces modifier of data  is private 
        // bmw.speed=5; in the create the object we pass the parameter but not pass the global data
        //like this i can set the value of the speed
        //like this i can reach the value of speed
        //becouse the speed attribute is private
       System.out.println(bmw);

    }
}
