public class FindClosest
{
  public int findClosest(int[] input) {

    int diff = input[0]-input[1];
    for (int i=0;i<input.length-1;i++)
    {
      for(int j=i+1;j<input.length;j++)
      {
       if ((diff<0) && (input[i]-input[j]>0)&& (input[i]-input[j]<(-diff)))
         diff = input[i]-input[j];
       else if ((diff<0) && (input[i]-input[j]<0)&& (input[i]-input[j]>diff))
        diff = input[j]-input[i];
       else if ((diff>0) && (input[i]-input[j]>0)&& (input[i]-input[j]<diff))
         diff = input[i]-input[j];
       else if ((diff>0) && (input[i]-input[j]<0)&& (-(input[i]-input[j])<diff))
         diff = input[j]-input[i];
      }
    }
    return diff;
  }
}