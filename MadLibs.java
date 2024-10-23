import java.util.Scanner;

public class MadLib {
  String firstLineMadLib;
  int firstLineWordType;
  
  String secondLineMadLib;
  int secondLineWordType;
  
  String lastLineMadLib;
  int lastLineWordType;
  
  public void create() {
    String Number;
    
    for (int lineNumber = 1; lineNumber <= 3; lineNumber++) {
      
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
        firstLineMadLib = askFirstLineMadLib.nextLine();
      } else if (lineNumber == 2) {
        Scanner askSecondLineMadLib = new Scanner(System.in);
        secondLineMadLib = askSecondLineMadLib.nextLine();
      } else {
        Scanner askLastLineMadLib = new Scanner(System.in);
        lastLineMadLib = askLastLineMadLib.nextLine();
      }
    
      System.out.println("Indicate whether the missing word is a \n1: Noun\n2: Verb\n3: Adjective");
        
      if (lineNumber == 1) {
        Scanner askFirstLineWordType = new Scanner(System.in);
        firstLineWordType = askFirstLineWordType.nextInt();
      } else if (lineNumber == 2) {
        Scanner askSecondLineWordType = new Scanner(System.in);
        secondLineWordType = askSecondLineWordType.nextInt();
      } else {
        Scanner askLastLineWordType = new Scanner(System.in);
        lastLineWordType = askLastLineWordType.nextInt();
      }
    }
  }
  public void fillIn() {
    int wordType;
      
    for (int i = 0; i < 3; i++) {
      if (i == 0) {
        wordType = firstLineWordType;
      } else if (i == 1) {
        wordType = secondLineWordType;
      } else {
        wordType = lastLineWordType;
      }
      if (wordType == 1) {
        System.out.println("Enter a noun.");
      } else if (wordType == 2) {
        System.out.println("Enter a verb.");
      } else if (wordType == 3) {
        System.out.println("Enter an adjective");
      }
      Scanner askUserFillIn = new Scanner(System.in);
      String userFillIn = askUserFillIn.nextLine();
      if (i == 0) {
        firstLineMadLib = firstLineMadLib.replaceFirst("\\?", userFillIn);
      } else if (i == 1) {
        secondLineMadLib = secondLineMadLib.replaceFirst("\\?", userFillIn);
      } else {
        lastLineMadLib = lastLineMadLib.replaceFirst("\\?", userFillIn);
      }
    }
    
    this.clear();
    
    System.out.println("\nYOUR MADLIB:\n");
    System.out.println(firstLineMadLib);
    System.out.println(secondLineMadLib);
    System.out.println(lastLineMadLib + "\n\n");
      
  }
  
  public void clear() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }
}
