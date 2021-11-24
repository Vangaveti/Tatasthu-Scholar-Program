import java.util.*;
class calculator 
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number:");
      int m = sc.nextInt();
      int n = sc.nextInt();
      System.out.print("Enter the operator:");
      char c = sc.nextLine();
      swtich(c)
      {
        case "+" : System.out.print(m+n); 
          break;
        case "-" : System.out.print(m-n); 
          break;
        case "*" : System.out.print(m*n); 
          break;
       case "/" : System.out.print(m/n); 
          break;
      default: System.out.print("Wrong operator input");
      }
  }
}
