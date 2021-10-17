import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class FufilledOrders {

    public static void doneOrders() {
        System.out.println("Fuldførte Ordre");
        for (String find : CurrentOrders.fufilledOrders) {
            System.out.println(find);
        }
    }

    public static int revenue() {
        TreeMap<Integer, String> reve = new TreeMap<Integer, String>();
        int sum = 0;
        for (String findAll : CurrentOrders.fufilledOrders) {
            String dkk = findAll.substring(findAll.indexOf("DKK ") + 4);
            dkk = dkk.substring(0, dkk.indexOf(" "));
            int dkks = Integer.parseInt(dkk);
            sum = sum + dkks;
        }
        return sum;
    }


    public static void popularOrder() {
        TreeMap<Integer, String> afhentningsTid = new TreeMap<Integer, String>();
        for (String findAll : CurrentOrders.fufilledOrders) {
            String pizza = findAll.substring(findAll.indexOf("Pizza: ") + 7);
            pizza = pizza.substring(0, pizza.indexOf(" "));
            int pizzaer = Integer.parseInt(pizza);
            afhentningsTid.put(pizzaer,findAll);
            System.out.println(afhentningsTid.values());

        }
    }
}

