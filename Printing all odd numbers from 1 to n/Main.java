import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for (int g=1;g<=n;g=g+1)
        if(g%2!=0)
          System.out.println(g);
	}
}