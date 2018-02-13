package labs.comp3111.ust.hk;

public class Lab1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += arr[i];
		}
		System.out.println(String.format("Sum of the numbers is %d", sum));

		int multiple = 1;
		for (int i = 0; i < 10; i++) {
			multiple *= arr[i];
		}
		System.out.println(String.format("Multiple of the numbers is %d", multiple));
		int min = 0;
		for (int i = 0; i <= 10; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int max = 0;
		for (int i = 0; i <= 10; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(String.format("Min = %d", min));
		System.out.println(String.format("Max = %d", max));
	}
}
