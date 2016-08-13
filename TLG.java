import java.util.*;

class TLG{
	public static void main(String args[]) throws Exception{

		int numtestcases;
		int lead1=0,lead2=0,score1,score2,diff,tsum1=0,tsum2=0;

		Scanner sc = new Scanner(System.in);

		numtestcases = sc.nextInt();

		while(numtestcases>0)
		{
			score1 = sc.nextInt();
			score2 = sc.nextInt();

			tsum1 = tsum1 + score1;
			tsum2 = tsum2 + score2;

			if(tsum1>tsum2)
			{
				diff = tsum1-tsum2;
				if(diff>lead1)
				{
					lead1=diff;
				}
			}

			else
			{
				diff = tsum2-tsum1;
				if(diff>lead2)
				{
					lead2=diff;
				}
			}


			numtestcases--;
		}

		if(lead1>lead2)
			{
				System.out.println("1 "+lead1);
			}
			else
			{
				System.out.println("2 " + lead2);
			}


	}
}