import org.w3c.dom.ls.LSOutput;

import java.awt.List;
import java.util.*;

public class CurrentOrders {

  public static String current() {
    TreeMap<Integer, String> afhentningsTid = new TreeMap<Integer, String>();
    for (String findAll : RegisterOrdre.currentOrders) {
      String tidspunkt = findAll.substring(findAll.indexOf("Afhentes kl: ") + 13);
      tidspunkt = tidspunkt.substring(0,tidspunkt.indexOf(" "));
      int tidspunkter = Integer.parseInt(tidspunkt);
      afhentningsTid.put(tidspunkter, findAll);
    }

    RegisterOrdre.currentOrders = new ArrayList<>(afhentningsTid.values());
    for (String find : RegisterOrdre.currentOrders) {
      System.out.println(find);


    }
    return null;
  }

  public static String deleteOrder(int ordreID) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hvilken order ID vil du slette?");
    ordreID = input.nextInt();
    for (String order: RegisterOrdre.currentOrders) {
      String sub = order.substring(order.indexOf("Order ID: ")+10);
      sub = sub.substring(0,sub.indexOf(" "));
      if (Integer.parseInt(sub) == ordreID){
        RegisterOrdre.currentOrders.remove(order);
      }

    }
    return null;
  }

  public static String fufillOrder(int ordreID) {
    Scanner input = new Scanner(System.in);
    ArrayList<String> fufilledOrders = new ArrayList<>();
    System.out.println("Hvilken order ID vil du fuldføre?");
    ordreID = input.nextInt();
    for (String order: RegisterOrdre.currentOrders) {
      String sub = order.substring(order.indexOf("Order ID: ")+10);
      sub = sub.substring(0,sub.indexOf(" "));
      if (Integer.parseInt(sub) == ordreID){
        fufilledOrders.add(order);
        RegisterOrdre.currentOrders.add(order);
      }

    }
    return null;
  }
}

