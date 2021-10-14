public class MenuRun {

  public MenuRun() {

  }

  public static void run() {
    String[] menuItem = new String[10]; //Her laver vi 10 tomme pladser for Strings da Quit skal være på 9 og indeks starter fra 0 skal den være på 10 tomme pladser

    menuItem[1] = "Registrer ordre"; //Her siger vi hvad hver array indeholder på indeks 1
    menuItem[2] = "Se nuværende ordrer"; //indeks 2
    menuItem[3] = "Håndtering af ordrer"; //indeks 3
    menuItem[4] = "Omsætning"; //indeks 4
    menuItem[5] = "Populære ordrer";
    menuItem[6] = "Se pizza menu";
    menuItem[9] = "QUIT"; //indeks 9

    Menu menu = new Menu("MENU", "Vælg en mulighed: ", menuItem); //Bruger konstruktøren med de 3 parametre
    menu.printMenu();
    int choice = menu.readChoice(); //Her laver vi metoden om til en variablen som vi kalder for choice som altså er "input"
    boolean checkChoice; //Denne boolean skal jeg bruge til at lave en do while loop fordi den skal blive ved med at spøge hvis man skriver et andet tal end 1,2,3,9.
    // fordi i readChoice() så tjekker den kun om det en integer der bliver indtastet men ikke om det er den rigtige af dem.
    do {
      switch (choice) { //Laver en switch som kontroller brugerens input
        case 1:
          Pizza.pizzaMenu();
          System.out.println("Registrer ordre nu: "); //Hvis bruger har skrevet 1 vil den sige dette
          RegisterOrdre.findPizza(0,2);
          checkChoice = true;
          break;
        case 2:
          System.out.println("Se nuværende ordrer"); // Hvis bruger har skrevet 2 vil den sige dette
          checkChoice = true;
          break;
        case 3:
          System.out.println("Håndtering af ordrer"); // Hvis bruger har skrevet 3 vil den sige dette
          checkChoice = true;
          break;
        case 4:
          System.out.println("Omsætning");
          checkChoice = true;
          break;
        case 5:
          System.out.println("Populære ordrer");
          checkChoice = true;
          break;
        case 6:
          System.out.println("Her er menukortet");
          Pizza.pizzaMenu();
          run();
          checkChoice = true;
          break;
        case 9:
          System.out.println("Vi ses igen snart, farvel"); //Hvis bruger har skrevet 9 vil den sige dette
          checkChoice = true;
          break;

        default: // alt andet er forkert input
          System.out.println("\nIndtast et gyldigt nummer.");
          System.out.println("Prøv igen");
          menu.printMenu(); //så skal den printe menuen igen
          choice = menu.readChoice(); //så skal den køre denne metode igen
          checkChoice = false; // her er den så false fordi så betyder det man har tastet et andet integer end 1,2,3 eller 9.
      }
    } while (!checkChoice); //Den skal blive ved med at loop så længe den er false altså en integer som ikke er 1,2,3 eller 9
  }
}

