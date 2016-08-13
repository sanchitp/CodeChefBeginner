import java.util.*;

class INTEST{
	

public static void main(String args[]){
	long n,k,t;

	long count = 0;
	Scanner sc = new Scanner(System.in);

	n = sc.nextLong();
	k = sc.nextLong();

	while(n>0)
	{
		t = sc.nextInt();
		if(t%k==0)
		{
			count++;
		}

		n--;
	}

System.out.println(count);
}
}