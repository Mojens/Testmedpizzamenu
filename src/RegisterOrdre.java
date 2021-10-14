import java.util.Scanner;

public class RegisterOrdre {
  static int number;
  static String comment;
  static int amount;
  static double timeStamp;

  public RegisterOrdre(int aNumber, int aAmount, double aTimeStamp, String aComment) {
    number = aNumber;
    comment = aComment;
    amount = aAmount;
    timeStamp = aTimeStamp;
  }

  public static void findPizza(int aNumber) {
    Scanner input = new Scanner(System.in);
    aNumber = input.nextInt();
    for (Pizza find : Pizza.pizzaMenu1()) {
      if (find.getNumber() == aNumber) {
        System.out.println(find);

      }
    }
  }
  public static void timeStamp(int aTimeStamp){
    Scanner input = new Scanner(System.in);
    aTimeStamp = input.nextInt();
    aTimeStamp = dd

  }


}
