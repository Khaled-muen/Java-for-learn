import java.util.Scanner;

public class Main {
    // global variable
    static String nameOfCompany;

    public static void main(String[] args) {
        // final int kHALED=15;
        // System.out.println(kHALED);
        // String welcome="Hello Im ";
        // String myname="Khaled";
        // float x=25.5f;
        // myname="hssain";
        // System.out.println(welcome+myname+x);
        // System.out.println("myname");

        // //primitive DataType(8)
        // byte z=20;
        // short a=30;
        // int s=50;
        // long t=80L;

        // float k=5.5F;
        // double p=20.5;

        // char myFirstlatter='c';
        // boolean isHappy=false;
        // if (isHappy){
        // System.out.println("Im Happy");
        // }else{
        // System.out.println("Im not happy");
        // }

        // //non-primitive
        // String myName="khaled";
        // for(int i=0; i<myName.length();i++){
        // System.out.println(myName.charAt(i));
        // }
        //
        // Scanner userInput = new Scanner(System.in);
        // System.out.println("please enter your name");
        // String Name = userInput.next();
        // System.out.println("please Enter your age");

        // try {
        // int age = (int) userInput.nextInt();
        // System.out.println("HI Mr " + Name + " your Age is " + age);
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println("please Enter the correct age" + e);
        // }
        //
        // sum(5, 6);
        // sum(6, 9, 9);
        // public static void sum(int no1,int no2){
        // int sum=no1+no2;
        // System.out.println("the sum of : "+no1+"+"+no2+"="+sum);
        // }
        // //thats mean overload
        // public static void sum(int no1,int no2,int no3){
        // int sum=no1+no2+no3;
        // System.out.println("the sum of : "+no1+"+"+no2+"+"+no3+"="+sum);
        // }
        // Scanner y =new Scanner(System.in);
        // try {
        // while(true){
        // System.out.println("press any number to run and (0) to exit");
        // int x=y.nextInt();
        // if(x!=0){
        // Scanner Input =new Scanner(System.in);
        // System.out.println("please enter the number1");
        // double num1=Input.nextDouble();
        // System.out.println("please enter the number2");
        // double num2=Input.nextDouble();
        // System.out.println("the sum is "+sum(num1, num2));
        // }else{
        // break;
        // }
        //
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println("please Enter the interger number");
        // }
        // }
        // public static int sum(double n1,double n2){
        // int sum=(int)(n1+n2);
        // return sum;
        // }
        // variable and Fumction that convention name as camel case
        // String myNameIsKhaled="KHALED";
        // public static void sumBetweenNumbers(){....} _____^_____^_____
        // but in classes each char in the first word is uppercase.
        // class PersonOfPepole{}
        // Scanner input =new Scanner(System.in);
        // System.out.println("Enter your Age");
        // try {
        // int age=input.nextInt();
        // if (age==18){
        // System.out.println("the age is exactly 18");
        // }else if(age>18){
        // System.out.println("the age is over than 18");
        // }else{
        // System.out.println("the age is under than 18");
        // }
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println("please try again");
        // }
        // nameOfCompany="vision 9+";
        // System.out.println(nameOfCompany);
        // printCompanyName();
        // //local variable thats means the variable will terminate after the function
        // terminated
        // //scope only in the main function
        // int y=5;
        // }
        // public static void printCompanyName(){
        // nameOfCompany="new Name";
        // //local variable
        // //scope only in the printCompanyName
        // int z=5;
        // System.out.println(nameOfCompany);
        // int x=10;
        // if (true) {
        // x=5;//must as reassigment
        // System.out.println(x);
        // }
        // but like this
        // if (true) {
        // int x=10;//the variable x will clear or clean from the memory after the if
        // end
        // System.out.println(x);
        // }
        // int x=15;
        // System.out.println(x);
        // for(int i=0; i<=10;++i){
        // System.out.println("I love mam");
        // }

        // for(int i=1;i<=5;i++){ //for question how many line
        // for(int j=1;j<=i;j++){ //for no of print = no of line
        // System.out.print("*");
        // }
        // System.out.println("\n");
        // }
        // int i=0;
        // while(i<10){
        // System.out.print(i+1);
        // System.out.println(" i love my self");
        // ++i;
        // }
        // int i=0;
        // do{
        // System.out.print(i+1);
        // System.out.println(" hello my mam");
        // i++;
        // }while(i<10);
        // Scanner inputSwitch = new Scanner(System.in);
        // System.out.print("please Enter your color\t");
        // String color = inputSwitch.next();
        // switch (color) {
        // case "red":
        // System.out.println("your select the color: red");
        // break;
        // case "yellow":
        // System.out.println("your select the color: yellow");
        // break;
        // case "blue":
        // System.out.println("your select the color: blue");
        // break;
        // case "white":
        // System.out.println("your select the color: white");
        // break;
        // case "pruple":
        // System.out.println("your select the color: pruple");
        // break;
        // case "cyan":
        // System.out.println("your select the color: cyan");
        // break;
        // case "gray":
        // System.out.println("your select the color: gray");
        // break;
        // case "green":
        // System.out.println("your select the color: green");
        // break;
        // default:
        // System.out.println("your color is not available");
        // }

        // first calcuator
            try {
                Scanner inputs = new Scanner(System.in);
                System.out.println("please Enter the first number: ");
                int firstNumber = inputs.nextInt();
                System.out.println("please Enter the second number: ");
                int secondNumber = inputs.nextInt();
                System.out.println("please Enter the operation: (* , - , + , / , %)");
                String expression = inputs.next();
                switch (expression) {
                    case "*":
                            int mul=firstNumber * secondNumber;
                        System.out.println("the result of " + firstNumber + " * " + secondNumber + " is " + mul);
                        break;
                    case "-":
                        int sub=firstNumber - secondNumber;
                        System.out.println("the result of " + firstNumber + " - " + secondNumber + " is " +sub );
                        break;
                    case "+":
                    int add =firstNumber + secondNumber;
                        System.out.println("the result of " + firstNumber + " + " + secondNumber + " is " + add);
                        break;
                    case "/":
                    int div=firstNumber / secondNumber;
                        System.out.println("the result of " + firstNumber + " / " + secondNumber + " is " + div);
                        break;
                    case "%":
                    int mod=firstNumber % secondNumber;
                        System.out.println("the result of " + firstNumber + " % " + secondNumber + " is " + mod);
                        break;
                        default:System.out.println("this operation is not available");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("please enter correct number");
            }

    }
}
