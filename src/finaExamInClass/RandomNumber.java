package finaExamInClass;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nthSmallest = scanner.nextInt();

		Random r = new Random();
		int[] ranArr = new int[500];

		for (int i = 0; i < 500; i++) {

			ranArr[i] = r.nextInt(1000);
			System.out.println(ranArr[i]);

		}
		Arrays.sort(ranArr);

		System.out.println("Nth smallest Number is " + ranArr[nthSmallest]);
	}
}