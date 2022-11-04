public class Engine {
    private String type;
    private int power;

    Engine(){
        System.out.println("this is Engine Empty constructor");
    }

    public Engine(String type, int power){
        this.type=type;
        this.power=power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


}
