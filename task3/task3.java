package task3;

public class task3 {
	
	public static void main(String[] args) {
		
		int[][] matrix = 
			{
					{  1,   2,   3,  4,  5},
					{  5,   7,   9,  2,  1},
					{  0,   9,   1,  8,  7},
					{  6,   3,   6,  6,  6},
					{ 99, 100,  -2,  3,  1}
			};
		
		outputMatrix(matrix);
		
		int minSecDiag = getMinSecDiag(matrix);
		System.out.println(minSecDiag);
	}
	
	public static int getMinSecDiag(int[][] matrix) {
		
		int size = matrix.length; // assume that matrix is NxN
		int min = matrix[0][size-1]; // get first el on sec diag as min
		
		// start with row at index 1 and column at index size-2 
		// since we define min at [0][size-1]
		for (int i = 1,j = size-2; i < size; ++i, --j) {
			
			if (i == j) {
				continue;
			}
			if (matrix[i][j] < min) { // find first min since < is used
				min = matrix[i][j];
			}
		}
		return min;
	}
	
	public static void outputMatrix(int[][] matrix) {
		System.out.println("------------------------------");
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------");
	}
}


