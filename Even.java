import java.util.Scanner;
class Even{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    if(x == 0)
      System.out.println("Zero");
    else if(x>0)
      System.out.println("Positive");
    else
      System.out.println("Negative");
  }
}
