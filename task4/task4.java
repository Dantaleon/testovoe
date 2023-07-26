package task4;

import java.util.ArrayList;

public class task4 {

	public static void main(String[] args) {
		
		int[][][] matrix = 
			{
				{
					{  1,   2,   3 },
					{  0,   9,   1 },
					{  6,   3,   6 },
				},
				{
					{  1,   2,   3 },
					{  0,   9,   1 },
					{  6,   3,   6 },
				},
				{
					{  1,   2,   3 },
					{  0,   9,   1 },
					{  6,   3,   6 },
				}
			};
		
		int prevMax = getPrevMaxFrom3DArrDiag(matrix);
		
		System.out.println(prevMax);
	}
	
	public static int getPrevMaxFrom3DArrDiag(int[][][] arr) {
		
		// top down view on points, 3rd dim in depth [y,x,z] = [row, col, dep]
		int[] startPoints = {
				0,                                0, 0,  // up left point start layer
				0,               arr[0][0].length-1, 0,  // up right point start layer
				arr[0].length-1,                  0, 0,  // down left point start layer
				arr[0].length-1, arr[0][0].length-1, 0}; // down right point start layer
		
		int[] endPoints = {
				arr[0].length-1, arr[0][0].length-1, arr.length-1,  // down right point end layer
				arr[0].length-1,                  0, arr.length-1,  // down left point end layer
				0,               arr[0][0].length-1, arr.length-1,  // up right point end layer
				0,                                0, arr.length-1}; // up left point end layer
			
		int[] signPoints = { // row (y), column (x), depth (z) increment multiplier
				+1, +1, +1,
				+1, -1, +1,
				-1, +1, +1,
				-1, -1, +1
		};
		
		// list to save max values from diags
		//ArrayList<Integer> maxList = new ArrayList<Integer>(); 
		
		int prevMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		int globalMax = Integer.MIN_VALUE;
		// use p for startPoints, endPoints and signPoints to switch diag
		for (int p = 0; p <= startPoints.length-3; p += 3) {
			
			//prevMax = max; // save previous max
			
			// calculate max from diag
			for (int x = startPoints[p+1], y = startPoints[p], z = startPoints[p+2];
					 x != endPoints[p+1] && y != endPoints[p] && z != endPoints[p+2];
					 x += 1 * signPoints[p+1], y += 1 * signPoints[p], z += 1 * signPoints[p+2]
				) 
			{
				if (arr[z][y][x] > max && prevMax != globalMax) {
					if (max > prevMax) prevMax = max;
					max = arr[z][y][x];
				}
			}
			
			// check last point since we checked all points != endPoint
			if (arr[endPoints[p+2]][endPoints[p]][endPoints[p+1]] > max) {
				if (max > prevMax && prevMax != globalMax) prevMax = max;
				max = arr[endPoints[p+2]][endPoints[p]][endPoints[p+1]];
			}
			globalMax = max;
		}
		
		
		return prevMax;
	}

}
