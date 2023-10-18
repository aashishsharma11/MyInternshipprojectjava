import java.util.Scanner;
public class TempretureConverter{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1 to convert from Celcius to Fahrenheit.");
        System.out.println("Enter 2 to convert from Fahrenheit to Celcius.");
        int choice = scan.nextInt();
        double tempreture= 0.0;
        double converter= 0.0;
        if(choice==1)
        {
            System.out.println("Enter the temperature in Celcius.");
            tempreture = scan.nextDouble();
             converter=9/5.0*tempreture+32;
            System.out.println("Tempreture in Fahrenheit="+converter);
        }
        else if(choice==2)
        {
            System.out.println("Enter the temperature in Fahrenheit.");
            tempreture = scan.nextDouble();
            converter =5/9.0*(tempreture-32);
            System.out.println("Tempreture in Celcius="+converter);
        }
        else
            System.out.println("wrong Input.please try again");
    }
            
        
        
        









    }