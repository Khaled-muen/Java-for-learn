public class Boy extends Person  {
    private boolean hadLoveBall;

    public Boy(){
        //for know who are the parent
        super();
        System.out.println("hey Boy");
    }

    public Boy( String name ,int age,boolean hadLoveBall) {
        //for know how are parent constructor
        super(name,age);
        this.hadLoveBall = hadLoveBall;
    }

    public void setHadLoveBall(boolean hadLoveBall) {
        this.hadLoveBall = hadLoveBall;
    }
    public boolean getHadLoveBall() {
        return hadLoveBall;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("I'm Eating im boy");
    }


}
