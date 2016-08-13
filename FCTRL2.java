import java.util.*;

class FCTRL2{

	public static void main(String args[])
	{
		// take the value and give its result
		int numtestcases;
		long fact=1;
		int num;
		Scanner sc = new Scanner(System.in);

		numtestcases = sc.nextInt();

		while(numtestcases>0)
		{
			fact = 1;

			num = sc.nextInt();


			while(num>0)
			{
				fact = fact * num;
				num--;
			}
// but this is it.. i.e this is the problem that we have faced in the factorial and we should remember this one
// how did we solve this question of the factorial of a number i.e 100
// yes it is not giving the correct answer even when the value reaches 21 at that point only



			System.out.println(fact);
			numtestcases--;
		}

	}



}