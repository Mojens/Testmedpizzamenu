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
  }

  static PizzaMenu pizza1 = new PizzaMenu(1, "Vesuvio", "Tomatsauce, ost, skinke og oregano", 57);
  static PizzaMenu pizza2 = new PizzaMenu(2, "Amerikaner", "tomatsauce, ost, oksefars og oregano", 53);
  static PizzaMenu pizza3 = new PizzaMenu(3, "Cacciatore", "Tomatsauce, ost, pepperoni og oregano", 57);
  static PizzaMenu pizza4 = new PizzaMenu(4, "Carbona", "Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63);
  static PizzaMenu pizza5 = new PizzaMenu(5, "Dennis", "Tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65);
  static PizzaMenu pizza6 = new PizzaMenu(6, "Bertil", "Tomatsauce, ost, bacon og oregano", 57);
  static PizzaMenu pizza7 = new PizzaMenu(7, "Silvia", "Tomatsauce, ost, pepperoni, cocktailpølser og oregano", 61);
  static PizzaMenu pizza8 = new PizzaMenu(8, "Victoria", "Tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61);
  static PizzaMenu pizza9 = new PizzaMenu(9, "Toronfo", "Tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
  static PizzaMenu pizza10 = new PizzaMenu(10, "Vesuvio", "Tomatsauce, ost, skinke og oregano", 57);
  static PizzaMenu pizza11 = new PizzaMenu(11, "Vesuvio", "Tomatsauce, ost, skinke og oregano", 57);
  static PizzaMenu pizza12 = new PizzaMenu(12, "Vesuvio", "Tomatsauce, ost, skinke og oregano", 57);
  static PizzaMenu pizza13 = new PizzaMenu(13, "Vesuvio", "Tomatsauce, ost, skinke og oregano", 57);
  static PizzaMenu pizza14 = new PizzaMenu(14, "Vesuvio", "Tomatsauce, ost, skinke og oregano", 57);


  public static void showMenu() {
      System.out.println(""+pizza1 + pizza2 + pizza3 + pizza4 + pizza5 + pizza6 + pizza7 + pizza8 + pizza9+pizza10
      +pizza11+pizza12+pizza13+pizza14);

  }
}




