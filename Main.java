import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a_size = sc.nextInt();
		
		int[] a = new int[a_size];
		
		for( int i = 0; i < a_size; i++ ) {
			a[i] = sc.nextInt();
		}
		
		int b_size = sc.nextInt();
		
		int[] b = new int[b_size];
		
		for( int i = 0; i < b_size; i++ ) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a); //test
		Arrays.sort(b);
		
		int i = 0;
		int j = 0;
		
		while ( i < a_size && j < b_size ) {
			
			if ( a[i] < b[j] ) {
				i++;
			} else if ( a[i] > b[j] ){
				j++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
			
		}
		
		
		sc.close();

	}

}
