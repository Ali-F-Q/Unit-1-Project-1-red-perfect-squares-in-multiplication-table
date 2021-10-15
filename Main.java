import java.util.Scanner;
import java.lang.Math;

class Main {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static void main(String[] args) {
    Scanner rip = new Scanner(System.in);

    System.out.print("How many rows: ");
    int rows = rip.nextInt();
    System.out.print("How many columns: ");
    int columns = rip.nextInt();
    int[][] multi = new int[rows][columns];
    
    System.out.println();
    System.out.println("Multiplication Table");
    System.out.print("|");
    for(int x = 0;x < columns*5-1;x++){
        System.out.print("-");
    }
    System.out.println("|");
    

    for(int i = 1;i < rows+1;i++){
      System.out.print("|");

      //Calculation
      for(int y = 1;y < columns+1;y++){
        multi[i-1][y-1] = i * y;
        int sqrt = (int) Math.sqrt(multi[i-1][y-1]);

        if(sqrt*sqrt == (int) multi[i-1][y-1]){
          System.out.print(ANSI_RED + multi[i-1][y-1] + ANSI_RESET);
          System.out.printf("%4s","|");
        }
        else{
          System.out.printf("%-4d%s",multi[i-1][y-1],"|");
        }
      }

      System.out.println();
      System.out.print("|");
      for(int x = 0;x < columns*5-1;x++){
      System.out.print("-");
      }
      System.out.println("|");
    }
  }
}