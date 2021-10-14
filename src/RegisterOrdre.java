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


  public static int userInput() {
    Scanner input = new Scanner(System.in);
    String user = input.nextLine();
    while (!input.hasNextInt()) {
      System.out.println("\nIndtast et gyldigt tal");
      System.out.println("Prøv igen"); // og dette.
      int validInput = 0;
      switch (validInput) {
        case 1:
          if (user.equals("1")) {
            number = PizzaMenu.pizza1.number;
            System.out.println(number);
          }
            break;
        case 2:
          if (user.equals("2")) {
            number = PizzaMenu.pizza2.number;
          }
          break;
        case 3:
          if (user.equals("3")) {
            number = PizzaMenu.pizza3.number;
          }
          break;
        case 4:
          if (user.equals("4")) {
            number = PizzaMenu.pizza4.number;
          }
          break;
        case 5:
          if (user.equals("5")) {
            number = PizzaMenu.pizza5.number;
          }
          break;
        case 6:
          if (user.equals("6")) {
            number = PizzaMenu.pizza6.number;
          }
          break;
        case 7:
          if (user.equals("7")) {
            number = PizzaMenu.pizza7.number;
          }
          break;
        case 8:
          if (user.equals("8")) {
            number = PizzaMenu.pizza8.number;
          }
          break;
        case 9:
          if (user.equals("9")) {
            number = PizzaMenu.pizza9.number;
          }
          break;
        case 10:
          if (user.equals("10")) {
            number = PizzaMenu.pizza10.number;
          }
          break;
        case 11:
          if (user.equals("11")) {
            number = PizzaMenu.pizza11.number;
          }
          break;
        case 12:
          if (user.equals("12")) {
            number = PizzaMenu.pizza12.number;
          }
          break;
        case 13:
          if (user.equals("13")) {
            number = PizzaMenu.pizza13.number;
          }
          break;
        case 14:
          if (user.equals("14")) {
            number = PizzaMenu.pizza14.number;
          }
          break;
        case 15:
          if (user.equals("15")) {
            number = PizzaMenu.pizza15.number;
          }
          break;
        case 16:
          if (user.equals("16")) {
            number = PizzaMenu.pizza16.number;
          }
          break;
        case 17:
          if (user.equals("17")) {
            number = PizzaMenu.pizza17.number;
          }
          break;
        default:
      }

      }
    return number;
    }
    }
