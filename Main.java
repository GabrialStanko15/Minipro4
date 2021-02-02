import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);


    System.out.println("What is your username?");
    String username = scan.next();
    System.out.println("What is your pin number?");
    int pinNumber = scan.nextInt();
    System.out.println("What is your birth year?");
    int birthYear = scan.nextInt();

  

    int age = getAge(birthYear, currentYear);
    
  }

  //getAge method calculates age
  static int getAge (int birthYear, int currentYear)
  {
  int age = currentYear - birthYear;
  return age;
  }

  //greeting method returns a personalized greeting
  static String greeting(String name)
  {
    String hello = "Hello. Welcome back, " + name;
    return hello;
  }
}