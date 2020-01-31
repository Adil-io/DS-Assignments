import java.util.Scanner;

public class patternV{
	static void printPattern(int n){
		int l=1,r=2;
		for(int i=0;i<n;i++){
			for(int j=n;j>0;j--){
				if(j<=i){
					System.out.print("  ");
				}
				else{
					System.out.print(j+" ");
				}					
			}
			for(int j=2;j<=n;j++){
				if(j<=i){
					System.out.print("  ");
				}
				else{
					System.out.print(j+" ");
				}	
			}
			System.out.println();
		
		}
	}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Pattern size (nXn): ");
		int n=sc.nextInt();
		printPattern(n);
	}
}