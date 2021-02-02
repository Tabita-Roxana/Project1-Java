import java.util.Scanner;
public class DecToBin
{
  public static String decToBinary(int n)

  {

    // We initialise an output as a string
    String binaryNum = "";

    // We throw an exception if there is an illegal input
    if(n<0) throw new IllegalArgumentException();

    int q,r;
    String str = "";

    do {
      q=n/2;
      r=n%2;
      str = str +r;
      n=q;
    }
    while (q!=0);

    for(int i=str.length()-1;i>=0;i--)
      binaryNum = binaryNum+ str.charAt(i);

    return binaryNum;
  }
  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("Type input:");
      Scanner in = new Scanner(System.in);
      int read = in.nextInt();
      System.out.println(decToBinary(read));
      System.out.println();
    }
  }
}

