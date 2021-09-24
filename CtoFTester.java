/* The paramenters should be named celsius and fahrenheit for clarity purposes.
The type should floating-point, because temperature isn't guaranteed to be an integer.
The functions should return a floating-point because it's likely that it won't convert to a whole number.
*/
import java.util.Scanner;
public class CtoFTester{
  public static void main(String[] args) {
    System.out.println(celsiustofahrenheit(0));
    System.out.println(fahrenheittocelsius(0));
  }


  public static double celsiustofahrenheit(double fahrenheit){
    Scanner in = new Scanner(System.in);
    System.out.print("Exactly how many fahrenheit?");
    fahrenheit = in.nextDouble();
    return ((fahrenheit - 32) * 5 / 9);
  }

  public static double fahrenheittocelsius(double celsius){
    Scanner in = new Scanner(System.in);
    System.out.print("Exactly how many celsius?");
    celsius = in.nextDouble();
    return ((celsius * 1.8) + 32);
  }
}
