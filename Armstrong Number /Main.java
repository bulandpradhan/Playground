import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int result=0;
      int w=n;
      while (w>0)
      {
        int r=w%10;
        result=result+r*r*r;
        w=w/10;
      }
      if (result==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
          
	}
}