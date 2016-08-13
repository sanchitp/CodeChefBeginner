
import java.util.*;

class Test{

	public static void main(String args[]){

		int num;
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			num = sc.nextInt();
			if(num!=42)
			{
				System.out.println(num);
			}
			else
			{
				break;
			}

		}


	}


}