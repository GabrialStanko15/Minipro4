import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);


    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What year is it?");
    int currentYear = scan.nextInt();
    System.out.println("What is your birth year?");
    int birthYear = scan.nextInt();

    System.out.println(greeting(name));

    int age = getAge(birthYear, currentYear);
    System.out.println("Your age is " + age);
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