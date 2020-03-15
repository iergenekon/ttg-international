public class RotateArrayByGivenNumber {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5, 6 };
		int B = 2;

		int[] newArray = rotate(A, B);

		for (int i : newArray) {
			System.out.print(i + " ");
		}
	}

	public static int[] rotate(int[] A, int B) {

		int length = A.length;
		int[] rotatedArray = new int[length];
		int j = B;

		for (int i = 0; i < length; i++) {

			if (length - B + i < length) {
				rotatedArray[length - B + i] = A[i];
			} else {
				rotatedArray[j - B] = A[i];
				j++;
			}
		}

		return rotatedArray;
	}
}
