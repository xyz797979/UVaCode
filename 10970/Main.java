import java.util.*;
import java.math.BigInteger;

class Main {
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		
		while( sc.hasNext() ) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			System.out.println( a * b - 1 );
		}
	}
}