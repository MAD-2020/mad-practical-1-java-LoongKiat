import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter an integar: ");
    int num = in.nextInt();
    while(num != 0){
      for(int i = 0; i < num ; i++){
        System.out.print("*");
      }
      System.out.println();
      num -= 1;
    }
  }
}
