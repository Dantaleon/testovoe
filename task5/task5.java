package task5;

public class task5 {

	public static void main(String[] args) {
		
		int[][] matrix = createMatrix(4);
		outputMatrix(matrix);
		
		matrix = createMatrix(6);
		outputMatrix(matrix);
		
		matrix = createMatrix(8);
		outputMatrix(matrix);
		
	}
	
	public static int[][] createMatrix(int size) {
		
		int[][] matrix = new int[size][size];
		
		int numCount = size/2;  // number of different numbers 0, 1 ...
		int borderNum = numCount-1; // border for 4x4 should be 4/2 - 1 = 1
		
		// changing border num from outside to inside
		// start, end for row and column index
		for (int c = borderNum, start = 0, end = size-1; c >= 0; --c, ++start, --end) { 
			
			// filling square from start to finish with spec num
			for (int i = start; i <= end; ++i) {
				for (int j = start; j <= end; ++j) {
					matrix[i][j] = c;
				}
			}
		}
		
		
		return matrix;
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
