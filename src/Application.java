import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
      MenuRun.run();
      //input.nextLine(); // Her vil der ske det at hvis man indtaster noget som ikke giver mening i metoden så vil
      // den gå tilbage til starten (Start menu), det skal måske fikses ?
    }

  }
}

