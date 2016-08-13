import java.util.Scanner;

class MUFFINS3{
	public static void main(String args[]) throws Exception{
//1.) take the number of testcases
//2.) Then start doing modulus from the number till last values till which they get the same value remaining i.e I think we should go till k/2 values in this
//3.) If the modulus given larger value then change it.. otherwise dont change anything.

int numtestcases;
long num;
long rem=-1,i=0;

Scanner sc = new Scanner(System.in);
numtestcases = sc.nextInt();

while(numtestcases>0)
{
	rem = -1;
	num = sc.nextLong();
	i = num;

long packsize=0;

	packsize = num/2 + 1 ;

	

System.out.println(packsize);


	numtestcases--;
}


	}
}

// okay according to the test case it is running
// lets check it if we have something else in this
// this should not give error as we are already done
// I think that this is mathematical and thus we need to find an answer to that
// and it will work in each case as it is working for this case where int equals two as well
