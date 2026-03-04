package Demo;

public class MatrixCheck {
	public static boolean checkRowMatrix(int[][] array) {
		return array.length == 1;
	}

	public static boolean checkColumnMatrix(int[][] array) {
		return array[0].length == 1;
	}

	public static boolean checkSquareMatrix(int array[][]) {
		int column = array.length;
		int row = array[0].length;
		return row == column;

	}

	public static boolean checkRectangularMatrix(int array[][]) {
		int column = array.length;
		int row = array[0].length;
		return row != column;

	}

	public static boolean checkSingletonMatrix(int array[][]) {
		int column = array.length;
		int row = array[0].length;

		return column == 1 && row == 1;

	}

	public static boolean checkZeroMatrix(int array[][]) {
		for (int[] is : array) {
			for (int is2 : is) {
				if (is2 != 0)
					return false;

			}

		}

		return true;

	}

	public static boolean checkIdentityMatrix(int array[][]) {
		if (checkScalarMatrix(array)) {
			if (array[0][0] == 1)
				return true;

		}

		return false;

	}

	public static boolean checkDiagonalMatrix(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i != j) {
					if (array[i][j] != 0) {
						return false;
					}
				}

			}

		}
		return true;

	}

	public static boolean checkScalarMatrix(int array[][]) {
		int num = array[0][0];
		if (checkSquareMatrix(array)) {
			if (checkDiagonalMatrix(array)) {
				for (int i = 0; i < array.length; i++) {
					if (array[i][i] != num)
						return false;
				}
				return true;
			}
			return false;
		}

		return false;

	}

	public static void printMultiArray(int array[][]) {
		for (int[] is : array) {
			for (int is2 : is) {
				System.out.print(is2 + " ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2 }, { 3, 4 } };

		printMultiArray(array);

		int[][] square = { { 1, 2 }, { 3, 4 } };

		int[][] rectangular = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] singleton = { { 5 } };

		int[][] zero = { { 0, 0 }, { 0, 0 } };

		int[][] diagonal = { { 3, 0, 0 }, { 0, 3, 0 }, { 0, 0, 3 } };

		int[][] scalar = { { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 } };

		int[][] identity = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		int[][] column = { { 1 }, { 0 }, { 0 } };

		int[][] row = { { 1, 0, 0 } };

		try {
			validInput(square);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return;
		}

		System.out.println("Square Matrix:");
		printMultiArray(square);
		System.out.println("Square? " + checkSquareMatrix(square));
		System.out.println("Rectangular? " + checkRectangularMatrix(square));
		System.out.println();

		System.out.println("Rectangular Matrix:");
		printMultiArray(rectangular);
		System.out.println("Rectangular? " + checkRectangularMatrix(rectangular));
		System.out.println();

		System.out.println("Singleton Matrix:");
		printMultiArray(singleton);
		System.out.println("Singleton? " + checkSingletonMatrix(singleton));
		System.out.println();

		System.out.println("Zero Matrix:");
		printMultiArray(zero);
		System.out.println("Zero? " + checkZeroMatrix(zero));
		System.out.println();

		System.out.println("Diagonal Matrix:");
		printMultiArray(diagonal);
		System.out.println("Diagonal? " + checkDiagonalMatrix(diagonal));
		System.out.println();
		System.out.println("Scalar Matrix:");
		printMultiArray(scalar);
		System.out.println("Scalar? " + checkScalarMatrix(scalar));
		System.out.println();
		System.out.println("Identity Matrix:");
		printMultiArray(identity);
		System.out.println("Identity? " + checkIdentityMatrix(identity));
		System.out.println();
		System.out.println("Column Matrix:");
		printMultiArray(column);
		System.out.println("Column? " + checkColumnMatrix(identity));
		System.out.println();
		System.out.println("Row Matrix:");
		printMultiArray(row);
		System.out.println("Row? " + checkRowMatrix(identity));

	}

	public static void validInput(int[][] array) {
		if (array == null) {
			throw new IllegalArgumentException("Matrix is null");
		}

		if (array.length == 0 || array[0].length == 0) {
			throw new IllegalArgumentException("Matrix is empty");
		}

		int cols = array[0].length;
		for (int i = 1; i < array.length; i++) {
			if (array[i].length != cols) {
				throw new IllegalArgumentException("Jagged matrix not allowed");
			}
		}
	}

}
