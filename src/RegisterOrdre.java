import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class RegisterOrdre {
    static int number;
    static String comment;
    static int amount;
    static int timeStamp;
    static ArrayList<String> currentOrders = new ArrayList<>();


    public RegisterOrdre(int aNumber, int aAmount, int aTimeStamp, String aComment) {
        number = aNumber;
        comment = aComment;
        amount = aAmount;
        timeStamp = aTimeStamp;

    }


    public static void findPizza(int aNumber, int aTimeStamp, String aComment) {
        Scanner input = new Scanner(System.in);
        aNumber = input.nextInt();



        for (Pizza find : Pizza.pizzaMenu1()) {
            if (find.getNumber() == aNumber) {
                System.out.println(find);
                System.out.println("Indtast afhentnings tidspunkt i 2400 format");
                aTimeStamp = input.nextInt();

                if (aTimeStamp > 24 && aTimeStamp < 2400) {
                    System.out.println(find + " " + "Afhentes kl:" + aTimeStamp);
                    aComment = input.nextLine();
                    String com;
                    System.out.println("indtast kommentar, ellers tryk enter");
                    com = input.nextLine();
                    System.out.println(find + " " + " " + "Afhentes kl:" + aTimeStamp + " " + "Kommentar: " + com);

                    currentOrders.add(find + " " + " " + "Afhentes kl:" + aTimeStamp + " " + "Kommentar: " + com);
                }

            }


        }
    }
}

