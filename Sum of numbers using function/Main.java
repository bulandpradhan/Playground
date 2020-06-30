import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    int sum=0;
    for (int r=1;r<=n;r++)
    {
      sum=sum+r;
    }
    return sum;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sod = sum(n);
    n=sod;
    System.out.print(n);
  }
}