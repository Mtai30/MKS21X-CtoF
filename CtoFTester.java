
import java.util.Scanner;
public class CtoFTester{
      public static void main(String[] args){
          double celsius,fahrenheit;
          Scanner in = new Scanner(System.in);

          System.out.print("Exactly how many celsius?");
          celsius = in.nextDouble();

          fahrenheit = (celsius * 1.8) + 32;
          System.out.print (fahrenheit);
      }
}
