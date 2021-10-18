import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class RegisterOrdre {
    static int number;
    static String comment;
    static int amount = 0;
    static int timeStamp;
    static int orderId;
    static int count = 1;
    static ArrayList<String> currentOrders = new ArrayList<>();

    public static void setOrderId(int orderId) {
        RegisterOrdre.orderId = orderId;
    }

    public static int getOrderId(int orderId) {
        return orderId;
    }


    public static void registerPizza(int aNumber, int aTimeStamp, String aComment, int orderId) {
        number = aNumber;
        comment = aComment;
        timeStamp = aTimeStamp;
        Scanner input = new Scanner(System.in);
        aNumber = input.nextInt();

        for (Pizza find : Pizza.pizzaMenu1()) {
            if (find.getNumber() == aNumber) {
               // System.out.println(find);
                System.out.println("Indtast afhentnings tidspunkt i 2400 format");
                aTimeStamp = input.nextInt();

                if (aTimeStamp >= 24 && aTimeStamp <= 2400) {
                    //System.out.println(find + " " + "Afhentes kl:" + aTimeStamp);
                    aComment = input.nextLine();
                    String com;
                    System.out.println("Indtast kommentar, ellers tryk enter");
                    com = input.nextLine();
                    //System.out.println(find + " " + " " + "Afhentes kl: " + aTimeStamp + " " + "Kommentar: " + com);

                    currentOrders.add("Order ID: "+ count + " Afhentes kl: "+aTimeStamp + " "+"Kommentar: " + com + " Pizza: "+ find);
                    count++;
                    System.out.println("Den er nu registreret!");
                    System.out.println("Nu kan du se den under “Nuværende ordre“");
                }

            }

        }
    }
}

