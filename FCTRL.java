import java.util.*;
import java.lang.*;

class FCTRL{

			public static void main(String args[]){

				long numtestcases;
				long num;

				Scanner sc = new Scanner(System.in);
				numtestcases =sc.nextLong();

							while(numtestcases>0)
						{
								num = sc.nextLong();
								long count=0;
								long k=0;
							
										while(Math.pow(5,k+1)<=num)
										{
												long powval = (long)Math.pow(5,k+1);
												
												long div;
												div = num/powval;
												count = count+div;  // this is it that is we were finding the
											k++;
												
										}
								
							System.out.println(count);

							numtestcases--;
						}
			}
}



// yes we are doing something wrong and that something which is wrong in this case is that
// we need to solve what and when and why the values are getting incremented and we need to solve in this case why it is getting incremented

// check the values.. i know i need to do dry run in this case
// what did i do in this case is anyways we will do modulus instead of that just multiply and check how many times we do that

// first we were finding the each and every number and dividing it
// then we dcreased it and then just tried to find how many times we can multiply and loop it
// but that looping can also be decreased by just taking the div in this which is same and much much efficient
