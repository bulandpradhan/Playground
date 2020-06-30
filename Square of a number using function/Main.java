import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int sq=n*n;
    return sq;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sod=square(n);
    int t=sod;
    System.out.print(t);
  }
}