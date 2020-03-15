import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingElementsBetweenTwoArrays {

	public static void main(String[] args) {

		Integer[] firstArray = { 4, 12, 9, 5, 6, 11 };
		Integer[] secondArray = { 4, 9, 12, 6 };

		System.out.println(findMissing(firstArray, secondArray));
	}

	public static ArrayList<Integer> findMissing(Integer[] firstArray, Integer[] secondArray) {

		ArrayList<Integer> firstList = new ArrayList<Integer>(Arrays.asList(firstArray));
		ArrayList<Integer> secondList = new ArrayList<Integer>(Arrays.asList(secondArray));

		firstList.removeAll(secondList);

		return firstList;
	}
}
