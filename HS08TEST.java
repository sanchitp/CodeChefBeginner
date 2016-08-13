import java.util.*;


class HS08TEST{

	public static void main(String args[])
	{
		int cash;
		double balance;

		Scanner sc = new Scanner(System.in);

		cash = sc.nextInt();
		balance = sc.nextDouble();

		if(cash%5==0) // first condition tested
		{

			double amount = cash + 0.50;

			if(balance>=amount)
			{
				balance = balance - amount;
			}

		}

		System.out.format("%.2f",balance);
		System.out.println();
	}
}

// the System.out.format just works the same like the printf in C but it will not print the new line I guess
// so we can say %.2f in this and then solve it for the same
// let us see what we need to do now /n does not work in the java

