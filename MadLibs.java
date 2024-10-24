import java.util.Scanner;

public class MadLib {
  String firstLineMadLib;
  int firstLineWordType;
  
  String secondLineMadLib;
  int secondLineWordType;
  
  String lastLineMadLib;
  int lastLineWordType;
  
  public void create() {
    for (int lineNumber = 1; lineNumber <= 3; lineNumber++) {
      if (lineNumber == 1) {
        System.out.println("Enter the first line of your MadLib, using ? for the missing word.");
      } else if (lineNumber == 2) {
        System.out.println("Enter the second line of your MadLib, using ? for the missing word.");
      } else {
        System.out.println("Enter the last line of your MadLib, using ? for the missing word.");
      }
      
      Scanner askLineMadLib = new Scanner(System.in);
        
      if (lineNumber == 1) {
        firstLineMadLib = askLineMadLib.nextLine();
      } else if (lineNumber == 2) {
        secondLineMadLib = askLineMadLib.nextLine();
      } else {
        lastLineMadLib = askLineMadLib.nextLine();
      }
    
      System.out.println("Indicate whether the missing word is a \n1: Noun\n2: Verb\n3: Adjective");
      Scanner askWordType = new Scanner(System.in);
      
      if (lineNumber == 1) {
        firstLineWordType = askWordType.nextInt();
      } else if (lineNumber == 2) {
        secondLineWordType = askWordType.nextInt();
      } else {
        lastLineWordType = askWordType.nextInt();
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
