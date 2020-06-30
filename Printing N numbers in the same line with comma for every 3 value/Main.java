import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for (int s=1;s<=n;s++){
      System.out.print(s);
      if ((s%3==0) && (s!=n))
        System.out.print(",");
    }
  }
}