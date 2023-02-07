package BookPractice7array;

public class array {

	public static void main(String[] args) {
		int arr[] = { 23, 33, 43, 53, 63, 73 };

		System.out.print("相反順序輸出 ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		int sum = 0;
		System.out.print("總和 = ");
		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];

		}
		System.out.println(sum);

		int average = 0;
		int su = 0;

		System.out.print("平均 = ");
		for (int i = 0; i <= arr.length - 1; i++) {
			su += arr[i];
		}
		average = su / arr.length;
		System.out.print(average + " ");
	}

}
