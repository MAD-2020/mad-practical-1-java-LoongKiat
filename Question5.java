import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    //System.out.print("Please enter an integar: ");
    int num = in.nextInt();
    int no; 
    int[] noArray = new int[num];
    for (int i = 0; i < num; i++){
      //System.out.print("Please enter an integar: ");
      no = in.nextInt();
      noArray[i] = no;
    }
    int maxCount = 0;
    int freqNo = noArray[0];
    int count = 0;
    Arrays.sort(noArray);
    int f = noArray.length;
    for(int i = 1; i < noArray.length; i++){
      if(noArray[i] == noArray[i - 1]){
        count ++;
      }
      else{
        if(count > maxCount){
          maxCount = count;
          freqNo = noArray[i-1];
        }
        count = 0;
      }
    }
  System.out.print(freqNo);
  }
}
