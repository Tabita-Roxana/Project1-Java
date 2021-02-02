public class FindMin2
{
  public int findMin2(int[] input) {
    int min = input[0];
    for(int i=1;i<input.length; i++)
    {
      if(input[i]<min)
      {
        min = input[i];
      }
    }
    return min;
  }
}
