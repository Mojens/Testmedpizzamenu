import java.util.ArrayList;

public class PizzaMenu {

  String name;
  String description;
  int number;
  double price;

  public String toString() {
    return number + " " +name + " " +
        description + "........" +
        price + "kr."+"\n";
  }

  public PizzaMenu(int aNumber, String aName, String aDescription, double aPrice) {
    this.name = aName;
    this.description = aDescription;
    this.number = aNumber;
    this.price = aPrice;
    pizza = new ArrayList<PizzaMenu>();



    pizza.add(new PizzaMenu(1,   "Vesuvio",    "Tomatsauce, ost, skinke og oregano", 57));
    pizza.add(new PizzaMenu(2,   "Amerikaner", "tomatsauce, ost, oksefars og oregano", 53));
    pizza.add(new PizzaMenu(3,   "Cacciatore", "Tomatsauce, ost, pepperoni og oregano", 57));
    pizza.add(new PizzaMenu(4,   "Carbona",    "Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63));
    pizza.add(new PizzaMenu(5,   "Dennis", "Tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65));
    pizza.add(new PizzaMenu(6,   "Bertil", "Tomatsauce, ost, bacon og oregano", 57));
    pizza.add(new PizzaMenu(7,   "Silvia", "Tomatsauce, ost, pepperoni, cocktailpølser og oregano", 61));
    pizza.add(new PizzaMenu(8,   "Victoria", "Tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61));
   pizza.add(new PizzaMenu(9,   "Toronfo", "Tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61));
    pizza.add(new PizzaMenu(10, "Capricciosa", "Tomatsauce, ost, skinke, champignon og oregano", 61));
    pizza.add(new PizzaMenu(11, "Hawai", "Tomatsauce, ost, skinke, ananas og oregano", 61));
    pizza.add(new PizzaMenu(12, "Le Blissola", "Tomatsauce, ost, skinke, rejer og oregano", 57));
    pizza.add(new PizzaMenu(13, "Venezia", "Tomatsauce, ost, skinke, bacon og oregano", 61));
    pizza.add(new PizzaMenu(14, "Mafia", "Tomatsauce, ost, pepperoni, bacon, løg og oregano", 61));
    pizza.add(new PizzaMenu(15, "Igild", "Tomatsauce, ost, pepperoni, kebab, chili, hvidløgs dressing", 75));
    pizza.add(new PizzaMenu(16, "Zimba", "Tomatsauce, ost, chili", 49));
   pizza.add(new PizzaMenu(17, "Abdullah","Tomatsauce, ost, kebab, bacon, pebberfrugt, kebab dressing",99));

  }




  public static void showMenu() {
      System.out.println(""+pizza1 + pizza2 + pizza3 + pizza4 + pizza5 + pizza6 + pizza7 + pizza8 + pizza9+pizza10
      +pizza11+pizza12+pizza13+pizza14+pizza15+pizza16+pizza17);

  }
}




