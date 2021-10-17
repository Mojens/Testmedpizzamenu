import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class FufilledOrders {

    public static void doneOrders(){
        System.out.println("Fuldførte Ordre");
        for (String find: CurrentOrders.fufilledOrders){
            System.out.println(find);
        }

    }

    public static int revenue(){
        TreeMap<Integer, String> reve = new TreeMap<Integer,String>();
        int sum = 0;
        for (String findAll : CurrentOrders.fufilledOrders) {
            String dkk = findAll.substring(findAll.indexOf("DKK ") + 4);
            dkk = dkk.substring(0, dkk.indexOf(" "));
            int dkks = Integer.parseInt(dkk);
            sum = sum + dkks;
        }
        return sum;
    }
    public static void deleteOrder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvilken Order ID vil du slette?");
        int orderID = input.nextInt();
        for (String order : RegisterOrdre.currentOrders) {
            String sub = order.substring(order.indexOf("Order ID: ") + 10);
            sub = sub.substring(0, sub.indexOf(" "));
            if (Integer.parseInt(sub) == orderID) {
                RegisterOrdre.currentOrders.remove(order);
            }
        }
    }
}
