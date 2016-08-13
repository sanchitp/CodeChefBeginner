import java.util.*;
import java.io.*;


class TSORT{

		public static void main(String args[]) throws Exception
		{

			int numnumbers,num;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


			numnumbers = Integer.parseInt(br.readLine());

			int[] countarr = new int[1000001];
			
			for(int i=0;i<numnumbers;i++)
			{
				int val = Integer.parseInt(br.readLine());
				countarr[val]=countarr[val]+1;
				
			}

// maybe in order to read.. after that our program is taking a lot of time
		StringBuffer sb=new StringBuffer();

			for(int i=0;i<1000001;i++)
			{
				num = countarr[i];

				for(int k=0;k<num;k++)
				{
								sb.append(i).append("\n");

				}


			}
			System.out.println(sb);
		}



}

// thus we have tested the boundary value wrong in this case
