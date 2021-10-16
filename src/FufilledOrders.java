import java.util.ArrayList;

public class FufilledOrders {
    public static void doneOrders(){
        System.out.println("Fuldførte Ordre");
        for (String find: CurrentOrders.fufilledOrders){
            find.toString();
            System.out.println(find);
        }

    }

    public static void revenue(){
        for (String list : CurrentOrders.fufilledOrders) {
            list.toString();
        }

    }
}
