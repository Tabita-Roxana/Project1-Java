public class FindMax2
{
  public int findMax2(int[] input) {
    int max = input[0];
    for(int i=1;i<input.length; i++)
    {
      if(input[i]>max)
      {
        max = input[i];
      }
    }
    return max;
  }
}
