import java.util.*;

class CIELRCPT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numtestcases = sc.nextInt();
		while(numtestcases>0){

			int price = sc.nextInt();
			int items = 0;
			while(price!=0){
				int power = (int)(Math.log(price)/Math.log(2));
					if(power>11){
						price = price - 2048;
						items++;
					}
					else{
					price = price - (int)(Math.pow(2,power));
					items++;
				}
				}
				System.out.println(items);
				numtestcases--;
			}
		}
	}

	/* lesson learned : be attentive with the print statement */