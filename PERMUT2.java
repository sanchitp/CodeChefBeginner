import java.util.*;

class PERMUT2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int arrSize = sc.nextInt();
			if(arrSize==0){
				break;
			}
			int[] arr = new int[arrSize+1];
			for(int i=1;i<=arrSize;i++){
				arr[i]=sc.nextInt();
			}
			boolean isAmbigous=true; 
			for(int i=1;i<=arrSize;i++){
				if(arr[arr[i]]!=i){ 
					isAmbigous = false;
					break;
				}
			}			
			if(isAmbigous && arrSize!=0)
				System.out.println("ambiguous");
			else if(!isAmbigous && arrSize!=0)
				System.out.println("not ambiguous");     
			}		
	}
}

/* Mistake : did not break the question when zero comes, as given in question break it when zero comes.

Lesson : Thorough reading of question is a must. NEVER HURRY */
