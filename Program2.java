import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for(int i=1;i<n*2;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}

	}

}
