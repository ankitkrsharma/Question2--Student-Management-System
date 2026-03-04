package Demo;

//import jdk.swing.interop.SwingInterOpUtils;

class CalculatorVar {
//
//    static int add(int... numbers) {
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//			sum+=numbers[i];
//		}
//        System.out.println(numbers.length);
//
//        return sum;
//    }
//
//	public static void printArray(Object[]... array) {
//		// System.out.println(array[0][1]);
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
//
//			}
//			System.out.println();
//		}
//	}
//
//	static int noOFElement(boolean[][] array) {
//		int count = 0;
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				count++;
//
//			}
//
//		}
//		return count;
////	}
//	static void checkColumn(boolean[][] array) {
//		for (int i = 0; i < array.length; i++) {
//			if (array[i].length > 1) {
//				System.out.println("Not a colmn matric");
//				return;
//				
//			}
//
//		}
//		System.out.println("It is a column matric");
//	}
	static void checkColumn(boolean[][] array) {

	   
	    if (array == null) {
	        System.out.println("Invalid matrix: null reference");
	        return;
	    }

	    
	    if (array.length == 0) {
	        System.out.println("Invalid matrix: empty matrix");
	        return;
	    }

	    
	    for (int i = 0; i < array.length; i++) {

	        
	        if (array[i] == null) {
	            System.out.println("Invalid matrix: null row at index " + i);
	            return;
	        }

	        
	        if (array[i].length != 1) {
	            System.out.println("Not a column matrix");
	            return;
	        }
	    }

	    
	    System.out.println("It is a column matrix");
	}
	public  static void name() {
		
	}

	public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 0}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] zeroPos = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroPos[i][j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroPos[i][j]) {

                    for (int k = 0; k < cols; k++) {
                        matrix[i][k] = 0;
                    }

                    for (int k = 0; k < rows; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
