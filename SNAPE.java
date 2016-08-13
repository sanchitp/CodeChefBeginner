import java.util.*;

class SNAPE{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numtestcases = sc.nextInt();
		while(numtestcases>0){
			int base = sc.nextInt();
			int left = sc.nextInt();

			float cMin = (float)Math.sqrt((left*left)-(base*base));
			float cMax = (float)Math.sqrt((left*left)+(base*base));
			System.out.println(cMin + " " + cMax);


			numtestcases--;
		}
	}
}