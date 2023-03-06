import java.util.*;

class Fibanacci
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int n , firstTerm = 0, secondTerm = 1;
        System.out.println("Enter the number of terms n");
        n=sc.nextInt();
    
        for (int i = 1; i <= n; ++i) {
          System.out.print(firstTerm + ", ");
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
        }
	}
}