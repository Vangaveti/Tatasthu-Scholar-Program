import java.util.*;
class fibbonaci
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    a[0] = 0;
    a[1] = 1;
    for(int i=2;i<=n;i++)
    {
      a[i] = a[i-1]+a[i-2];
    }
    for(int j=0;j<n;j++)
    {
      System.out.print(a[j]);
    }

  }
}
