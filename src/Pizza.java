import java.util.ArrayList;

public class Pizza {
  String name;
  String description;
  int number;
  double price;

  public void setName(String aName) {
    this.name = aName;
  }

  public String getName() {
    return name;
  }

  public void setDescription(String aDescription) {
    this.description = aDescription;
  }

  public String getDescription() {
    return description;
  }

  public void setNumber(int aNumber) {
    this.number = aNumber;
  }

  public int getNumber() {
    return number;
  }

  public void setPrice(double aPrice) {
    this.price = aPrice;
  }

  public double getPrice() {
    return price;
  }

  public String toString() {
    return number + " " +name + " " +
        description + "........" +
        price + "kr."+"\n";
  }

  public Pizza(){

  }

  public Pizza(int aNumber, String aName, String aDescription, double aPrice) {
    this.name = aName;
    this.description = aDescription;
    this.number = aNumber;
    this.price = aPrice;
  }

  static Pizza pizza1 = new Pizza(1, "Vesuvio", "Tomatsauce, ost, skinke og oregano", 57);
  static Pizza pizza2 = new Pizza(2, "Amerikaner", "Tomatsauce, ost, oksefars og oregano", 53);
  static Pizza pizza3 = new Pizza(3, "Cacciatore", "Tomatsauce, ost, pepperoni og oregano", 57);
  static Pizza pizza4 = new Pizza(4, "Carbona", "Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63);
  static Pizza pizza5 = new Pizza(5, "Dennis", "Tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65);
  static Pizza pizza6 = new Pizza(6, "Bertil", "Tomatsauce, ost, bacon og oregano", 57);
  static Pizza pizza7 = new Pizza(7, "Silvia", "Tomatsauce, ost, pepperoni, cocktailpølser og oregano", 61);
  static Pizza pizza8 = new Pizza(8, "Victoria", "Tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61);
  static Pizza pizza9 = new Pizza(9, "Toronfo", "Tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
  static Pizza pizza10 = new Pizza(10, "Capricciosa", "Tomatsauce, ost, skinke, champignon og oregano", 61);
  static Pizza pizza11 = new Pizza(11, "Hawai", "Tomatsauce, ost, skinke, ananas og oregano", 61);
  static Pizza pizza12 = new Pizza(12, "Le Blissola", "Tomatsauce, ost, skinke, rejer og oregano", 57);
  static Pizza pizza13 = new Pizza(13, "Venezia", "Tomatsauce, ost, skinke, bacon og oregano", 61);
  static Pizza pizza14 = new Pizza(14, "Mafia", "Tomatsauce, ost, pepperoni, bacon, løg og oregano", 61);
  static Pizza pizza15 = new Pizza(15, "Igild", "Tomatsauce, ost, pepperoni, kebab, chili, hvidløgs dressing", 75);
  static Pizza pizza16 = new Pizza(16, "Zimba", "Tomatsauce, ost, chili", 49);
  static Pizza pizza17 = new Pizza(17, "Abdullah", "Tomatsauce, ost, kebab, bacon, pebberfrugt, kebab dressing", 99);

  public static ArrayList<Pizza> pizzaMenu() {
    ArrayList<Pizza> pizzaMenu = new ArrayList<>();
    pizzaMenu.add(pizza1);
    pizzaMenu.add(pizza2);
    pizzaMenu.add(pizza3);
    pizzaMenu.add(pizza4);
    pizzaMenu.add(pizza5);
    pizzaMenu.add(pizza6);
    pizzaMenu.add(pizza7);
    pizzaMenu.add(pizza8);
    pizzaMenu.add(pizza9);
    pizzaMenu.add(pizza10);
    pizzaMenu.add(pizza11);
    pizzaMenu.add(pizza12);
    pizzaMenu.add(pizza13);
    pizzaMenu.add(pizza14);
    pizzaMenu.add(pizza15);
    pizzaMenu.add(pizza16);
    pizzaMenu.add(pizza17);

    for (Pizza find : pizzaMenu) {
      System.out.println(find.toString());
    }
   return pizzaMenu;
  }

  public static ArrayList<Pizza> pizzaMenu1() {
    ArrayList<Pizza> pizzaMenu1 = new ArrayList<>();
    pizzaMenu1.add(pizza1);
    pizzaMenu1.add(pizza2);
    pizzaMenu1.add(pizza3);
    pizzaMenu1.add(pizza4);
    pizzaMenu1.add(pizza5);
    pizzaMenu1.add(pizza6);
    pizzaMenu1.add(pizza7);
    pizzaMenu1.add(pizza8);
    pizzaMenu1.add(pizza9);
    pizzaMenu1.add(pizza10);
    pizzaMenu1.add(pizza11);
    pizzaMenu1.add(pizza12);
    pizzaMenu1.add(pizza13);
    pizzaMenu1.add(pizza14);
    pizzaMenu1.add(pizza15);
    pizzaMenu1.add(pizza16);
    pizzaMenu1.add(pizza17);

    for (Pizza find : pizzaMenu1) {
      find.toString();
    }
    return pizzaMenu1;
  }
}





