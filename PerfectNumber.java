import java.util.Scanner;
class PerfectNumber{
	public static void main (String args[]){
		int sum = 0;
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter number to be checked");
		int N = obj.nextInt();
		for(int i = 1; i <= (N-1); i++){
			if(N%i == 0){
				sum = sum+i;			}
		}
		if(sum == N)
		System.out.println("Perfect Number");
		else
		System.out.println("Not a Perfect Number");
	}
}
