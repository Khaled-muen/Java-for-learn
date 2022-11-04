public class Main {
    public static void main(String[] args) {
        Boy b=new Boy();
        // b.setName("khaled abu muen");
        // System.out.println(b.getName());
        // b.setHadLoveBall(false);
        // System.out.println(b.getHadLoveBall());
        b.eat();
        Boy ba=new Boy(null, 0, false);

        Girl g1 =new Girl();
        // g1.setName("sousan");
        // System.out.println(g1.getName()); 
        g1.eat();
        System.out.println(g1.sayHello()); 

        Girl g2 =new Girl("saja", "saja@gmail.com", "yellow");
        System.out.println(g2.getName()+"  "+g2.getEmail()+"  "+g2.getFaverColor());
    }
}
