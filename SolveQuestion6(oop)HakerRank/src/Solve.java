import java.util.*;

class Solve{
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      System.out.println("please Enter how many you want to enter string");
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
      System.out.println("Enter your choose");
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(InstanceOFTutorial.count(mylist));
   }}