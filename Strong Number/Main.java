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
        int m=1;
        for (int i=1;i<=r;++i)
          m=i*m;
        result=result+m;
        w=w/10;
      }
      if (result==n)
        System.out.println("Yes");
      else
        System.out.println("No");
      
        
	}
}