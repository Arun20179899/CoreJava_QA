package arrays;

public class Sample {
	public static void main(String[] args) {
		int[] arr = { 10, 45, 56, 10, 45, 56, 78, 45, 10, 20, 56, 64, 45, 20 };
		arr[10] = 0;
		arr[45] = 0;
		arr[56] = 0;
		arr[78] = 0;
		arr[20] = 0;
		arr[64] = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 10) {
				arr[10]++;
			} else if (arr[i] == 45) {
				arr[45]++;

			} else if (arr[i] == 56) {
				arr[56]++;
			} else if (arr[i] == 78) {
				arr[78]++;
			} else if (arr[i] == 20) {
				arr[20]++;
			} else if (arr[i] == 64) {
				arr[64]++;

			}
		}
	}
}
