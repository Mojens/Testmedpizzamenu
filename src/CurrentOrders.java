import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CurrentOrders {
    public static String current(){
        //System.out.println(RegisterOrdre.findPizza(2,2,"2"));
        for (String find : RegisterOrdre.currentOrders) {
            System.out.println(find.toString());
        }


        return null;

    }
}


