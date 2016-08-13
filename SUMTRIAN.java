import java.util.Scanner;

class SUMTRIAN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numtestcases = sc.nextInt();

		while(numtestcases>0){

			int size = sc.nextInt();
			int max = -1;
			int[][] matrix = new int[size][size];

			for(int i=0;i<size;i++){
				for(int j=0;j<i+1;j++){
					matrix[i][j] = sc.nextInt(); 
				}
			}
			for(int i=0;i<size;i++){
				for(int j=0;j<i+1;j++){
					try{
						matrix[i][j] = Math.max(matrix[i][j]+matrix[i-1][j-1],matrix[i][j]+matrix[i-1][j]);
					}
					catch(Exception e){
						if(i!=0 && j==0)
							matrix[i][j] = matrix[i][j] + matrix[i-1][j];
					}
					if(matrix[i][j]>max)
						max=matrix[i][j];
				}
			}
			System.out.println(max);
			numtestcases--;
		}
	}
}

/* when array index out of bounds come, then try catch can be used to a very good place */ 
/* we can make use of the try catch bounds to get a good catch on the array index out of bounds, and when this happens we can make use of the 
that with the help of something else*/
