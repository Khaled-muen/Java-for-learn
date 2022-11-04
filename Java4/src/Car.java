public class Car {

    private String model ;
    private String color;
    private Engine myEngine;
    public int door;

    public Car(){
        System.out.println("this is Car <<empty constructor>>");
    }

    public Car(String color, String model , int door,Engine myEngine){
        this.color=color;
        this.model=model;
        this.door=door;
        this.myEngine=myEngine;
    }
    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    } 

    public void setDoor(int door){
        this.door=door;
    }

    public int getDoor(){
        return door;
    }

    public void setMyEngine(Engine myEngine) {
        this.myEngine = myEngine;
    }

    public Engine getMyEngine() {
        return myEngine;
    }
    
}
