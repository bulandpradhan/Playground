import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int g=1;
      System.out.println(g);
      for (int i=1;i<=n-1;i=i+1)
      {
        g=g+2;
        System.out.println(g);
      }
	}
}