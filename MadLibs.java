import java.util.Scanner;

public class Main {
  static void createMadLib(int lineNumber) {
    String Number;
    if (lineNumber == 1) {
      Number = "first";
    } else if (lineNumber == 2) {
      Number = "second";
    } else {
      Number = "last";
    }
    System.out.println("Enter the " + Number + " line of your MadLib, using ? for the missing word.");
    
    if (lineNumber == 1) {
      Scanner askFirstLineMadLib = new Scanner(System.in);
      String firstLineMadLib = askFirstLineMadLib.nextLine();
    } else if (lineNumber == 2) {
      Scanner askSecondLineMadLib = new Scanner(System.in);
      String secondLineMadLib = askSecondLineMadLib.nextLine();
    } else {
      Scanner askLastLineMadLib = new Scanner(System.in);
      String lastLineMadLib = askLastLineMadLib.nextLine();
    }

    System.out.println("Indicate whether the missing word is a \n1: Noun\n2: Verb\n3: Adjective");
    
    if (lineNumber == 1) {
      Scanner askFirstLineWordType = new Scanner(System.in);
      int firstLineWordType = askFirstLineWordType.nextInt();
    } else if (lineNumber == 2) {
      Scanner askSecondLineWordType = new Scanner(System.in);
      int secondLineWordType = askSecondLineWordType.nextInt();
    } else {
      Scanner askLastLineWordType = new Scanner(System.in);
      int lastLineWordType = askLastLineWordType.nextInt();
    }

  }
  public static void main(String[] args) {
    createMadLib(1);
    createMadLib(2);
    createMadLib(3);
    
  }
}
