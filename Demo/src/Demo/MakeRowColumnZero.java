package Demo;

public class MakeRowColumnZero {
	public static void printMultiArray(int array[][]) {
		for (int[] is : array) {
			for (int is2 : is) {
				System.out.print(is2 + " ");

			}
			System.out.println();
		}

	}

	
//	public static boolean[] checkRowCoordinateWithZero(int[][] array, int row) {
//		boolean[] rowWithZero = new boolean[row];
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[0].length; j++) {
//				if (array[i][j] == 0) {
//					rowWithZero[i] = true;
//					break;
//
//				}
//
//			}
//
//		}
//		return rowWithZero;
//
//	}
//
//	public static boolean[] checkColumnCoordinateWithZero(int[][] array, int column) {
//		boolean[] columnWithZero = new boolean[column];
//		for (int i = 0; i < array.length; i++) {
//			
//			for (int j = 0; j < array[0].length; j++) {
//				if (array[i][j] == 0) {
//					columnWithZero[j] = true;
//
//
//				}
//
//			}
//
//		}
//		return columnWithZero;
//
//	}
//	public static int[][] makeChangeInMatrix(int[][] array, boolean[] rowWithZero,boolean[] columnWithZero){
//		int[][] matrix=array;
//		for (int i = 0; i < rowWithZero.length; i++) {
//			if(rowWithZero[i]) {
//				for (int j = 0; j < columnWithZero.length; j++) {
//					matrix[i][j]=0;
//					
//				}
//			}
//			
//		}
//		for (int i = 0; i < matrix.length; i++) {
//			if(rowWithZero[i]) continue;
//			for (int j = 0; j < matrix[0].length; j++) {
//				if(columnWithZero[j]) {
//					matrix[i][j]=0;
//					
//				}
//				
//			}
//			
//		}
//		
//		return matrix;
//	}

//	public static int[][] makeRowColumnZero(int[][] array) {
//		int row = array.length;
//		int column = array[0].length;
//		boolean[] rowWithZero = checkRowCoordinateWithZero(array, row);
//		boolean[] columnWithZero = checkColumnCoordinateWithZero(array, column);
//		int[][] outputMatrix=makeChangeInMatrix(array,rowWithZero,columnWithZero);
//		return outputMatrix;
//	
//
//	}
//    public static int[][] makeRowColumnZero(int[][] array) {
//
//        int rows = array.length;
//        int cols = array[0].length;
//
//        boolean[] zeroRow = new boolean[rows];
//        boolean[] zeroCol = new boolean[cols];
//
//        
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (array[i][j] == 0) {
//                    zeroRow[i] = true;
//                    zeroCol[j] = true;
//                }
//            }
//        }
//
//        
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (zeroRow[i] || zeroCol[j]) {
//                    array[i][j] = 0;
//                }
//            }
//        }
//
//        return array;
//    }


	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int[][] inputMatrix = { { 1, 0 }, { 3, 4 } };
		System.out.println("Input Matrix is:");
		printMultiArray(inputMatrix);

		//int[][] outputMatrix=makeRowColumnZero(inputMatrix);
		//printMultiArray(outputMatrix);

	}

}
