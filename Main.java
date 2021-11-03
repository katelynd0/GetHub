import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    String normal="Hello world!";
    System.out.println(normal);
    System.out.println("Enter a name");
    String name= scan.nextLine();

    String lower= name.toLowerCase();
    System.out.print(lower+" "+normal);


  }
}