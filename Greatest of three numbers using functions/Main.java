import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result=gratest(n1,n2);
      System.out.print(gratest(result,n3));
    }
  public static int gratest(int num1,int num2)
  {
    int max=0;
    if (num1>num2)
    {
      max=num1;
    }
    else
    {
      max=num2;
    }
    return max;
    
	}
}