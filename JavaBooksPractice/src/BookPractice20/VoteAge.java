package BookPractice20;

public class VoteAge {
	public static void age(int age) {
		if (age < 18) {
			System.out.println(age + "的年齡太年輕");
			throw new StringIndexOutOfBoundsException("年齡不符合規定");//小於18歲抛出這個異常
		} else {

			System.out.println(age + "的年齡歡迎投票");
		}

	}

	public static void main(String[] args) {
		int[] ages = { 12, 19, 67 };
		for (int i = 0; i < ages.length; i++) {
			try {
				age(ages[i]);
			} catch (StringIndexOutOfBoundsException e) { //抓到這個異常並印出
				System.out.println("年齡不符合規定"+e);
				e.printStackTrace();//知道哪一行的異常

			}
		}

	}
}
