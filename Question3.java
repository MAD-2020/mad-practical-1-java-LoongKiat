import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter an integar: ");
    int num = in.nextInt();
    num = num * num;
    System.out.println("New integar: " + num);
  }
}
