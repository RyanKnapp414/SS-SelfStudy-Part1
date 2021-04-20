/**
 * 
 */
package ss.self.jb.patterns;

/**
 * Printing Simple Pyramid Patterns
 * 
 * @author RyanKnapp
 *
 */
public class Patterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Patterns p = new Patterns();
		// Example 1
		System.out.println("Example 1:");
		p.leftTopPyramid(5);

		// Example 2
		System.out.println("Example 2:");
		p.leftBottomPyramid(5);

		// Example 3
		System.out.println("Example 3:");
		p.centerTopPyramid(5);

		// Example 4
		System.out.println("Example 4:");
		p.centerBottomPyramid(5);

	}

	// constructor
	public Patterns() {

	}

	// Left side justified pyramid starting from the top
	public void leftTopPyramid(int height) {

		int row, col;

		// creates rows from height parameter
		for (row = 0; row < height; row++) {

			// creates column width from amount of rows
			for (col = 0; col <= row; col++) {
				if (row < height - 1) {
					System.out.print("* ");
				} else {
					System.out.print("- - ");
				}

			}

			// makes new line for each row
			System.out.println();
		}
	}

	// Left side justified pyramid starting from the bottom
	public void leftBottomPyramid(int height) {

		int row, col;

		// creates rows from height parameter
		for (row = 0; row < height; row++) {

			// creates column width from amount of rows
			for (col = (height - row - 1); col >= 0; col--) {
				if (row > 0) {
					System.out.print("* ");
				} else {
					System.out.print("- - ");
				}

			}

			// makes new line for each row
			System.out.println();
		}
	}

	// center justified pyramid starting from the top
	public void centerTopPyramid(int height) {

		int row, col;

		// creates rows from height parameter
		for (row = 0; row < height; row++) {

			// creates spaces for the centering
			for (col = 0; col < height - row; col++) {

				System.out.print("  ");
			}
			// creates the pyramid pattern
			for (col = 0; col <= 2 * row; col++) {
				if (row < height - 1) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}

			}

			// makes new line for each row
			System.out.println();
		}
	}

	// center justified pyramid starting from the bottom
	public void centerBottomPyramid(int height) {

		int row, col;

		// creates rows from height parameter
		for (row = height; row >= 1; row--) {

			// creates spaces for the centering
			for (col = 0; col < height - row; col++) {

				System.out.print("  ");
			}
			// creates the left side pyramid pattern
			for (col = row; col <= 2 * row - 1; col++) {
				if (row < height) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}

			}
			// creates the right side pyramid pattern
			for (col = 0; col < row - 1; col++) {
				if (row < height) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}

			}

			// makes new line for each row
			System.out.println();
		}
	}

}
