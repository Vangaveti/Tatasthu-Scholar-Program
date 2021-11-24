import java.util.*;
class palindrome 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
		StringBuilder sb1 = new StringBuilder(s);
    if(sb1==sb.reverse())
    {
      System.out.print(true);
    }
    else{
      system.out.print(false);
    }
  }
}
