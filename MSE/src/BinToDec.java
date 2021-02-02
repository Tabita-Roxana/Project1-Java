import java.util.Scanner;

public class BinToDec
{
  public static int binToDecimal(int[] input)
  {
    // We initialise an output as an integer
    int result = 0;
    int pow =1;
    for(int i=input.length-1;i>=0 ;i--)
    {
      result= result+input[i]*pow;
      pow = pow*2;
    }

    return result;
  }
  public static void main(String[] args)
  {

      while (true)
      {
        System.out.println("Type input:");
        Scanner in = new Scanner(System.in);
        String read = in.nextLine();

        int[] input = new int[read.length()];
        for (int i = 0; i < read.length(); i++)
        {
          input[i] = Integer.parseInt(""+ read.charAt(i));
        }

        System.out.println(binToDecimal(input));
        System.out.println();
      }

  }
}
