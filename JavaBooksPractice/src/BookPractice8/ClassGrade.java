package BookPractice8;

public class ClassGrade {
	int score;
	char grade;

	char grade() {
		if (score >= 90) {
			grade = 'a';
		} else if (score < 90 && score >= 80) {
			grade = 'b';
		} else if (score < 80 && score >= 70) {
			grade = 'c';
		} else if (score < 70 && score >= 60) {
			grade = 'd';
		} else {
			grade = 'f';
		}
		return grade;
	}

	public static void main(String[] args) {

		ClassGrade classgrade = new ClassGrade();
		classgrade.score=76;
		System.out.println("請輸入分數：" + classgrade.score);
		System.out.println(classgrade.grade());
	}

}
