package BookPractice8;

public class ch8_22 {
	public static int add(int[] nums) {// nums代表陣列12345
		int sum = 0;// 總共
		for (int num : nums)// forEach
			sum += num;
		return sum;
	}

	public static int max(int[] nums) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}

		}
		return max;
	}

	public static int min(int[] nums) {
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	public static int avg(int[] nums) {
		int avg = 0;
		for (int i = 0; i < nums.length; i++) {
			avg += nums[i];
		}
		avg /= nums.length;
		return avg;
	}

	public static void main(String[] args) {
		System.out.println("總共" + add(new int[] { 1, 2, 3, 4, 5 }));// 直接新建匿名陣列，不占系統資源
		System.out.println("最大" + max(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println("最小" + min(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println("平均" + avg(new int[] { 1, 2, 3, 4, 5 }));
	}

}
