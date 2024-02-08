import java.util.*;

public class Main {
  public static void main(String[] args) {

    //prompt user to enter a weight in pounds
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter weight in pounds: ");
    double weight = input.nextDouble();

    //prompt user to enter height in feet and inches
    
    System.out.println("Enter height in feet: ");
    int feet = input.nextInt();
     System.out.println("Enter height in inches: ");
    int inches = input.nextInt();

    if (feet < 0 || inches < 0 || inches > 12)
      System.out.println("Invalid input");
    
    //convert height to inches

    double height = (feet * 12) + inches;

    //Calculate BMI

    double BMI = (weight / (height * height)) * 703;

    //Display BMI

    System.out.println("BMI is " + BMI);

    //Display weight status
    
   {
   if (BMI < 18.5) 
     System.out.println("Underweight");
    else if (BMI >= 18.5 && BMI < 25)
      System.out.println("Normal");
    else if (BMI >= 25 && BMI < 30)
      System.out.println("Overweight");
    else if (BMI >= 30 && BMI < 35)
      System.out.println("Obese");
    else if (BMI >= 35)
      System.out.println("Extremely Obese");
    }
  }
}
    