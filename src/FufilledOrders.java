import java.util.ArrayList;
import java.util.TreeMap;

public class FufilledOrders {
    public static void doneOrders(){
        System.out.println("Fuldførte Ordre");
        for (String find: CurrentOrders.fufilledOrders){
            find.toString();
            System.out.println(find);
        }

    }

    public static void revenue(){
        TreeMap<Integer, String> reve = new TreeMap<Integer,String>();
        for (String findAll : CurrentOrders.fufilledOrders) {
            String dkk = findAll.substring(findAll.indexOf("DKK ")+5);
            dkk = dkk.substring(0,dkk.indexOf(" "));
            int dkks = Integer.parseInt(dkk);
            reve.put(dkks, findAll);
        }
        CurrentOrders.fufilledOrders = new ArrayList<>(reve.values());
        for (String find : CurrentOrders.fufilledOrders) {
            System.out.println(find);

        }
        //for (String list : CurrentOrders.fufilledOrders) {
            //list.toString();
        //}

    }
}
